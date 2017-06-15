package id.ac.unikom.codelabs.economictrends.main.home.hargakomoditisummary;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.ac.unikom.codelabs.economictrends.R;
import id.ac.unikom.codelabs.economictrends.data.HargaKomoditiDao;

/**
 * Created by codelabsunikom on 6/14/17.
 */

public class HargaKomoditiSumaryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<HargaKomoditiDao.DataBeanX> haDataBeanX;
    private HargaKomoditiSumaryAdapter.HargaKomoditiItemListener hargaKomoditiItemListener;

    public HargaKomoditiSumaryAdapter(Context context, List<HargaKomoditiDao.DataBeanX> haDataBeanX, HargaKomoditiItemListener hargaKomoditiItemListener) {
        this.context = context;
        this.haDataBeanX = haDataBeanX;
        this.hargaKomoditiItemListener = hargaKomoditiItemListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.fragment_harga_komoditi_summary_row_item, null);
        return new HargaKomoditiSumaryAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public interface HargaKomoditiItemListener {

    }


    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.item_komoditi_harga)
        TextView txtHarga;
        @BindView(R.id.item_komoditi_img)
        ImageView imgKomoditi;
        @BindView(R.id.item_komoditi_status)
        ImageView imgStatus;
        @BindView(R.id.item_komoditi_nama)
        TextView txtNama;
        @BindView(R.id.item_komoditi_status_harga)
        TextView txtStatusHarga;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
