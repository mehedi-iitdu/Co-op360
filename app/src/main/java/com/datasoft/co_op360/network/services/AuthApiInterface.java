package com.datasoft.co_op360.network.services;

import com.datasoft.co_op360.network.response.AuthResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by mehedi on 5/25/17.
 */

public interface AuthApiInterface {
    @POST("auths")
    @FormUrlEncoded
    Call<AuthResponse> getAuthResults(@Field("user_name") String user_name, @Field("password") String password);
}
