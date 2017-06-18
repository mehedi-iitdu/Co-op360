package com.datasoft.co_op360.network.services;

import com.datasoft.co_op360.network.response.SavingResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by mehedi on 6/8/17.
 */

public interface SavingApiInterface {
    @POST("savings/saving_data")
    @FormUrlEncoded
    Call<SavingResponse> getSaving(@Header("Authorization") String api_key, @Field("fo_id") int fo_id, @Field("branch_id") int branch_id);
}
