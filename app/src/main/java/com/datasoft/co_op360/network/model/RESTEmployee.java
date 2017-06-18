package com.datasoft.co_op360.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mehedi on 6/12/17.
 */

public class RESTEmployee {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("branch_id")
    @Expose
    private String branchId;
    @SerializedName("designation_id")
    @Expose
    private String designationId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("fathers_name")
    @Expose
    private String fathersName;
    @SerializedName("mothers_name")
    @Expose
    private String mothersName;
    @SerializedName("spouse_name")
    @Expose
    private String spouseName;
    @SerializedName("permanent_address")
    @Expose
    private String permanentAddress;
    @SerializedName("present_address")
    @Expose
    private String presentAddress;
    @SerializedName("last_achieved_degree")
    @Expose
    private String lastAchievedDegree;
    @SerializedName("date_of_birth")
    @Expose
    private String dateOfBirth;
    @SerializedName("date_of_joining")
    @Expose
    private String dateOfJoining;
    @SerializedName("date_of_discontinue")
    @Expose
    private String dateOfDiscontinue;
    @SerializedName("secuirity_money")
    @Expose
    private String secuirityMoney;
    @SerializedName("starting_salary")
    @Expose
    private String startingSalary;
    @SerializedName("current_salary")
    @Expose
    private String currentSalary;
    @SerializedName("national_id")
    @Expose
    private String nationalId;
    @SerializedName("blood_group")
    @Expose
    private String bloodGroup;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("mobile_no")
    @Expose
    private String mobileNo;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("employee_picture")
    @Expose
    private String employeePicture;
    @SerializedName("refence_info_1")
    @Expose
    private String refenceInfo1;
    @SerializedName("refence_info_2")
    @Expose
    private String refenceInfo2;
    @SerializedName("attached_documents")
    @Expose
    private String attachedDocuments;
    @SerializedName("is_field_officer")
    @Expose
    private String isFieldOfficer;
    @SerializedName("is_manager")
    @Expose
    private String isManager;
    @SerializedName("id_sequence_no")
    @Expose
    private String idSequenceNo;
    @SerializedName("no_of_samity")
    @Expose
    private String noOfSamity;
    @SerializedName("software_date")
    @Expose
    private String softwareDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getDesignationId() {
        return designationId;
    }

    public void setDesignationId(String designationId) {
        this.designationId = designationId;
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

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getLastAchievedDegree() {
        return lastAchievedDegree;
    }

    public void setLastAchievedDegree(String lastAchievedDegree) {
        this.lastAchievedDegree = lastAchievedDegree;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getDateOfDiscontinue() {
        return dateOfDiscontinue;
    }

    public void setDateOfDiscontinue(String dateOfDiscontinue) {
        this.dateOfDiscontinue = dateOfDiscontinue;
    }

    public String getSecuirityMoney() {
        return secuirityMoney;
    }

    public void setSecuirityMoney(String secuirityMoney) {
        this.secuirityMoney = secuirityMoney;
    }

    public String getStartingSalary() {
        return startingSalary;
    }

    public void setStartingSalary(String startingSalary) {
        this.startingSalary = startingSalary;
    }

    public String getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(String currentSalary) {
        this.currentSalary = currentSalary;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmployeePicture() {
        return employeePicture;
    }

    public void setEmployeePicture(String employeePicture) {
        this.employeePicture = employeePicture;
    }

    public String getRefenceInfo1() {
        return refenceInfo1;
    }

    public void setRefenceInfo1(String refenceInfo1) {
        this.refenceInfo1 = refenceInfo1;
    }

    public String getRefenceInfo2() {
        return refenceInfo2;
    }

    public void setRefenceInfo2(String refenceInfo2) {
        this.refenceInfo2 = refenceInfo2;
    }

    public String getAttachedDocuments() {
        return attachedDocuments;
    }

    public void setAttachedDocuments(String attachedDocuments) {
        this.attachedDocuments = attachedDocuments;
    }

    public String getIsFieldOfficer() {
        return isFieldOfficer;
    }

    public void setIsFieldOfficer(String isFieldOfficer) {
        this.isFieldOfficer = isFieldOfficer;
    }

    public String getIsManager() {
        return isManager;
    }

    public void setIsManager(String isManager) {
        this.isManager = isManager;
    }

    public String getIdSequenceNo() {
        return idSequenceNo;
    }

    public void setIdSequenceNo(String idSequenceNo) {
        this.idSequenceNo = idSequenceNo;
    }

    public String getNoOfSamity() {
        return noOfSamity;
    }

    public void setNoOfSamity(String noOfSamity) {
        this.noOfSamity = noOfSamity;
    }

    public String getSoftwareDate() {
        return softwareDate;
    }

    public void setSoftwareDate(String softwareDate) {
        this.softwareDate = softwareDate;
    }
}
