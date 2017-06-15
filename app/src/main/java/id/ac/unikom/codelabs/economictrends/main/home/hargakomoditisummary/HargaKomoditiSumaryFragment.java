package id.ac.unikom.codelabs.economictrends.main.home.hargakomoditisummary;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import id.ac.unikom.codelabs.economictrends.R;
import id.ac.unikom.codelabs.economictrends.data.HargaKomoditiDao;

/**
 * A simple {@link Fragment} subclass.
 */
public class HargaKomoditiSumaryFragment extends Fragment implements HargaKomoditiSumaryAdapter.HargaKomoditiItemListener {

    @BindView(R.id.hargakomoditi_recycler)
    RecyclerView recHargaKomoditi;
    HargaKomoditiSumaryAdapter hargaKomoditiAdapter;

    Unbinder unbinder;

    public HargaKomoditiSumaryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_harga_komoditi_summary, container, false);
        unbinder = ButterKnife.bind(this,view);
        setupRecyclerView();
        return view;
    }

    private void setupRecyclerView() {
        recHargaKomoditi.setLayoutManager(new LinearLayoutManager(getContext()) {
            @Override
            public RecyclerView.LayoutParams generateDefaultLayoutParams() {
                return new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
            }
        });

        hargaKomoditiAdapter = new HargaKomoditiSumaryAdapter(getContext(), new ArrayList<HargaKomoditiDao.DataBeanX>(), this);
        recHargaKomoditi.setAdapter(hargaKomoditiAdapter);
    }

}
