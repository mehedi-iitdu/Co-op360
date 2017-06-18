package com.datasoft.co_op360.presentation.fieldofficer.ui.activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.datasoft.co_op360.R;
import com.datasoft.co_op360.presentation.fieldofficer.adapters.FoDetailsSavingsAdapter;
import com.datasoft.co_op360.domain.model.IndividualSavingsData;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoDetailsSavingsPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.FoDetailsSavingsPresenterImpl;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoDetailsSavingsView;

import java.util.List;

/**
 * Created by mehedi on 4/16/17.
 */

public class FoDetailsSavingsActivity extends AppCompatActivity implements FoDetailsSavingsView {

    private LinearLayoutManager linearLayoutManager;
    private FoDetailsSavingsPresenter foDetailsSavingsPresenter;
    private FoDetailsSavingsAdapter foDetailsSavingsAdapter;
    private RecyclerView recyclerView;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fo_activity_details_savings_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        foDetailsSavingsPresenter = new FoDetailsSavingsPresenterImpl(this);
        progressDialog = new ProgressDialog(this);
        recyclerView = (RecyclerView) findViewById(R.id.rv_details_savings_list);
        foDetailsSavingsPresenter.getDetailsSavingsData();
    }

    @Override
    public void showProgress() {

        progressDialog.setMessage("Savings Loading");
        progressDialog.show();
    }

    @Override
    public void hideProgress() {
        progressDialog.dismiss();
    }

    @Override
    public void showDetailsSavings(List<IndividualSavingsData> individualSavingsDataList) {

        foDetailsSavingsAdapter = new FoDetailsSavingsAdapter(this, individualSavingsDataList, foDetailsSavingsPresenter);
        recyclerView.setAdapter(foDetailsSavingsAdapter);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void editClick(IndividualSavingsData individualSavingsData) {
        Toast.makeText(getApplicationContext(), individualSavingsData.getSavingsId() + "Edit", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void deleteClick(IndividualSavingsData individualSavingsData) {
        Toast.makeText(getApplicationContext(), individualSavingsData.getSavingsId() + "Delete", Toast.LENGTH_SHORT).show();
    }

}
