package com.datasoft.co_op360.utils.chart;

import android.content.Context;
import android.graphics.Color;

import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;

/**
 * Created by jahid on 3/8/17.
 */

public class CustomBarChart {

    private static int[] barChartColors = new int[]{Color.parseColor("#A8CC66"),  Color.parseColor("#F9A71A"),Color.parseColor("#1588BB")};
    private final com.github.mikephil.charting.charts.BarChart mBarChart;
    private final Context mContext;
    private final String[] mLabels;
    private final ArrayList<Float> mXValueList;

    private CustomBarChart(Builder builder){
        this.mBarChart = builder.mBarChart;
        this.mContext = builder.mContext;
        this.mLabels = builder.mLabels;
        mXValueList = builder.mXValueList;
    }

    public static class Builder {

        private final com.github.mikephil.charting.charts.BarChart mBarChart;
        private final Context mContext;
        private final String[] mLabels;
        private final ArrayList<Float> mXValueList;

        public Builder(com.github.mikephil.charting.charts.BarChart barChart, Context context, ArrayList<Float> xValueList, String[] labels) {
            this.mBarChart = barChart;
            this.mContext = context;
            mLabels = labels;
            mXValueList = xValueList;

            mBarChart.setDrawBarShadow(false);
            mBarChart.setDrawValueAboveBar(true);

            mBarChart.getDescription().setEnabled(false);

            // if more than 60 entries are displayed in the chart, no values will be
            // drawn
            mBarChart.setMaxVisibleValueCount(10);

            // scaling can now only be done on x- and y-axis separately
            mBarChart.setPinchZoom(false);

            mBarChart.setDrawGridBackground(false);
            // mBarChart.setDrawYLabels(false);

            IAxisValueFormatter xAxisFormatter =  new MyXAxisValueFormatter( mXValueList,mLabels);

            XAxis xAxis = mBarChart.getXAxis();
            xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
           // xAxis.setTypeface(mTfLight);
            xAxis.setDrawGridLines(false);
            xAxis.setGranularity(1f); // only intervals of 1 day
            xAxis.setLabelCount(3);
            xAxis.setValueFormatter(xAxisFormatter);

            IAxisValueFormatter custom = new MyAxisValueFormatter();

            YAxis leftAxis = mBarChart.getAxisLeft();
          //  leftAxis.setTypeface(mTfLight);
            leftAxis.setLabelCount(5, false);
            leftAxis.setValueFormatter(custom);
            leftAxis.setPosition(YAxis.YAxisLabelPosition.OUTSIDE_CHART);
            leftAxis.setSpaceTop(15f);
            leftAxis.setAxisMinimum(0f); // this replaces setStartAtZero(true)

            YAxis rightAxis = mBarChart.getAxisRight();
            rightAxis.setDrawGridLines(false);
            rightAxis.setEnabled(false);
            //rightAxis.setTypeface(mTfLight);
            rightAxis.setLabelCount(3, false);
            rightAxis.setValueFormatter(custom);
            rightAxis.setSpaceTop(15f);
            rightAxis.setAxisMinimum(0f); // this replaces setStartAtZero(true)

            Legend l = mBarChart.getLegend();
            l.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
            l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.LEFT);
            l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
            l.setDrawInside(false);
            l.setEnabled(false);
            l.setForm(Legend.LegendForm.SQUARE);
            l.setFormSize(9f);
            l.setTextSize(11f);
            l.setXEntrySpace(4f);
            // l.setExtra(ColorTemplate.VORDIPLOM_COLORS, new String[] { "abc",
            // "def", "ghj", "ikl", "mno" });
            // l.setCustom(ColorTemplate.VORDIPLOM_COLORS, new String[] { "abc",
            // "def", "ghj", "ikl", "mno" });

            XYMarkerView mv = new XYMarkerView(mContext, xAxisFormatter);
            mv.setChartView(mBarChart); // For bounds control
            mBarChart.setMarker(mv); // Set the marker to the chart
            mBarChart.animateXY(3000, 3000);
            //setData(2 ,3);

        }
        public void generate(ArrayList<BarEntry> barEntries){

            BarDataSet set1;

            if (mBarChart.getData() != null &&
                    mBarChart.getData().getDataSetCount() > 0) {
                set1 = (BarDataSet) mBarChart.getData().getDataSetByIndex(0);
                set1.setValues(barEntries);
                mBarChart.getData().notifyDataChanged();
                mBarChart.notifyDataSetChanged();
            } else {
                set1 = new BarDataSet(barEntries, "");

                // set1.setDrawIcons(false);

                set1.setColors(barChartColors);

                ArrayList<IBarDataSet> dataSets = new ArrayList<IBarDataSet>();
                dataSets.add(set1);

                BarData data = new BarData(dataSets);
                data.setValueTextSize(10f);
                data.setBarWidth(0.9f);

                mBarChart.setData(data);
                mBarChart.invalidate();
            }

        }


    }


}
