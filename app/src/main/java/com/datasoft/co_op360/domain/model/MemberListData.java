package com.datasoft.co_op360.domain.model;

/**
 * Created by mehedi on 4/3/17.
 */

public class MemberListData {

    private String mMemberName;
    private String mMemberID;
    private String mMemberSpouse;
    private String mSavingsAmount;
    private String mShareAmount;
    private String mLoanAmount;

    public MemberListData(String mMemberName, String mMemberID, String mMemberSpouse, String mSavingsAmount, String mShareAmount, String mLoanAmount) {
        this.mMemberName = mMemberName;
        this.mMemberID = mMemberID;
        this.mMemberSpouse = mMemberSpouse;
        this.mSavingsAmount = mSavingsAmount;
        this.mShareAmount = mShareAmount;
        this.mLoanAmount = mLoanAmount;
    }

    public String getmMemberName() {
        return mMemberName;
    }

    public void setmMemberName(String mMemberName) {
        this.mMemberName = mMemberName;
    }

    public String getmMemberID() {
        return mMemberID;
    }

    public void setmMemberID(String mMemberID) {
        this.mMemberID = mMemberID;
    }

    public String getGetmMemberSpouse() {
        return mMemberSpouse;
    }

    public void setGetmMemberSpouse(String getmMemberSpouse) {
        this.mMemberSpouse = getmMemberSpouse;
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
