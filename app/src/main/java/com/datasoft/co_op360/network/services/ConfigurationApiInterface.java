package com.datasoft.co_op360.network.services;

import com.datasoft.co_op360.network.response.ConfigurationResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by mehedi on 6/3/17.
 */

public interface ConfigurationApiInterface {

    @GET("configurations")
    Call<ConfigurationResponse> getConfigurations(@Header("Authorization") String api_key);
}
