package com.datasoft.co_op360.storage.model;

import com.datasoft.co_op360.storage.database.MyDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by mehedi on 6/13/17.
 */

@Table(database = MyDatabase.class)
public class DBEmployee extends BaseModel {
    @Column
    @PrimaryKey
    private String id;
    @Column
    private String branchId;
    @Column
    private String designationId;
    @Column
    private String name;
    @Column
    private String code;
    @Column
    private String fathersName;
    @Column
    private String mothersName;
    @Column
    private String spouseName;
    @Column
    private String permanentAddress;
    @Column
    private String presentAddress;
    @Column
    private String lastAchievedDegree;
    @Column
    private String dateOfBirth;
    @Column
    private String dateOfJoining;
    @Column
    private String dateOfDiscontinue;
    @Column
    private String secuirityMoney;
    @Column
    private String startingSalary;
    @Column
    private String currentSalary;
    @Column
    private String nationalId;
    @Column
    private String bloodGroup;
    @Column
    private String gender;
    @Column
    private String mobileNo;
    @Column
    private String email;
    @Column
    private String status;
    @Column
    private String employeePicture;
    @Column
    private String refenceInfo1;
    @Column
    private String refenceInfo2;
    @Column
    private String attachedDocuments;
    @Column
    private String isFieldOfficer;
    @Column
    private String isManager;
    @Column
    private String idSequenceNo;
    @Column
    private String noOfSamity;
    @Column
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
