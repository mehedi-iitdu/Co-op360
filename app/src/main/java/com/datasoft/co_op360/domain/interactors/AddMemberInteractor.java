package com.datasoft.co_op360.domain.interactors;


import com.datasoft.co_op360.domain.interactors.base.Interactor;

/**
 * Created by dmilicic on 12/23/15.
 */
public interface AddMemberInteractor extends Interactor {

    interface Callback {
        void onMemberAdded();
    }
}
