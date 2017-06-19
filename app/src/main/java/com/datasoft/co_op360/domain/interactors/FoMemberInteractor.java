package com.datasoft.co_op360.domain.interactors;

import com.datasoft.co_op360.domain.model.Member;

import java.util.List;

/**
 * Created by mehedi on 5/9/17.
 */

public interface FoMemberInteractor {

    interface MemberListFinishedListener {

        void onMembersListLoad(List<Member> list);
    }

    void loadMemberList(MemberListFinishedListener listener);
}
