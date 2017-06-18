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

import com.datasoft.co_op360.domain.model.ShareListItemData;
import com.datasoft.co_op360.presentation.fieldofficer.adapters.FoShareAdapter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoSharePresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoShareListView;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.FoSharePresenterImpl;

import java.util.List;

/**
 * Created by mehedi on 4/17/17.
 */

public class FoShareListActivity extends AppCompatActivity implements FoShareListView {

    private LinearLayoutManager linearLayoutManager;
    private FoSharePresenter foSharePresenter;
    private FoShareAdapter foShareAdapter;
    private RecyclerView recyclerView;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fo_activity_share_list);

        init();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.rv_share_list);
        progressDialog = new ProgressDialog(this);

        foSharePresenter = new FoSharePresenterImpl(this);
        foSharePresenter.getAllShares();
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
    public void showShares(List<ShareListItemData> shareListItemDataList) {

        foShareAdapter = new FoShareAdapter(this, shareListItemDataList, foSharePresenter);
        recyclerView.setAdapter(foShareAdapter);
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
    public void ItemClick(ShareListItemData shareListItemData) {

        startActivity(new Intent(getApplicationContext(), FoDetailsShareActivity.class));
    }


}
