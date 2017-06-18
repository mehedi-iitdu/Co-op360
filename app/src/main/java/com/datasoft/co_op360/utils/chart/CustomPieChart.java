package com.datasoft.co_op360.utils.chart;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;

import com.datasoft.co_op360.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;

import java.util.ArrayList;

/**
 * Created by jahid on 1/18/17.
 */

public class CustomPieChart {
    private static int[] pieChartColors = new int[]{Color.parseColor("#1588BB"), Color.parseColor("#F9A71A")};
    private final PieChart pieChart;
    private final ArrayList<String> labelList;
    private final Context context;

    private CustomPieChart(Builder builder){
        this.pieChart = builder.pieChart;
        this.labelList = builder.labelList;
        this.context = builder.context;

    }
    public static class Builder{
        private final PieChart pieChart;
        private ArrayList<String> labelList;
        private final Context context;
        public Builder(PieChart pieChart, Context context){
            this.pieChart = pieChart;
            this.context = context;
            this.pieChart.setEntryLabelTextSize(8f);
            this.pieChart.getDescription().setEnabled(false);
            this.pieChart.highlightValues(null);
            pieChart.animateY(2000);
            this.pieChart.setDrawEntryLabels(false);
            this.pieChart.setHoleColor(context.getResources().getColor(R.color.colorIcons));
            this.pieChart.setUsePercentValues(true);

          // this.pieChart.setExtraOffsets(5, 10, 5, 50);

            Legend l = pieChart.getLegend();
            l.setVerticalAlignment(Legend.LegendVerticalAlignment.BOTTOM);
            l.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
            l.setOrientation(Legend.LegendOrientation.HORIZONTAL);
            /// l.setXEntrySpace(10f);
            l.setDrawInside(false);
            l.setXEntrySpace(7f);
            l.setYEntrySpace(1f);
            l.setYOffset(1f);
            pieChart.setRotationAngle(0);
            pieChart.setRotationEnabled(false);
           // l.setEnabled(false);

        }
        public Builder setHole(float radius){
            this.pieChart.setHoleRadius(radius);
            return this;
        }
        public Builder setLabel(ArrayList<String> labelList){
            this.labelList = labelList;
            return this;
        }

        public Builder setPercentEnable(boolean val){
            this.pieChart.setUsePercentValues(val);
            return this;
        }
        public Builder setCenterText( String text, String value){
           this.pieChart.setCenterTextSize(9f);
            this.pieChart.setCenterText(generateCenterSpannableText(text, value));
            return this;
        }
        public CustomPieChart build(){
            return new CustomPieChart(this);
        }

        protected SpannableStringBuilder generateCenterSpannableText(String text, String value) {

            SpannableStringBuilder builder = new SpannableStringBuilder();
            SpannableString redSpannable= new SpannableString(text);
            redSpannable.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.colorPrimaryText)), 0, text.length(), 0);
            builder.append(redSpannable);

            String white = "\n"+value;
            SpannableString whiteSpannable= new SpannableString(white);
            whiteSpannable.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.colorPrimary)), 0, white.length(), 0);
            builder.append(whiteSpannable);
            return builder;
        }

    }
    public void generate(ArrayList<Float> dataList){
        ArrayList<PieEntry> entries = new ArrayList<>();
        String label = "";
        for(int i = 0; i < dataList.size(); i++){
            float data = dataList.get(i);
            if(labelList != null && labelList.size() > 0)
             label = labelList.get(i);
            entries.add(new PieEntry(data, label, 0));

        }
        PieDataSet dataSet = new PieDataSet(entries, "");
            dataSet.setColors(pieChartColors); //
        dataSet.setDrawValues(true);
        dataSet.setValueFormatter(new PercentFormatter());
        dataSet.setValueTextColor(Color.WHITE);
        dataSet.setValueTextSize(8f);



       // dataSet
        dataSet.setHighlightEnabled(true);
        //  dataSet.setDrawHighlightIndicators(true);
        //   dataSet.setHighlightColor(Color.BLACK);


        PieData data = new PieData( dataSet);
        pieChart.setData(data);
    }

}
