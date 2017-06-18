package com.datasoft.co_op360.network.response;

import com.datasoft.co_op360.network.model.RESTAuth;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mehedi on 5/25/17.
 */

public class AuthResponse {

    @SerializedName("auth_result")
    @Expose
    private RESTAuth restAuth;

    public RESTAuth getAuthResult() {
        return restAuth;
    }

    public void setAuthResult(RESTAuth restAuth) {
        this.restAuth = restAuth;
    }
}
