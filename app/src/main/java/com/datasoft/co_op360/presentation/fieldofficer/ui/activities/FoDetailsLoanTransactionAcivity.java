package com.datasoft.co_op360.presentation.fieldofficer.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.datasoft.co_op360.domain.model.IndividualLoanTransactionData;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.presentation.fieldofficer.adapters.FoDetailsLoanTransactionAdapter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoDetailsLoanTransactionPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.FoDetailsLoanTransactionPresenterImpl;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoDetailsLoanTransactionView;

import java.util.List;

/**
 * Created by mehedi on 4/19/17.
 */

public class FoDetailsLoanTransactionAcivity extends AppCompatActivity implements FoDetailsLoanTransactionView {

    private LinearLayoutManager linearLayoutManager;
    private FoDetailsLoanTransactionPresenter foDetailsLoanTransactionPresenter;
    private FoDetailsLoanTransactionAdapter foDetailsLoanTransactionAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fo_activity_details_loan_transaction);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        foDetailsLoanTransactionPresenter = new FoDetailsLoanTransactionPresenterImpl(this);
        recyclerView = (RecyclerView) findViewById(R.id.rv_details_loan_transaction_list);
        foDetailsLoanTransactionPresenter.getDetailsLoanTransactionData();
    }

    @Override
    public void showDetailsSavings(List<IndividualLoanTransactionData> individualLoanTransactionDataList) {

        foDetailsLoanTransactionAdapter = new FoDetailsLoanTransactionAdapter(this, individualLoanTransactionDataList, foDetailsLoanTransactionPresenter);
        recyclerView.setAdapter(foDetailsLoanTransactionAdapter);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void editClick(IndividualLoanTransactionData individualLoanTransactionData) {

    }

    @Override
    public void deleteClick(IndividualLoanTransactionData individualLoanTransactionData) {

    }
}
