package com.datasoft.co_op360.domain.model;

/**
 * Created by mehedi on 6/6/17.
 */

public class LoanPurpose {

    private String id;

    private String name;

    private String code;

    private String loanPurposeCategoryId;

    private String isChild;

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
