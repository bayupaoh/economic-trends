package id.ac.unikom.codelabs.economictrends.main;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.ac.unikom.codelabs.economictrends.R;
import id.ac.unikom.codelabs.economictrends.main.eksporimpor.EksporImporFragment;
import id.ac.unikom.codelabs.economictrends.main.home.HomeFragment;
import id.ac.unikom.codelabs.economictrends.main.home.hargakomoditisummary.HargaKomoditiSumaryFragment;
import id.ac.unikom.codelabs.economictrends.main.indikatorekonomi.IndikatorEkonomiFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.main_nav)
    NavigationView navigationView;
    @BindView(R.id.main_drawer)
    DrawerLayout drawerLayout;
    @BindView(R.id.main_toolbar)
    Toolbar toolbar;
    @BindView(R.id.main_framelayout_content)
    FrameLayout frameLayout;

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        setupToolbar();
        initHeaderView();

        if (savedInstanceState == null) {
            Fragment fragment = null;
            Class fragmentClass = null;
            fragmentClass = HomeFragment.class;
            try {
                fragment = (Fragment) fragmentClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }

            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.main_framelayout_content, fragment).commit();
        }

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void initHeaderView() {

    }

    private void setupToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Economic Trends");
        getSupportActionBar().setSubtitle("Harga Kebutuhan Pokok");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        Fragment fragment = null;
        Class fragmentClass = null;

        switch (id) {
            case R.id.main_nav_komoditi:
                fragmentClass = HomeFragment.class;
                getSupportActionBar().setSubtitle(item.getTitle());
                break;
            case R.id.main_nav_ekspor_impor:
                fragmentClass = EksporImporFragment.class;
                getSupportActionBar().setSubtitle(item.getTitle());
                break;
            case R.id.main_nav_indikator_ekonomi:
                fragmentClass = IndikatorEkonomiFragment.class;
                getSupportActionBar().setSubtitle(item.getTitle());
                break;
        }

        try {
            fragment = (Fragment) fragmentClass.newInstance();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.main_framelayout_content, fragment).commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }
}
