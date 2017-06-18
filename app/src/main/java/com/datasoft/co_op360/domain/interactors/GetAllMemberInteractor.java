package com.datasoft.co_op360.domain.interactors;

import com.datasoft.co_op360.domain.interactors.base.Interactor;
import com.datasoft.co_op360.domain.model.Member;

import java.util.List;

/**
 * Created by dmilicic on 12/10/15.
 * <p/>
 * This interactor is responsible for retrieving a list of Members from the database.
 */
public interface GetAllMemberInteractor extends Interactor {

    interface Callback {

        void onMembersRetrieved(List<Member> MemberList);
    }
}
