package com.datasoft.co_op360.storage.model;

import com.datasoft.co_op360.storage.database.MyDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by mehedi on 6/14/17.
 */

@Table(database = MyDatabase.class)
public class DBSamity extends BaseModel {
    @Column
    @PrimaryKey
    private String id;
    @Column
    private String workingAreaId;
    @Column
    private String name;
    @Column
    private String code;
    @Column
    private String samityDay;
    @Column
    private String type;
    @Column
    private String lat;
    @Column
    private String lng;
    @Column
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
