package id.ac.unikom.codelabs.economictrends.main.hargakomoditi;

import id.ac.unikom.codelabs.economictrends.BasePresenter;
import id.ac.unikom.codelabs.economictrends.BaseView;
import id.ac.unikom.codelabs.economictrends.data.HargaKomoditiDao;

/**
 * Created by codelabsunikom on 6/14/17.
 */

public class HargaKomoditiContract {
    interface View extends BaseView {
        void showProgress();

        void hideProgress();

        void showErrorMessage(String message);

        void showHargaKomoditi(HargaKomoditiDao.DataBeanX hargaDataBeanX);
    }

    interface Presenter extends BasePresenter<View> {
        void loadHargaKomoditi(String service, String tahun,String bulan);
    }
}
