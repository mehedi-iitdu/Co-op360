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
import com.datasoft.co_op360.presentation.fieldofficer.adapters.FoDetailsShareAdapter;
import com.datasoft.co_op360.domain.model.IndividualShareData;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoDetailsSharePresenter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.FoDetailsSharePresenterImpl;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoDetailsShareView;

import java.util.List;

/**
 * Created by mehedi on 4/20/17.
 */

public class FoDetailsShareActivity extends AppCompatActivity implements FoDetailsShareView {

    private LinearLayoutManager linearLayoutManager;
    private FoDetailsSharePresenter foDetailsSharePresenter;
    private FoDetailsShareAdapter foDetailsShareAdapter;
    private RecyclerView recyclerView;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fo_activity_details_share_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        foDetailsSharePresenter = new FoDetailsSharePresenterImpl(this);
        progressDialog = new ProgressDialog(this);
        recyclerView = (RecyclerView) findViewById(R.id.rv_details_share_list);
        foDetailsSharePresenter.getDetailsShareData();
    }

    @Override
    public void showProgress() {

        progressDialog.setMessage("Share Loading");
        progressDialog.show();
    }

    @Override
    public void hideProgress() {
        progressDialog.dismiss();
    }

    @Override
    public void showDetailsShare(List<IndividualShareData> individualShareDataList) {

        foDetailsShareAdapter = new FoDetailsShareAdapter(this, individualShareDataList, foDetailsSharePresenter);
        recyclerView.setAdapter(foDetailsShareAdapter);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void editClick(IndividualShareData individualShareData) {
        Toast.makeText(getApplicationContext(), individualShareData.getshareId() + "Edit", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void deleteClick(IndividualShareData individualShareData) {
        Toast.makeText(getApplicationContext(), individualShareData.getshareId() + "Delete", Toast.LENGTH_SHORT).show();
    }

}
