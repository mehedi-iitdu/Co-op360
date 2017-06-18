package com.datasoft.co_op360.domain.model;

/**
 * Created by mehedi on 4/11/17.
 */

public class IndividualSavingsData {

    private String savingsId;
    private String savingsType;
    private String savingsProduct;
    private String savingsAmount;


    public IndividualSavingsData(String savingsId, String savingsType, String savingsProduct, String savingsAmount) {
        this.savingsId = savingsId;
        this.savingsType = savingsType;
        this.savingsProduct = savingsProduct;
        this.savingsAmount = savingsAmount;
    }


    public String getSavingsId() {
        return savingsId;
    }

    public void setSavingsId(String savingsId) {
        this.savingsId = savingsId;
    }

    public String getSavingsType() {
        return savingsType;
    }

    public void setSavingsType(String savingsType) {
        this.savingsType = savingsType;
    }

    public String getSavingsProduct() {
        return savingsProduct;
    }

    public void setSavingsProduct(String savingsProduct) {
        this.savingsProduct = savingsProduct;
    }

    public String getSavingsAmount() {
        return savingsAmount;
    }

    public void setSavingsAmount(String savingsAmount) {
        this.savingsAmount = savingsAmount;
    }
}
