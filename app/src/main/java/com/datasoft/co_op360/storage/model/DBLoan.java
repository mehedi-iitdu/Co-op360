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
public class DBLoan extends BaseModel {

    @Column
    @PrimaryKey
    private Integer id;
    @Column
    private String code;
    @Column
    private String sid;
    @Column
    private String pid;
    @Column
    private String mid;
    @Column
    private String irId;
    @Column
    private Integer lAmt;
    @Column
    private String totalInstallment;
    @Column
    private Integer instNo;
    @Column
    private Integer instAmt;
    @Column
    private String type;
    @Column
    private Integer cycle;
    @Column
    private String rDate;
    @Column
    private String rFrequency;
    @Column
    private Double principle;
    @Column
    private Double interest;
    @Column
    private Integer oOutstanding;
    @Column
    private Integer oDue;
    @Column
    private Integer oAdvance;
    @Column
    private Integer oInterest;
    @Column
    private Integer oPrinciple;
    @Column
    private Integer due;
    @Column
    private Integer adv;
    @Column
    private Integer bal;
    @Column
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
