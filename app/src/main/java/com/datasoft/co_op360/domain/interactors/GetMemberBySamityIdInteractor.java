package com.datasoft.co_op360.domain.interactors;

import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.domain.interactors.base.Interactor;
import com.datasoft.co_op360.domain.model.Member;

import java.util.List;

/**
 * Created by mehedi on 6/19/17.
 */

public interface GetMemberBySamityIdInteractor extends Interactor {

    interface Callback {
        void onMemberRetrieved(List<Member> memberList);

        void noMemberFound();
    }
}
