package com.datasoft.co_op360.presentation.fieldofficer.ui.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.datasoft.co_op360.domain.model.Samity;
import com.datasoft.co_op360.presentation.fieldofficer.adapters.FoAutoProcessAdapter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.AutoProcessGroupListView;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.domain.executor.impl.ThreadExecutor;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoAutoProcessPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.FoAutoProcessPresenterImpl;
import com.datasoft.co_op360.threading.MainThreadImpl;

import java.util.List;

public class AutoProcessGroupList extends AppCompatActivity implements AutoProcessGroupListView {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private FoAutoProcessPresenter foAutoProcessPresenter;
    private FoAutoProcessAdapter adapter;
    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fo_group_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setLogo(R.drawable.rsz_logo);
        setSupportActionBar(toolbar);
        setTitle("Auto Process");

        foAutoProcessPresenter = new FoAutoProcessPresenterImpl(ThreadExecutor.getInstance(), MainThreadImpl.getInstance(), this);
        progressDialog = new ProgressDialog(this);
        recyclerView = (RecyclerView) findViewById(R.id.rv_group_list);
        foAutoProcessPresenter.getAutoProcessData();

    }

    @Override
    public void setProcesses(List<Samity> list) {

        adapter = new FoAutoProcessAdapter(this, list, foAutoProcessPresenter);
        recyclerView.setAdapter(adapter);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void showProgress() {

        progressDialog.setMessage("Group Loading");
        progressDialog.show();
    }

    @Override
    public void hideProgress() {

        progressDialog.dismiss();
    }

    @Override
    public void onItemclick(Samity samity) {

        startActivity(new Intent(this, AutoProcessMemberList.class));
    }
}
