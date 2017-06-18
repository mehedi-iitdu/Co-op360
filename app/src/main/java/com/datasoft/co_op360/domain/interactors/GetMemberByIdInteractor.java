package com.datasoft.co_op360.domain.interactors;

import com.datasoft.co_op360.domain.interactors.base.Interactor;
import com.datasoft.co_op360.domain.model.Member;

/**
 * Created by dmilicic on 12/27/15.
 */
public interface GetMemberByIdInteractor extends Interactor {

    interface Callback {
        void onMemberRetrieved(Member Member);

        void noMemberFound();
    }
}
