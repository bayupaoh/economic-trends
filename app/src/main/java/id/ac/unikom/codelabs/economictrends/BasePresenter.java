package id.ac.unikom.codelabs.economictrends;

/**
 * Created by codelabsunikom on 6/14/17.
 */

public interface BasePresenter<T extends BaseView> {
    void onAttach(T view);

    void onDetach();
}
