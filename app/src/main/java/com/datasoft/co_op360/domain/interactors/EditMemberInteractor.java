package com.datasoft.co_op360.domain.interactors;

import com.datasoft.co_op360.domain.interactors.base.Interactor;
import com.datasoft.co_op360.domain.model.Member;

/**
 * Created by dmilicic on 12/26/15.
 */
public interface EditMemberInteractor extends Interactor {

    interface Callback {

        void onMemberUpdated(Member Member);
    }
}
