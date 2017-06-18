package com.datasoft.co_op360.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mehedi on 6/5/17.
 */

public class RESTLoan {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("sid")
    @Expose
    private String sid;
    @SerializedName("pid")
    @Expose
    private String pid;
    @SerializedName("mid")
    @Expose
    private String mid;
    @SerializedName("ir_id")
    @Expose
    private String irId;
    @SerializedName("l_amt")
    @Expose
    private Integer lAmt;
    @SerializedName("total_installment")
    @Expose
    private String totalInstallment;
    @SerializedName("inst_no")
    @Expose
    private Integer instNo;
    @SerializedName("inst_amt")
    @Expose
    private Integer instAmt;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("cycle")
    @Expose
    private Integer cycle;
    @SerializedName("r_date")
    @Expose
    private String rDate;
    @SerializedName("r_frequency")
    @Expose
    private String rFrequency;
    @SerializedName("principle")
    @Expose
    private Double principle;
    @SerializedName("interest")
    @Expose
    private Double interest;
    @SerializedName("o_outstanding")
    @Expose
    private Integer oOutstanding;
    @SerializedName("o_due")
    @Expose
    private Integer oDue;
    @SerializedName("o_advance")
    @Expose
    private Integer oAdvance;
    @SerializedName("o_interest")
    @Expose
    private Integer oInterest;
    @SerializedName("o_principle")
    @Expose
    private Integer oPrinciple;
    @SerializedName("due")
    @Expose
    private Integer due;
    @SerializedName("adv")
    @Expose
    private Integer adv;
    @SerializedName("bal")
    @Expose
    private Integer bal;
    @SerializedName("is_auto")
    @Expose
    private Integer isAuto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getIrId() {
        return irId;
    }

    public void setIrId(String irId) {
        this.irId = irId;
    }

    public Integer getLAmt() {
        return lAmt;
    }

    public void setLAmt(Integer lAmt) {
        this.lAmt = lAmt;
    }

    public String getTotalInstallment() {
        return totalInstallment;
    }

    public void setTotalInstallment(String totalInstallment) {
        this.totalInstallment = totalInstallment;
    }

    public Integer getInstNo() {
        return instNo;
    }

    public void setInstNo(Integer instNo) {
        this.instNo = instNo;
    }

    public Integer getInstAmt() {
        return instAmt;
    }

    public void setInstAmt(Integer instAmt) {
        this.instAmt = instAmt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCycle() {
        return cycle;
    }

    public void setCycle(Integer cycle) {
        this.cycle = cycle;
    }

    public String getRDate() {
        return rDate;
    }

    public void setRDate(String rDate) {
        this.rDate = rDate;
    }

    public String getRFrequency() {
        return rFrequency;
    }

    public void setRFrequency(String rFrequency) {
        this.rFrequency = rFrequency;
    }

    public Double getPrinciple() {
        return principle;
    }

    public void setPrinciple(Double principle) {
        this.principle = principle;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }

    public Integer getOOutstanding() {
        return oOutstanding;
    }

    public void setOOutstanding(Integer oOutstanding) {
        this.oOutstanding = oOutstanding;
    }

    public Integer getODue() {
        return oDue;
    }

    public void setODue(Integer oDue) {
        this.oDue = oDue;
    }

    public Integer getOAdvance() {
        return oAdvance;
    }

    public void setOAdvance(Integer oAdvance) {
        this.oAdvance = oAdvance;
    }

    public Integer getOInterest() {
        return oInterest;
    }

    public void setOInterest(Integer oInterest) {
        this.oInterest = oInterest;
    }

    public Integer getOPrinciple() {
        return oPrinciple;
    }

    public void setOPrinciple(Integer oPrinciple) {
        this.oPrinciple = oPrinciple;
    }

    public Integer getDue() {
        return due;
    }

    public void setDue(Integer due) {
        this.due = due;
    }

    public Integer getAdv() {
        return adv;
    }

    public void setAdv(Integer adv) {
        this.adv = adv;
    }

    public Integer getBal() {
        return bal;
    }

    public void setBal(Integer bal) {
        this.bal = bal;
    }

    public Integer getIsAuto() {
        return isAuto;
    }

    public void setIsAuto(Integer isAuto) {
        this.isAuto = isAuto;
    }

}
