package id.ac.unikom.codelabs.economictrends.main.home;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import id.ac.unikom.codelabs.economictrends.R;
import id.ac.unikom.codelabs.economictrends.main.home.eksporimporsummary.EksporImporSumaryFragment;
import id.ac.unikom.codelabs.economictrends.main.home.hargakomoditisummary.HargaKomoditiSumaryFragment;
import id.ac.unikom.codelabs.economictrends.main.home.inflasisummary.InflasiSumaryFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    @BindView(R.id.home_bottomnavigation)
    BottomNavigationView bottomNavigationView;
    @BindView(R.id.home_framelayout_content)
    FrameLayout frameLayout;

    Unbinder unbinder;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        unbinder = ButterKnife.bind(this,view);

        if (savedInstanceState == null) {
            Fragment fragment = null;
            Class fragmentClass = null;
            fragmentClass = HargaKomoditiSumaryFragment.class;
            try {
                fragment = (Fragment) fragmentClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }

            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.home_framelayout_content, fragment).commit();
        }

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                Fragment fragment = null;
                Class fragmentClass = null;

                switch (id) {
                    case R.id.action_hargakomoditi:
                        fragmentClass = HargaKomoditiSumaryFragment.class;
                        break;
                    case R.id.action_eksporimpor:
                        fragmentClass = EksporImporSumaryFragment.class;
                        break;
                    case R.id.action_inflation:
                        fragmentClass = InflasiSumaryFragment.class;
                        break;
                }

                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                    FragmentManager fragmentManager = getFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.home_framelayout_content, fragment).commit();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return false;
            }
        });
        return view;
    }

}
