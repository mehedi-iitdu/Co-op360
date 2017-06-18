package com.datasoft.co_op360.presentation.fieldofficer.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.AutoCompleteTextView;

import com.datasoft.co_op360.domain.model.GroupData;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.presentation.fieldofficer.adapters.AutoCompleteGroupsAdapter;
import com.datasoft.co_op360.presentation.fieldofficer.interactors.impl.FoGroupInteractorImpl;

import java.util.List;

/**
 * Created by mehedi on 4/6/17.
 */

public class FoMemberAddActivity extends AppCompatActivity {

    FoGroupInteractorImpl foGroupInteractor = new FoGroupInteractorImpl();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fo_activity_member_add);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        init();
    }

    public void init() {

        /*int layoutItemId = android.R.layout.simple_dropdown_item_1line;*/
        final List<GroupData> groupDatas = foGroupInteractor.createArrayList();
        final AutoCompleteGroupsAdapter adapter = new AutoCompleteGroupsAdapter(this, groupDatas);

        final AutoCompleteTextView autoCompleteTextView =
                (AutoCompleteTextView) findViewById(R.id.auto_complete_tv_group_name);
        autoCompleteTextView.setAdapter(adapter);

    }

}
