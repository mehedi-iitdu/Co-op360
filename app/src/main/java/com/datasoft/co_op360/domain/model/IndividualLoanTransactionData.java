package com.datasoft.co_op360.domain.model;

/**
 * Created by mehedi on 4/19/17.
 */

public class IndividualLoanTransactionData {

    private String mLoanProduct;
    private String mLoanAmount;

    public IndividualLoanTransactionData(String mLoanProduct, String mLoanAmount) {
        this.mLoanProduct = mLoanProduct;
        this.mLoanAmount = mLoanAmount;
    }

    public String getmLoanProduct() {
        return mLoanProduct;
    }

    public void setmLoanProduct(String mLoanProduct) {
        this.mLoanProduct = mLoanProduct;
    }

    public String getmLoanAmount() {
        return mLoanAmount;
    }

    public void setmLoanAmount(String mLoanAmount) {
        this.mLoanAmount = mLoanAmount;
    }
}
