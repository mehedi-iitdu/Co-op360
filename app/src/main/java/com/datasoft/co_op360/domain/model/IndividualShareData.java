package com.datasoft.co_op360.domain.model;

/**
 * Created by mehedi on 5/15/17.
 */

public class IndividualShareData {

    private String shareId;
    private String shareType;
    private String shareProduct;
    private String shareAmount;


    public IndividualShareData(String shareId, String shareType, String shareProduct, String shareAmount) {
        this.shareId = shareId;
        this.shareType = shareType;
        this.shareProduct = shareProduct;
        this.shareAmount = shareAmount;
    }


    public String getshareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    public String getShareProduct() {
        return shareProduct;
    }

    public void setShareProduct(String shareProduct) {
        this.shareProduct = shareProduct;
    }

    public String getShareAmount() {
        return shareAmount;
    }

    public void setShareAmount(String shareAmount) {
        this.shareAmount = shareAmount;
    }

}
