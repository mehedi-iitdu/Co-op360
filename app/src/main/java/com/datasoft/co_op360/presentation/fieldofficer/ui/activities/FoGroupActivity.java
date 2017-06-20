package com.datasoft.co_op360.presentation.fieldofficer.ui.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.executor.impl.ThreadExecutor;
import com.datasoft.co_op360.domain.model.GroupData;
import com.datasoft.co_op360.domain.model.Samity;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoGroupPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.FoGroupPresenterImpl;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoGroupView;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.presentation.fieldofficer.adapters.FoGroupAdapter;
import com.datasoft.co_op360.threading.MainThreadImpl;

import java.util.List;

public class FoGroupActivity extends AppCompatActivity implements FoGroupView {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private FoGroupPresenter foGroupPresenter;
    private FoGroupAdapter adapter;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fo_activity_group);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setLogo(R.drawable.rsz_logo);
        setSupportActionBar(toolbar);
        setTitle("Group List");

        foGroupPresenter = new FoGroupPresenterImpl(ThreadExecutor.getInstance(), MainThreadImpl.getInstance(), this);
        progressDialog = new ProgressDialog(this);
        recyclerView = (RecyclerView) findViewById(R.id.rv_group_list);
        foGroupPresenter.getAutoProcessData();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void setProcesses(List<Samity> list) {

        adapter = new FoGroupAdapter(this, list, foGroupPresenter);
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

        /*startActivity(new Intent(this, AutoProcessMemberList.class));*/

    }
}
