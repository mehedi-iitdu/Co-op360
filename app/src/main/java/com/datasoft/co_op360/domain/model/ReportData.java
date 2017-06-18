package com.datasoft.co_op360.domain.model;

/**
 * Created by mehedi on 1/25/17.
 */

public class ReportData {

    String color_code_center;
    String color_code_sahde;
    String report_no;
    String report_name;

    public ReportData(String color_code__center, String color_code_sahde, String report_no, String report_name) {
        this.color_code_center = color_code__center;
        this.color_code_sahde = color_code_sahde;
        this.report_no = report_no;
        this.report_name = report_name;
    }

    public String getColor_code_center() {
        return color_code_center;
    }

    public void setColor_code_center(String color_code) {
        this.color_code_center = color_code;
    }


    public String getColor_code_sahde() {
        return color_code_sahde;
    }

    public void setColor_code_sahde(String color_code_sahde) {
        this.color_code_sahde = color_code_sahde;
    }

    public String getReport_no() {
        return report_no;
    }

    public void setReport_no(String report_no) {
        this.report_no = report_no;
    }

    public String getReport_name() {
        return report_name;
    }

    public void setReport_name(String report_name) {
        this.report_name = report_name;
    }

}
