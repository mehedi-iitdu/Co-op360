package com.datasoft.co_op360.domain.model;

/**
 * Created by mehedi on 4/18/17.
 */

public class LoanProposalData {


    private String mMemberName;
    private String mMemberId;
    private String mMemberSpouse;
    private String mMemberLoanProposalAmount;

    public LoanProposalData(String mMemberName, String mMemberId, String mMemberSpouse, String mMemberLoanProposalAmount) {
        this.mMemberName = mMemberName;
        this.mMemberId = mMemberId;
        this.mMemberSpouse = mMemberSpouse;
        this.mMemberLoanProposalAmount = mMemberLoanProposalAmount;
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

    public String getmMemberLoanProposalAmount() {
        return mMemberLoanProposalAmount;
    }

    public void setmMemberLoanProposalAmount(String mMemberLoanAmount) {
        this.mMemberLoanProposalAmount = mMemberLoanAmount;
    }

}
