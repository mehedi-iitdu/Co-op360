package com.datasoft.co_op360.storage.model;

import com.datasoft.co_op360.storage.database.MyDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by mehedi on 6/6/17.
 */

@Table(database = MyDatabase.class)
public class DBLoanProduct extends BaseModel {

    @Column
    @PrimaryKey
    private String id;
    @Column
    private String name;
    @Column
    private String catId;
    @Column
    private String catName;
    @Column
    private String momc;
    @Column
    private String isPrimary;
    @Column
    private String admsnFee;
    @Column
    private String formFee;
    @Column
    private String healthExp;
    @Column
    private String riskFee;
    @Column
    private String minAmt;
    @Column
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
