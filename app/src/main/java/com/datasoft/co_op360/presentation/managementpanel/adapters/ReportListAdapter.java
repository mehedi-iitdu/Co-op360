package com.datasoft.co_op360.presentation.managementpanel.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.datasoft.co_op360.presentation.managementpanel.report.ReportData;
import com.datasoft.co_op360.presentation.managementpanel.report.ReportPresenter;
import com.datasoft.co_op360.utils.Shape;
import com.datasoft.co_op360.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 1/25/17.
 */

public class ReportListAdapter extends RecyclerView.Adapter<ReportListAdapter.ReportViewHolder> {

    Context context;
    List<ReportData> reportData = new ArrayList<>();
    LayoutInflater inflater;
    ReportPresenter reportPresenter;

    @Override
    public ReportViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.fo_report_item, parent, false);
        ReportViewHolder reportViewHolder = new ReportViewHolder(view);
        return reportViewHolder;
    }

    public ReportListAdapter(Context context, List<ReportData> reportData, ReportPresenter reportPresenter) {
        this.context = context;
        this.reportData = reportData;
        this.reportPresenter = reportPresenter;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public void onBindViewHolder(ReportViewHolder holder, int position) {
        holder.bind(reportData.get(position), reportPresenter);

    }

    @Override
    public int getItemCount() {
        return reportData.size();
    }

    public class ReportViewHolder extends RecyclerView.ViewHolder {

        TextView report_no;
        TextView report_name;

        public ReportViewHolder(View itemView) {
            super(itemView);

            report_no = (TextView) itemView.findViewById(R.id.report_no);
            report_name = (TextView) itemView.findViewById(R.id.report_name);
        }

        public void bind(final ReportData reportData, final ReportPresenter reportPresenter) {

            report_no.setText(reportData.getReport_no());
            report_name.setText(reportData.getReport_name());
            String color_code_center = reportData.getColor_code_center();
            String color_code_shade = reportData.getColor_code_sahde();
            report_no.setBackgroundDrawable(Shape.drawCircle(context, 50, 50, Color.parseColor(color_code_center), Color.parseColor(color_code_shade)));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    reportPresenter.itemClick(reportData);
                }
            });

        }
    }
}
