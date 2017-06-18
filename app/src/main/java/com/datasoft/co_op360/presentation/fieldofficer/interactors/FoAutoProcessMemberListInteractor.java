package com.datasoft.co_op360.presentation.fieldofficer.interactors;

import com.datasoft.co_op360.domain.model.MemberListData;

import java.util.List;

/**
 * Created by mehedi on 4/3/17.
 */

public interface FoAutoProcessMemberListInteractor {

    interface MemberListFinishedListener {

        void onMembersListLoad(List<MemberListData> list);
    }

    void loadMemberList(MemberListFinishedListener listener);
}
