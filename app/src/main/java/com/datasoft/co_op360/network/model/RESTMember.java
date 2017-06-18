package com.datasoft.co_op360.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mehedi on 6/11/17.
 */

public class RESTMember {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("bid")
    @Expose
    private int branchId;
    @SerializedName("sid")
    @Expose
    private int samityId;
    @SerializedName("ppid")
    @Expose
    private int primaryProductId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("gen")
    @Expose
    private String gender;
    private String mobile;
    @SerializedName("fsn")
    @Expose
    private String fathersSpouseName;
    @SerializedName("fsr")
    @Expose
    private String fathersSpouseRelationship;
    private String maritalStatus;
    private String fatherName;
    private String spouseName;
    private String birthDay;
    private String memberPicture;
    private String filePath;
    private String nationalId;
    private String birthRegistrationNo;
    private double admissionFee;
    private int passbookNo;
    private double passbookAmount;
    private int lastAchievedDegree;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public int getSamityId() {
        return samityId;
    }

    public void setSamityId(int samityId) {
        this.samityId = samityId;
    }

    public int getPrimaryProductId() {
        return primaryProductId;
    }

    public void setPrimaryProductId(int primaryProductId) {
        this.primaryProductId = primaryProductId;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getFathersSpouseName() {
        return fathersSpouseName;
    }

    public void setFathersSpouseName(String fathersSpouseName) {
        this.fathersSpouseName = fathersSpouseName;
    }

    public String getFathersSpouseRelationship() {
        return fathersSpouseRelationship;
    }

    public void setFathersSpouseRelationship(String fathersSpouseRelationship) {
        this.fathersSpouseRelationship = fathersSpouseRelationship;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getMemberPicture() {
        return memberPicture;
    }

    public void setMemberPicture(String memberPicture) {
        this.memberPicture = memberPicture;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getBirthRegistrationNo() {
        return birthRegistrationNo;
    }

    public void setBirthRegistrationNo(String birthRegistrationNo) {
        this.birthRegistrationNo = birthRegistrationNo;
    }

    public double getAdmissionFee() {
        return admissionFee;
    }

    public void setAdmissionFee(double admissionFee) {
        this.admissionFee = admissionFee;
    }

    public int getPassbookNo() {
        return passbookNo;
    }

    public void setPassbookNo(int passbookNo) {
        this.passbookNo = passbookNo;
    }

    public double getPassbookAmount() {
        return passbookAmount;
    }

    public void setPassbookAmount(double passbookAmount) {
        this.passbookAmount = passbookAmount;
    }

    public int getLastAchievedDegree() {
        return lastAchievedDegree;
    }

    public void setLastAchievedDegree(int lastAchievedDegree) {
        this.lastAchievedDegree = lastAchievedDegree;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
