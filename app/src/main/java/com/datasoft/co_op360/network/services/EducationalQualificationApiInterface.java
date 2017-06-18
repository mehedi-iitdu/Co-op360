package com.datasoft.co_op360.network.services;

import com.datasoft.co_op360.network.response.EducationalQualificationResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by mehedi on 6/5/17.
 */

public interface EducationalQualificationApiInterface {

    @GET("educational_qualifications")
    Call<EducationalQualificationResponse> getEducationalQualifications(@Header("Authorization") String api_key);
}
