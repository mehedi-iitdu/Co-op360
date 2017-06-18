package com.datasoft.co_op360.network.response;

import com.datasoft.co_op360.network.model.RESTSamity;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mehedi on 6/12/17.
 */

public class SamityResponse extends BaseResponse {
    @SerializedName("samity_list")
    @Expose
    private List<RESTSamity> samityList = null;

    public List<RESTSamity> getSamityList() {
        return samityList;
    }

    public void setSamityList(List<RESTSamity> samityList) {
        this.samityList = samityList;
    }
}
