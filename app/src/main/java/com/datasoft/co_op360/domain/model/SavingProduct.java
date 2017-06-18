package com.datasoft.co_op360.domain.model;

/**
 * Created by mehedi on 6/8/17.
 */

public class SavingProduct {

    private String id;

    private String name;

    private String typeOfDeposit;

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
