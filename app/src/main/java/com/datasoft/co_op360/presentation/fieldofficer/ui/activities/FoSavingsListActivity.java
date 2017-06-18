package com.datasoft.co_op360.presentation.fieldofficer.ui.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoSavingsPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.FoSavingsPresenterImpl;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.presentation.fieldofficer.adapters.FoSavingsAdapter;
import com.datasoft.co_op360.domain.model.SavingsListItemData;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoSavingsListView;

import java.util.List;

/**
 * Created by mehedi on 4/11/17.
 */

public class FoSavingsListActivity extends AppCompatActivity implements FoSavingsListView {

    private LinearLayoutManager linearLayoutManager;
    private FoSavingsPresenter foSavingsPresenter;
    private FoSavingsAdapter foSavingsAdapter;
    private RecyclerView recyclerView;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fo_activity_savings_list);

        init();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.rv_savings_list);
        progressDialog = new ProgressDialog(this);

        foSavingsPresenter = new FoSavingsPresenterImpl(this);
        foSavingsPresenter.getAllSavings();
    }

    private void init() {

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), FoSavingsAddActivity.class));
            }
        });
    }

    @Override
    public void showSavings(List<SavingsListItemData> savingsListItemDatas) {

        foSavingsAdapter = new FoSavingsAdapter(this, savingsListItemDatas, foSavingsPresenter);
        recyclerView.setAdapter(foSavingsAdapter);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
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
    public void ItemClick(SavingsListItemData savingsListItemData) {

        startActivity(new Intent(getApplicationContext(), FoDetailsSavingsActivity.class));
    }


}
