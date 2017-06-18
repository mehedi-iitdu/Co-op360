package com.datasoft.co_op360.domain.model;

/**
 * Created by mehedi on 5/15/17.
 */

public class ShareListItemData {

    private String mMemberName;
    private String mMemberId;
    private String mMemberSpouse;
    private String mMemberShareAmount;

    public ShareListItemData(String mMemberName, String mMemberId, String mMemberSpouse, String mMemberShareAmount) {
        this.mMemberName = mMemberName;
        this.mMemberId = mMemberId;
        this.mMemberSpouse = mMemberSpouse;
        this.mMemberShareAmount = mMemberShareAmount;
    }

    public String getmMemberName() {
        return mMemberName;
    }

    public void setmMemberName(String mMemberName) {
        this.mMemberName = mMemberName;
    }

    public String getmMemberId() {
        return mMemberId;
    }

    public void setmMemberId(String mMemberId) {
        this.mMemberId = mMemberId;
    }

    public String getmMemberSpouse() {
        return mMemberSpouse;
    }

    public void setmMemberSpouse(String mMemberSpouse) {
        this.mMemberSpouse = mMemberSpouse;
    }

    public String getmMemberShareAmount() {
        return mMemberShareAmount;
    }

    public void setmMemberShareAmount(String mMemberShareAmount) {
        this.mMemberShareAmount = mMemberShareAmount;
    }

}
