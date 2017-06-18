package com.datasoft.co_op360.network.services;

import com.datasoft.co_op360.network.response.EmployeeResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by mehedi on 6/12/17.
 */

public interface EmployeeApiInterface {
    @GET("employees")
    Call<EmployeeResponse> getEmployee(@Header("Authorization") String api_key, @Query("employee_id") int employee_id);
}
