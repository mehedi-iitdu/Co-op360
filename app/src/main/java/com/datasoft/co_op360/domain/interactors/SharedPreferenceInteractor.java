package com.datasoft.co_op360.domain.interactors;

/**
 * Created by mehedi on 6/3/17.
 */

public interface SharedPreferenceInteractor {

    interface Callback {

        void onPreferenceSaved();
    }
}
