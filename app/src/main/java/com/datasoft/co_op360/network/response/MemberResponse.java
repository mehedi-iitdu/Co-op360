package com.datasoft.co_op360.network.response;

import com.datasoft.co_op360.network.model.RESTMember;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mehedi on 6/11/17.
 */

public class MemberResponse extends BaseResponse {

    @SerializedName("member_list")
    @Expose
    private List<RESTMember> restMemberList = null;

    public List<RESTMember> getRestMemberList() {
        return restMemberList;
    }

    public void setRestMemberList(List<RESTMember> restMemberList) {
        this.restMemberList = restMemberList;
    }
}
