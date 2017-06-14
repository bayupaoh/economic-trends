package id.ac.unikom.codelabs.economictrends;

import android.content.Context;

/**
 * Created by codelabsunikom on 6/14/17.
 */

public interface BaseView {
    Context getContext();

    void onAttachView();

    void onDetachView();
}
