package com.datasoft.co_op360.network.response;

import com.datasoft.co_op360.network.model.RESTLoan;
import com.datasoft.co_op360.network.model.RESTLoanProduct;
import com.datasoft.co_op360.network.model.RESTLoanProductInterestRate;
import com.datasoft.co_op360.network.model.RESTLoanPurpose;
import com.datasoft.co_op360.network.model.RESTLoanPurposeCategory;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mehedi on 6/6/17.
 */

public class LoanResponse extends BaseResponse{

    @SerializedName("loan_list")
    @Expose
    private List<RESTLoan> restLoanList;
    @SerializedName("loan_products")
    @Expose
    private List<RESTLoanProduct> restLoanProducts;
    @SerializedName("loan_purposes")
    @Expose
    private List<RESTLoanPurpose> restLoanPurposes;
    @SerializedName("loan_purpose_categories")
    @Expose
    private List<RESTLoanPurposeCategory> restLoanPurposeCategories;
    @SerializedName("loan_product_interest_rates")
    @Expose
    private List<RESTLoanProductInterestRate> restLoanProductInterestRates;

    public List<RESTLoan> getRestLoanList() {
        return restLoanList;
    }

    public void setRestLoanList(List<RESTLoan> restLoanList) {
        this.restLoanList = restLoanList;
    }

    public List<RESTLoanProduct> getRestLoanProducts() {
        return restLoanProducts;
    }

    public void setRestLoanProducts(List<RESTLoanProduct> restLoanProducts) {
        this.restLoanProducts = restLoanProducts;
    }

    public List<RESTLoanPurpose> getRestLoanPurposes() {
        return restLoanPurposes;
    }

    public void setRestLoanPurposes(List<RESTLoanPurpose> restLoanPurposes) {
        this.restLoanPurposes = restLoanPurposes;
    }

    public List<RESTLoanPurposeCategory> getRestLoanPurposeCategories() {
        return restLoanPurposeCategories;
    }

    public void setRestLoanPurposeCategories(List<RESTLoanPurposeCategory> restLoanPurposeCategories) {
        this.restLoanPurposeCategories = restLoanPurposeCategories;
    }

    public List<RESTLoanProductInterestRate> getRestLoanProductInterestRates() {
        return restLoanProductInterestRates;
    }

    public void setRestLoanProductInterestRates(List<RESTLoanProductInterestRate> restLoanProductInterestRates) {
        this.restLoanProductInterestRates = restLoanProductInterestRates;
    }
}
