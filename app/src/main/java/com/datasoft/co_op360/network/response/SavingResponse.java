package com.datasoft.co_op360.network.response;

import com.datasoft.co_op360.network.model.RESTBankHead;
import com.datasoft.co_op360.network.model.RESTSaving;
import com.datasoft.co_op360.network.model.RESTSavingProduct;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mehedi on 6/8/17.
 */

public class SavingResponse extends BaseResponse {

    @SerializedName("saving_list")
    @Expose
    private List<RESTSaving> savingList = null;
    @SerializedName("saving_products")
    @Expose
    private List<RESTSavingProduct> savingProducts = null;
    @SerializedName("bank_heads")
    @Expose
    private List<RESTBankHead> bankHeads = null;

    public List<RESTSaving> getSavingList() {
        return savingList;
    }

    public void setSavingList(List<RESTSaving> savingList) {
        this.savingList = savingList;
    }

    public List<RESTSavingProduct> getSavingProducts() {
        return savingProducts;
    }

    public void setSavingProducts(List<RESTSavingProduct> savingProducts) {
        this.savingProducts = savingProducts;
    }

    public List<RESTBankHead> getBankHeads() {
        return bankHeads;
    }

    public void setBankHeads(List<RESTBankHead> bankHeads) {
        this.bankHeads = bankHeads;
    }
}
