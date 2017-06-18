package com.datasoft.co_op360.storage.converters;

import com.datasoft.co_op360.domain.model.Member;
import com.datasoft.co_op360.network.model.RESTMember;
import com.datasoft.co_op360.storage.model.DBMember;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 6/11/17.
 */

public class MemberModelConverter {

    public static Member convertRestToDomainModel(RESTMember restMember) {

        Member member = new Member();
        member.setId(restMember.getId());
        member.setBranchId(restMember.getBranchId());
        member.setSamityId(restMember.getSamityId());
        member.setPrimaryProductId(restMember.getPrimaryProductId());
        member.setName(restMember.getName());
        member.setCode(restMember.getCode());
        member.setGender(restMember.getGender());
        member.setMobile(restMember.getMobile());
        member.setFathersSpouseName(restMember.getFathersSpouseName());
        member.setFathersSpouseRelationship(restMember.getFathersSpouseRelationship());
        member.setMaritalStatus(restMember.getMaritalStatus());
        member.setFatherName(restMember.getFatherName());
        member.setSpouseName(restMember.getSpouseName());
        member.setBirthDay(restMember.getBirthDay());
        member.setMemberPicture(restMember.getMemberPicture());
        member.setFilePath(restMember.getFilePath());
        member.setNationalId(restMember.getNationalId());
        member.setBirthRegistrationNo(restMember.getBirthRegistrationNo());
        member.setAdmissionFee(restMember.getAdmissionFee());
        member.setPassbookNo(restMember.getPassbookNo());
        member.setPassbookAmount(restMember.getPassbookAmount());
        member.setLastAchievedDegree(restMember.getLastAchievedDegree());
        member.setStatus(restMember.getStatus());

        return member;
    }

    public static RESTMember convertDomainToNetworkModel(Member member) {
        RESTMember restMember = new RESTMember();
        restMember.setId(member.getId());
        restMember.setBranchId(member.getBranchId());
        restMember.setSamityId(member.getSamityId());
        restMember.setPrimaryProductId(member.getPrimaryProductId());
        restMember.setName(member.getName());
        restMember.setCode(member.getCode());
        restMember.setGender(member.getGender());
        restMember.setMobile(member.getMobile());
        restMember.setFathersSpouseName(member.getFathersSpouseName());
        restMember.setFathersSpouseRelationship(member.getFathersSpouseRelationship());
        restMember.setMaritalStatus(member.getMaritalStatus());
        restMember.setFatherName(member.getFatherName());
        restMember.setSpouseName(member.getSpouseName());
        restMember.setBirthDay(member.getBirthDay());
        restMember.setMemberPicture(member.getMemberPicture());
        restMember.setFilePath(member.getFilePath());
        restMember.setNationalId(member.getNationalId());
        restMember.setBirthRegistrationNo(member.getBirthRegistrationNo());
        restMember.setAdmissionFee(member.getAdmissionFee());
        restMember.setPassbookNo(member.getPassbookNo());
        restMember.setPassbookAmount(member.getPassbookAmount());
        restMember.setLastAchievedDegree(member.getLastAchievedDegree());
        restMember.setStatus(member.getStatus());

        return restMember;
    }

    public static DBMember convertDomainToStorageModel(Member member) {
        DBMember dbMember = new DBMember();
        dbMember.setId(member.getId());
        dbMember.setBranchId(member.getBranchId());
        dbMember.setSamityId(member.getSamityId());
        dbMember.setPrimaryProductId(member.getPrimaryProductId());
        dbMember.setName(member.getName());
        dbMember.setCode(member.getCode());
        dbMember.setGender(member.getGender());
        dbMember.setMobile(member.getMobile());
        dbMember.setFathersSpouseName(member.getFathersSpouseName());
        dbMember.setFathersSpouseRelationship(member.getFathersSpouseRelationship());
        dbMember.setMaritalStatus(member.getMaritalStatus());
        dbMember.setFatherName(member.getFatherName());
        dbMember.setSpouseName(member.getSpouseName());
        dbMember.setBirthDay(member.getBirthDay());
        dbMember.setMemberPicture(member.getMemberPicture());
        dbMember.setFilePath(member.getFilePath());
        dbMember.setNationalId(member.getNationalId());
        dbMember.setBirthRegistrationNo(member.getBirthRegistrationNo());
        dbMember.setAdmissionFee(member.getAdmissionFee());
        dbMember.setPassbookNo(member.getPassbookNo());
        dbMember.setPassbookAmount(member.getPassbookAmount());
        dbMember.setLastAchievedDegree(member.getLastAchievedDegree());
        dbMember.setStatus(member.getStatus());

        return dbMember;
    }

    public static Member convertStorageToDomainModel(DBMember dbMember) {
        Member member = new Member();
        member.setId(dbMember.getId());
        member.setBranchId(dbMember.getBranchId());
        member.setSamityId(dbMember.getSamityId());
        member.setPrimaryProductId(dbMember.getPrimaryProductId());
        member.setName(dbMember.getName());
        member.setCode(dbMember.getCode());
        member.setGender(dbMember.getGender());
        member.setMobile(dbMember.getMobile());
        member.setFathersSpouseName(dbMember.getFathersSpouseName());
        member.setFathersSpouseRelationship(dbMember.getFathersSpouseRelationship());
        member.setMaritalStatus(dbMember.getMaritalStatus());
        member.setFatherName(dbMember.getFatherName());
        member.setSpouseName(dbMember.getSpouseName());
        member.setBirthDay(dbMember.getBirthDay());
        member.setMemberPicture(dbMember.getMemberPicture());
        member.setFilePath(dbMember.getFilePath());
        member.setNationalId(dbMember.getNationalId());
        member.setBirthRegistrationNo(dbMember.getBirthRegistrationNo());
        member.setAdmissionFee(dbMember.getAdmissionFee());
        member.setPassbookNo(dbMember.getPassbookNo());
        member.setPassbookAmount(dbMember.getPassbookAmount());
        member.setLastAchievedDegree(dbMember.getLastAchievedDegree());
        member.setStatus(dbMember.getStatus());

        return member;
    }


    public static List<Member> convertRestListToDomainModel(List<RESTMember> restMembers) {

        List<Member> members = new ArrayList<>();

        for (RESTMember restMember : restMembers) {
            members.add(convertRestToDomainModel(restMember));
        }

        // cleanup
        restMembers.clear();

        return members;
    }

    public static List<RESTMember> convertDomainListToNetworkModel(List<Member> members) {

        List<RESTMember> restMembers = new ArrayList<>();

        for (Member member : members) {
            restMembers.add(convertDomainToNetworkModel(member));
        }

        // cleanup
        members.clear();

        return restMembers;
    }

    public static List<DBMember> convertDomainListToStorageModel(List<Member> members) {

        List<DBMember> dbMembers = new ArrayList<>();

        for (Member member : members) {
            dbMembers.add(convertDomainToStorageModel(member));
        }

        // cleanup
        members.clear();

        return dbMembers;
    }


    public static List<Member> convertStorageListToDomainModel(List<DBMember> dbMembers) {

        List<Member> members = new ArrayList<>();

        for (DBMember dbMember : dbMembers) {
            members.add(convertStorageToDomainModel(dbMember));
        }

        // cleanup
        dbMembers.clear();

        return members;
    }
}
