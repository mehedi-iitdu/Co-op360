package com.datasoft.co_op360.domain.model;

/**
 * Created by mehedi on 6/6/17.
 */

public class LoanProduct {

    private String id;

    private String name;

    private String catId;

    private String catName;

    private String momc;

    private String isPrimary;

    private String admsnFee;

    private String formFee;

    private String healthExp;

    private String riskFee;

    private String minAmt;

    private String maxAmt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getMomc() {
        return momc;
    }

    public void setMomc(String momc) {
        this.momc = momc;
    }

    public String getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(String isPrimary) {
        this.isPrimary = isPrimary;
    }

    public String getAdmsnFee() {
        return admsnFee;
    }

    public void setAdmsnFee(String admsnFee) {
        this.admsnFee = admsnFee;
    }

    public String getFormFee() {
        return formFee;
    }

    public void setFormFee(String formFee) {
        this.formFee = formFee;
    }

    public String getHealthExp() {
        return healthExp;
    }

    public void setHealthExp(String healthExp) {
        this.healthExp = healthExp;
    }

    public String getRiskFee() {
        return riskFee;
    }

    public void setRiskFee(String riskFee) {
        this.riskFee = riskFee;
    }

    public String getMinAmt() {
        return minAmt;
    }

    public void setMinAmt(String minAmt) {
        this.minAmt = minAmt;
    }

    public String getMaxAmt() {
        return maxAmt;
    }

    public void setMaxAmt(String maxAmt) {
        this.maxAmt = maxAmt;
    }
}
