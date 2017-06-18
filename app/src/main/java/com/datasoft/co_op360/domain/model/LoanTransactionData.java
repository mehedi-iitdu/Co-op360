package com.datasoft.co_op360.domain.model;

/**
 * Created by mehedi on 4/17/17.
 */

public class LoanTransactionData {

    private String mMemberName;
    private String mMemberId;
    private String mMemberSpouse;
    private String mMemberLoanAmount;

    public LoanTransactionData(String mMemberName, String mMemberId, String mMemberSpouse, String mMemberLoanAmount) {
        this.mMemberName = mMemberName;
        this.mMemberId = mMemberId;
        this.mMemberSpouse = mMemberSpouse;
        this.mMemberLoanAmount = mMemberLoanAmount;
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

    public String getmMemberLoanAmount() {
        return mMemberLoanAmount;
    }

    public void setmMemberLoanAmount(String mMemberLoanAmount) {
        this.mMemberLoanAmount = mMemberLoanAmount;
    }
}
