package com.datasoft.co_op360.storage.model;

import com.datasoft.co_op360.storage.database.MyDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by mehedi on 6/6/17.
 */

@Table(database = MyDatabase.class)
public class DBLoanPurpose extends BaseModel {

    @Column
    @PrimaryKey
    private String id;
    @Column
    private String name;
    @Column
    private String code;
    @Column
    private String loanPurposeCategoryId;
    @Column
    private String isChild;
    @Column
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
