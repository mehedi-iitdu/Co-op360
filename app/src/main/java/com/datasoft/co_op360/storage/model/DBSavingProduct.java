package com.datasoft.co_op360.storage.model;

import com.datasoft.co_op360.storage.database.MyDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by mehedi on 6/8/17.
 */

@Table(database = MyDatabase.class)
public class DBSavingProduct extends BaseModel {
    @Column
    @PrimaryKey
    private String id;
    @Column
    private String name;
    @Column
    private String typeOfDeposit;
    @Column
    private String savingCollectionFrequency;

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

    public String getTypeOfDeposit() {
        return typeOfDeposit;
    }

    public void setTypeOfDeposit(String typeOfDeposit) {
        this.typeOfDeposit = typeOfDeposit;
    }

    public String getSavingCollectionFrequency() {
        return savingCollectionFrequency;
    }

    public void setSavingCollectionFrequency(String savingCollectionFrequency) {
        this.savingCollectionFrequency = savingCollectionFrequency;
    }
}
