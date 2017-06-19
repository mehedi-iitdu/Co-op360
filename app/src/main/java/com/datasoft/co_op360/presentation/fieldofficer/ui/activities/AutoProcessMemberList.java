package com.datasoft.co_op360.presentation.fieldofficer.ui.activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.datasoft.co_op360.domain.executor.impl.ThreadExecutor;
import com.datasoft.co_op360.domain.model.Member;
import com.datasoft.co_op360.domain.model.MemberListData;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoAutoProcessMemberListPresenter;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.presentation.fieldofficer.adapters.FoAutoProcessMemberListAdapter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.FoAutoProcessMemberListPresenterImpl;
import com.datasoft.co_op360.presentation.fieldofficer.ui.AutoProcessMemberListView;
import com.datasoft.co_op360.threading.MainThreadImpl;

import java.util.List;

public class AutoProcessMemberList extends AppCompatActivity implements AutoProcessMemberListView {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private FoAutoProcessMemberListPresenter foAutoProcessMemberListPresenter;
    private FoAutoProcessMemberListAdapter adapter;
    private ProgressDialog progressDialog;
    private int mSamityId;
    Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fo_auto_process_member_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setLogo(R.drawable.rsz_logo);
        setSupportActionBar(toolbar);
        setTitle("Group Wise Member List");

        mIntent = getIntent();
        mSamityId = mIntent.getIntExtra("SamityId", 0);

        foAutoProcessMemberListPresenter = new FoAutoProcessMemberListPresenterImpl(ThreadExecutor.getInstance(), MainThreadImpl.getInstance(), this);
        progressDialog = new ProgressDialog(this);
        recyclerView = (RecyclerView) findViewById(R.id.rv_member_list);
        foAutoProcessMemberListPresenter.getMemberList(mSamityId);

        Log.e("SamityId", String.valueOf(mSamityId));
    }

    @Override
    public void setProcesses(List<Member> list) {

        adapter = new FoAutoProcessMemberListAdapter(this, list, foAutoProcessMemberListPresenter);
        recyclerView.setAdapter(adapter);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void showProgress() {

        progressDialog.setMessage("Members Loading");
        progressDialog.show();
    }

    @Override
    public void hideProgress() {

        progressDialog.dismiss();
    }

    @Override
    public void onItemclick(Member member) {

        startActivity(new Intent(this, AutoProcessEntryActivity.class));
        finish();
    }
}
