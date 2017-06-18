package com.datasoft.co_op360.utils.chart;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

import java.util.ArrayList;

/**
 * Created by jahid on 3/9/17.
 */

public class MyXAxisValueFormatter implements IAxisValueFormatter {

    private String[] mValues;
    private  ArrayList<Float> mXValueList;

    public MyXAxisValueFormatter(ArrayList<Float> xValueList, String[] values) {
        this.mValues = values;
        mXValueList = xValueList;
    }

    @Override
    public String getFormattedValue(float value, AxisBase axis) {
        try {
            int idx  = mXValueList.indexOf(value);
            return mValues[idx];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mValues[0];
    }


    public int getDecimalDigits() { return 0; }
}
