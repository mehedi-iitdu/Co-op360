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
import android.widget.Toast;

import com.datasoft.co_op360.domain.model.Member;
import com.datasoft.co_op360.domain.model.MemberListData;
import com.datasoft.co_op360.presentation.fieldofficer.adapters.FoMemberAdapter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoMemberPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.FoMemberPresenterImpl;
import com.datasoft.co_op360.presentation.fieldofficer.ui.FoMemberView;
import com.datasoft.co_op360.R;

import java.util.List;

/**
 * Created by mehedi on 5/8/17.
 */

public class FoMemberAcivity extends AppCompatActivity implements FoMemberView {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private FoMemberPresenter foMemberPresenter;
    private FoMemberAdapter adapter;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fo_activity_member);

        init();

        foMemberPresenter = new FoMemberPresenterImpl(this);
        progressDialog = new ProgressDialog(this);
        recyclerView = (RecyclerView) findViewById(R.id.rv_member_list);
        foMemberPresenter.getMemberList();
    }

    private void init() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setLogo(R.drawable.rsz_logo);
        setSupportActionBar(toolbar);
        setTitle("RESTMember");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), FoMemberAddActivity.class));
            }
        });
    }

    @Override
    public void setMemberList(List<Member> list) {

        adapter = new FoMemberAdapter(this, list, foMemberPresenter);
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
    public void onEditclick(MemberListData memberListData) {
        Toast.makeText(getApplicationContext(), memberListData.getmMemberName() + "Edit", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDeleteClick(MemberListData memberListData) {
        Toast.makeText(getApplicationContext(), memberListData.getmMemberName() + "Delete", Toast.LENGTH_SHORT).show();
    }
}
