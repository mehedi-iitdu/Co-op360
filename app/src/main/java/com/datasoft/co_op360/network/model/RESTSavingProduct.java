package com.datasoft.co_op360.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mehedi on 6/8/17.
 */

public class RESTSavingProduct {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type_of_deposit")
    @Expose
    private String typeOfDeposit;
    @SerializedName("saving_collection_frequency")
    @Expose
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
