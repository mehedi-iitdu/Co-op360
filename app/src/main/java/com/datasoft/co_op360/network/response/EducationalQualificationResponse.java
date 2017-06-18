package com.datasoft.co_op360.network.response;

import com.datasoft.co_op360.network.model.RESTEducationalQualification;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mehedi on 6/5/17.
 */

public class EducationalQualificationResponse extends BaseResponse {

    @SerializedName("educational_qualifications")
    @Expose
    private List<RESTEducationalQualification> educationalQualifications = null;

    public List<RESTEducationalQualification> getEducationalQualifications() {
        return educationalQualifications;
    }

    public void setEducationalQualifications(List<RESTEducationalQualification> educationalQualifications) {
        this.educationalQualifications = educationalQualifications;
    }
}
