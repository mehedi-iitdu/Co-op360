package com.datasoft.co_op360.presentation.branchmanager.process;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.datasoft.co_op360.R;
import com.datasoft.co_op360.presentation.branchmanager.adapters.ProcessCardAdapter;
import com.datasoft.co_op360.utils.GridAutoFitLayoutManager;
import com.datasoft.co_op360.utils.ItemOffsetDecoration;

import java.util.List;

/**
 * Created by Ratan on 7/29/2015.
 */
public class BmProcessFragment extends Fragment implements ProcessView {

    RecyclerView recyclerView;
    GridLayoutManager gridLayoutManager;
    ProcessCardAdapter adapter;
    ProcessPresenter processPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Log.e("onCreateView", "Process");

        View view = inflater.inflate(R.layout.bm_process_fragment, null);
        recyclerView = (RecyclerView) view.findViewById(R.id.cv_process_list);
        processPresenter = new ProcessPresenterImpl(this);
        processPresenter.getProcessData();

        return view;
    }


    public static float dipToPixels(Context context, float dipValue) {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dipValue, metrics);
    }

    @Override
    public void setProcesses(List<ProcessData> list) {

        Log.e("Set Process", list.toString());

        adapter = new ProcessCardAdapter(getActivity(), list, processPresenter);
        recyclerView.setAdapter(adapter);
        gridLayoutManager = new GridAutoFitLayoutManager(getActivity(), (int) dipToPixels(getContext(), (float) 150));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.addItemDecoration(new ItemOffsetDecoration(getActivity(), R.dimen.item_offset));
    }


    @Override
    public void onItemclick(ProcessData processData) {

        Toast.makeText(getContext(), processData.getProcess_name(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        processPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onResume() {
        super.onResume();
        processPresenter.getProcessData();
    }

}
