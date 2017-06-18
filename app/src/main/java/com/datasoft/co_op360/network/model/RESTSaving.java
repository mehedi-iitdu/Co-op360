package com.datasoft.co_op360.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mehedi on 6/8/17.
 */

public class RESTSaving {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("sid")
    @Expose
    private String sid;
    @SerializedName("mid")
    @Expose
    private String mid;
    @SerializedName("s_pid")
    @Expose
    private String sPid;
    @SerializedName("wk")
    @Expose
    private String wk;
    @SerializedName("bal")
    @Expose
    private Integer bal;
    @SerializedName("is_auto")
    @Expose
    private Integer isAuto;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getSPid() {
        return sPid;
    }

    public void setSPid(String sPid) {
        this.sPid = sPid;
    }

    public String getWk() {
        return wk;
    }

    public void setWk(String wk) {
        this.wk = wk;
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
