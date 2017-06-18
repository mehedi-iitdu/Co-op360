package com.datasoft.co_op360.presentation.fieldofficer.interactors.impl;

import android.os.Handler;

import com.datasoft.co_op360.domain.model.MemberListData;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.FoAutoProcessMemberListInteractor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 4/3/17.
 */

public class FoAutoProcessMemberListInteractorImpl implements FoAutoProcessMemberListInteractor {

    @Override
    public void loadMemberList(final MemberListFinishedListener listener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onMembersListLoad(createArrayList());
            }
        }, 1000);

    }

    private List<MemberListData> createArrayList() {

        List<MemberListData> list = new ArrayList<>();

        list.add(new MemberListData("Rabeya", "001-002-003", "Md. Abul Kashem", "14000", "10000", "250000"));
        list.add(new MemberListData("Feroza Begum", "002-002-003", "Abdul Molla", "14000", "10000", "250000"));
        list.add(new MemberListData("Parvin", "003-002-003", "Md. Sattar Khan", "14000", "10000", "250000"));

        return list;
    }
}
