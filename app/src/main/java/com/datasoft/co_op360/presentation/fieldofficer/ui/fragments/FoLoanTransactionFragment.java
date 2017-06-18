package com.datasoft.co_op360.presentation.fieldofficer.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.datasoft.co_op360.presentation.fieldofficer.adapters.LoanTransactionAdapter;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.domain.model.LoanTransactionData;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.LoanTransactionPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.LoanTransactionPresenterImpl;
import com.datasoft.co_op360.presentation.fieldofficer.ui.LoanTransactionView;
import com.datasoft.co_op360.presentation.fieldofficer.ui.activities.FoDetailsLoanTransactionAcivity;

import java.util.List;

/**
 * Created by mehedi on 4/17/17.
 */

public class FoLoanTransactionFragment extends Fragment implements LoanTransactionView {

    LoanTransactionAdapter loanTransactionAdapter;
    LoanTransactionPresenter loanTransactionPresenter;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fo_loan_transaction_fragment, null);
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_loan_transaction_list);

        loanTransactionPresenter = new LoanTransactionPresenterImpl(this);
        loanTransactionPresenter.getLoanTransactionData();

        return view;
    }

    @Override
    public void setLoanTransactions(List<LoanTransactionData> loanTransactionDataList) {

        loanTransactionAdapter = new LoanTransactionAdapter(getActivity(), loanTransactionDataList, loanTransactionPresenter);
        recyclerView.setAdapter(loanTransactionAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

    @Override
    public void itemClick(LoanTransactionData loanTransactionData) {

        startActivity(new Intent(getActivity(), FoDetailsLoanTransactionAcivity.class));
    }
}
