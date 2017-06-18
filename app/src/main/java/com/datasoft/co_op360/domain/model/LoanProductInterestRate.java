package com.datasoft.co_op360.domain.model;

/**
 * Created by mehedi on 6/6/17.
 */

public class LoanProductInterestRate {

    private String id;

    private String pid;

    private String ir;

    private String iri;

    private String icm;

    private String moi;

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
