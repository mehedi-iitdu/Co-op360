package com.datasoft.co_op360.domain.interactors.impl;

import com.datasoft.co_op360.domain.model.MemberListData;
import com.datasoft.co_op360.domain.interactors.FoMemberInteractor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 5/9/17.
 */

public class FoMemberInteractorImpl implements FoMemberInteractor {

    @Override
    public void loadMemberList(final MemberListFinishedListener listener) {

        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                listener.onMembersListLoad(createArrayList());
            }
        }, 1000);*/

        //MemberRepository memberRepository = new MemberRepositoryImpl();
        //List<Member> members = memberRepository.getAllMembers();
        //listener.onMembersListLoad(members);


    }

    private List<MemberListData> createArrayList() {

        List<MemberListData> list = new ArrayList<>();

        list.add(new MemberListData("Rabeya", "001-002-003", "Md. Abul Kashem", "", "", ""));
        list.add(new MemberListData("Feroza Begum", "002-002-003", "Abdul Molla", "", "", ""));
        list.add(new MemberListData("Parvin", "003-002-003", "Md. Sattar Khan", "", "", ""));

        return list;
    }
}
