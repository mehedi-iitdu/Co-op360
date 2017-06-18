package com.datasoft.co_op360.storage.converters;

import com.datasoft.co_op360.domain.model.Loan;
import com.datasoft.co_op360.storage.model.DBLoan;
import com.datasoft.co_op360.network.model.RESTLoan;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 6/6/17.
 */

public class LoanModelConverter {

    public static Loan convertRestToDoaminModel(RESTLoan restLoan) {

        Loan loan = new Loan();
        loan.setId(restLoan.getId());
        loan.setCode(restLoan.getCode());
        loan.setSid(restLoan.getSid());
        loan.setPid(restLoan.getPid());
        loan.setMid(restLoan.getMid());
        loan.setIrId(restLoan.getIrId());
        loan.setLAmt(restLoan.getLAmt());
        loan.setTotalInstallment(restLoan.getTotalInstallment());
        loan.setInstNo(restLoan.getInstNo());
        loan.setInstAmt(restLoan.getInstAmt());
        loan.setType(restLoan.getType());
        loan.setCycle(restLoan.getCycle());
        loan.setRDate(restLoan.getRDate());
        loan.setRFrequency(restLoan.getRFrequency());
        loan.setOPrinciple(restLoan.getOPrinciple());
        loan.setInterest(restLoan.getInterest());
        loan.setOOutstanding(restLoan.getOOutstanding());
        loan.setODue(restLoan.getODue());
        loan.setOAdvance(restLoan.getOAdvance());
        loan.setOInterest(restLoan.getOInterest());
        loan.setOPrinciple(restLoan.getOPrinciple());
        loan.setDue(restLoan.getDue());
        loan.setAdv(restLoan.getAdv());
        loan.setBal(restLoan.getBal());
        loan.setIsAuto(restLoan.getIsAuto());

        return loan;
    }

    public static RESTLoan convertDomainToRestModel(Loan loan) {

        RESTLoan restLoan = new RESTLoan();
        restLoan.setId(loan.getId());
        restLoan.setCode(loan.getCode());
        restLoan.setSid(loan.getSid());
        restLoan.setPid(loan.getPid());
        restLoan.setMid(loan.getMid());
        restLoan.setIrId(loan.getIrId());
        restLoan.setLAmt(loan.getLAmt());
        restLoan.setTotalInstallment(loan.getTotalInstallment());
        restLoan.setInstNo(loan.getInstNo());
        restLoan.setInstAmt(loan.getInstAmt());
        restLoan.setType(loan.getType());
        restLoan.setCycle(loan.getCycle());
        restLoan.setRDate(loan.getRDate());
        restLoan.setRFrequency(loan.getRFrequency());
        restLoan.setOPrinciple(loan.getOPrinciple());
        restLoan.setInterest(loan.getInterest());
        restLoan.setOOutstanding(loan.getOOutstanding());
        restLoan.setODue(loan.getODue());
        restLoan.setOAdvance(loan.getOAdvance());
        restLoan.setOInterest(loan.getOInterest());
        restLoan.setOPrinciple(loan.getOPrinciple());
        restLoan.setDue(loan.getDue());
        restLoan.setAdv(loan.getAdv());
        restLoan.setBal(loan.getBal());
        restLoan.setIsAuto(loan.getIsAuto());

        return restLoan;
    }

    public static DBLoan convertDomainToStorageModel(Loan loan) {

        DBLoan dbLoan = new DBLoan();
        dbLoan.setId(loan.getId());
        dbLoan.setCode(loan.getCode());
        dbLoan.setSid(loan.getSid());
        dbLoan.setPid(loan.getPid());
        dbLoan.setMid(loan.getMid());
        dbLoan.setIrId(loan.getIrId());
        dbLoan.setLAmt(loan.getLAmt());
        dbLoan.setTotalInstallment(loan.getTotalInstallment());
        dbLoan.setInstNo(loan.getInstNo());
        dbLoan.setInstAmt(loan.getInstAmt());
        dbLoan.setType(loan.getType());
        dbLoan.setCycle(loan.getCycle());
        dbLoan.setRDate(loan.getRDate());
        dbLoan.setRFrequency(loan.getRFrequency());
        dbLoan.setOPrinciple(loan.getOPrinciple());
        dbLoan.setInterest(loan.getInterest());
        dbLoan.setOOutstanding(loan.getOOutstanding());
        dbLoan.setODue(loan.getODue());
        dbLoan.setOAdvance(loan.getOAdvance());
        dbLoan.setOInterest(loan.getOInterest());
        dbLoan.setOPrinciple(loan.getOPrinciple());
        dbLoan.setDue(loan.getDue());
        dbLoan.setAdv(loan.getAdv());
        dbLoan.setBal(loan.getBal());
        dbLoan.setIsAuto(loan.getIsAuto());

        return dbLoan;
    }

    public static Loan convertStorageToDomainModel(DBLoan dbLoan) {

        Loan loan = new Loan();
        loan.setId(dbLoan.getId());
        loan.setCode(dbLoan.getCode());
        loan.setSid(dbLoan.getSid());
        loan.setPid(dbLoan.getPid());
        loan.setMid(dbLoan.getMid());
        loan.setIrId(dbLoan.getIrId());
        loan.setLAmt(dbLoan.getLAmt());
        loan.setTotalInstallment(dbLoan.getTotalInstallment());
        loan.setInstNo(dbLoan.getInstNo());
        loan.setInstAmt(dbLoan.getInstAmt());
        loan.setType(dbLoan.getType());
        loan.setCycle(dbLoan.getCycle());
        loan.setRDate(dbLoan.getRDate());
        loan.setRFrequency(dbLoan.getRFrequency());
        loan.setOPrinciple(dbLoan.getOPrinciple());
        loan.setInterest(dbLoan.getInterest());
        loan.setOOutstanding(dbLoan.getOOutstanding());
        loan.setODue(dbLoan.getODue());
        loan.setOAdvance(dbLoan.getOAdvance());
        loan.setOInterest(dbLoan.getOInterest());
        loan.setOPrinciple(dbLoan.getOPrinciple());
        loan.setDue(dbLoan.getDue());
        loan.setAdv(dbLoan.getAdv());
        loan.setBal(dbLoan.getBal());
        loan.setIsAuto(dbLoan.getIsAuto());

        return loan;
    }


    public static List<Loan> convertRestListToDoaminModel(List<RESTLoan> restLoans) {

        List<Loan> loans = new ArrayList<>();

        for (RESTLoan rest : restLoans) {
            loans.add(convertRestToDoaminModel(rest));
        }

        // cleanup
        restLoans.clear();

        return loans;
    }

    public static List<RESTLoan> convertDomainListToRestModel(List<Loan> loans) {

        List<RESTLoan> restLoans = new ArrayList<>();

        for (Loan loan : loans) {
            restLoans.add(convertDomainToRestModel(loan));
        }

        // cleanup
        loans.clear();

        return restLoans;
    }

    public static List<DBLoan> convertDomainListToStorageModel(List<Loan> loans) {

        List<DBLoan> dbLoans = new ArrayList<>();

        for (Loan loan : loans) {
            dbLoans.add(convertDomainToStorageModel(loan));
        }

        // cleanup
        loans.clear();

        return dbLoans;
    }


    public static List<Loan> convertStorageListToDomainModel(List<DBLoan> dbLoans) {

        List<Loan> loans = new ArrayList<>();

        for (DBLoan db : dbLoans) {
            loans.add(convertStorageToDomainModel(db));
        }

        // cleanup
        dbLoans.clear();

        return loans;
    }
}
