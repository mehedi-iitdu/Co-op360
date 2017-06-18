package com.datasoft.co_op360.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mehedi on 6/12/17.
 */

public class RESTSamity {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("working_area_id")
    @Expose
    private String workingAreaId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("samity_day")
    @Expose
    private String samityDay;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;
    @SerializedName("isdo")
    @Expose
    private String isdo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkingAreaId() {
        return workingAreaId;
    }

    public void setWorkingAreaId(String workingAreaId) {
        this.workingAreaId = workingAreaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSamityDay() {
        return samityDay;
    }

    public void setSamityDay(String samityDay) {
        this.samityDay = samityDay;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getIsdo() {
        return isdo;
    }

    public void setIsdo(String isdo) {
        this.isdo = isdo;
    }
}
