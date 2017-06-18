package com.datasoft.co_op360.network.response;

import com.datasoft.co_op360.network.model.RESTEmployee;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mehedi on 6/12/17.
 */

public class EmployeeResponse extends BaseResponse {
    @SerializedName("employee_results")
    @Expose
    private RESTEmployee restEmployee;

    public RESTEmployee getRestEmployee() {
        return restEmployee;
    }

    public void setRestEmployee(RESTEmployee restEmployee) {
        this.restEmployee = restEmployee;
    }
}
