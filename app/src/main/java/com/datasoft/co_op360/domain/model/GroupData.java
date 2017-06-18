package com.datasoft.co_op360.domain.model;

/**
 * Created by mehedi on 3/31/17.
 */

public class GroupData {

    private String mGroupName;
    private String mTotalMember;
    private String mSavingsAmount;
    private String mShareAmount;
    private String mLoanAmount;

    public GroupData(String mGroupName, String mTotalMember, String mSavingsAmount, String mShareAmount, String mLoanAmount) {
        this.mGroupName = mGroupName;
        this.mTotalMember = mTotalMember;
        this.mSavingsAmount = mSavingsAmount;
        this.mShareAmount = mShareAmount;
        this.mLoanAmount = mLoanAmount;
    }

    public String getmGroupName() {
        return mGroupName;
    }

    public void setmGroupName(String mGroupName) {
        this.mGroupName = mGroupName;
    }

    public String getmTotalMember() {
        return mTotalMember;
    }

    public void setmTotalMember(String mTotalMember) {
        this.mTotalMember = mTotalMember;
    }

    public String getmSavingsAmount() {
        return mSavingsAmount;
    }

    public void setmSavingsAmount(String mSavingsAmount) {
        this.mSavingsAmount = mSavingsAmount;
    }

    public String getmShareAmount() {
        return mShareAmount;
    }

    public void setmShareAmount(String mShareAmount) {
        this.mShareAmount = mShareAmount;
    }

    public String getmLoanAmount() {
        return mLoanAmount;
    }

    public void setmLoanAmount(String mLoanAmount) {
        this.mLoanAmount = mLoanAmount;
    }
}
