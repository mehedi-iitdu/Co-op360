package com.datasoft.co_op360.network.response;

import com.datasoft.co_op360.network.model.RESTConfiguration;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mehedi on 6/3/17.
 */

public class ConfigurationResponse extends BaseResponse {

    @SerializedName("configurations")
    @Expose
    private List<RESTConfiguration> configurations = null;

    public List<RESTConfiguration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<RESTConfiguration> configurations) {
        this.configurations = configurations;
    }
}
