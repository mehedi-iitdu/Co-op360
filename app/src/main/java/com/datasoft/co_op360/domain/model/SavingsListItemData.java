package com.datasoft.co_op360.domain.model;

import java.util.List;

/**
 * Created by mehedi on 4/11/17.
 */

public class SavingsListItemData {

    List<IndividualSavingsData> individualSavingsDatas;

    private String mMemberName;
    private String mMemberId;
    private String mMemberSpouse;
    private String mMemberSavingsAmount;

    public SavingsListItemData(String mMemberName, String mMemberId, String mMemberSpouse, String mMemberSavingsAmount) {
        this.mMemberName = mMemberName;
        this.mMemberId = mMemberId;
        this.mMemberSpouse = mMemberSpouse;
        this.mMemberSavingsAmount = mMemberSavingsAmount;
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

    public String getmMemberSavingsAmount() {
        return mMemberSavingsAmount;
    }

    public void setmMemberSavingsAmount(String mMemberSavingsAmount) {
        this.mMemberSavingsAmount = mMemberSavingsAmount;
    }

    public List<IndividualSavingsData> getCostList() {

        return individualSavingsDatas;
    }
}
