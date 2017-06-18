package com.datasoft.co_op360.network.services;

import com.datasoft.co_op360.network.response.MemberResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by mehedi on 6/11/17.
 */

public interface MemberApiInterface {
    @GET("members")
    Call<MemberResponse> getMembers(@Header("Authorization") String api_key, @Query("fo_id") int fo_id, @Query("branch_id") int branch_id);
}
