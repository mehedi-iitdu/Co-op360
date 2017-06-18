package com.datasoft.co_op360.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mehedi on 6/5/17.
 */

public class RESTLoanPurpose {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("loan_purpose_category_id")
    @Expose
    private String loanPurposeCategoryId;
    @SerializedName("is_child")
    @Expose
    private String isChild;
    @SerializedName("parent_id")
    @Expose
    private String parentId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLoanPurposeCategoryId() {
        return loanPurposeCategoryId;
    }

    public void setLoanPurposeCategoryId(String loanPurposeCategoryId) {
        this.loanPurposeCategoryId = loanPurposeCategoryId;
    }

    public String getIsChild() {
        return isChild;
    }

    public void setIsChild(String isChild) {
        this.isChild = isChild;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

}