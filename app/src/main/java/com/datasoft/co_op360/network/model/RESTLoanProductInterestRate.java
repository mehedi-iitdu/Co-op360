package com.datasoft.co_op360.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mehedi on 6/5/17.
 */

public class RESTLoanProductInterestRate {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("pid")
    @Expose
    private String pid;
    @SerializedName("ir")
    @Expose
    private String ir;
    @SerializedName("iri")
    @Expose
    private String iri;
    @SerializedName("icm")
    @Expose
    private String icm;
    @SerializedName("moi")
    @Expose
    private String moi;
    @SerializedName("dp")
    @Expose
    private String dp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getIr() {
        return ir;
    }

    public void setIr(String ir) {
        this.ir = ir;
    }

    public String getIri() {
        return iri;
    }

    public void setIri(String iri) {
        this.iri = iri;
    }

    public String getIcm() {
        return icm;
    }

    public void setIcm(String icm) {
        this.icm = icm;
    }

    public String getMoi() {
        return moi;
    }

    public void setMoi(String moi) {
        this.moi = moi;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }

}
