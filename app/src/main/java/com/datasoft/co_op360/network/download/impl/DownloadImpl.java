package com.datasoft.co_op360.network.download.impl;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.datasoft.co_op360.network.download.Download;
import com.datasoft.co_op360.network.download.DownloadConfiguration;
import com.datasoft.co_op360.network.download.DownloadMember;
import com.datasoft.co_op360.network.download.DownloadSaving;
import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.network.download.DownloadEducationalQualification;
import com.datasoft.co_op360.network.download.DownloadEmployee;
import com.datasoft.co_op360.network.download.DownloadLoan;
import com.datasoft.co_op360.network.download.DownloadSamity;
import com.datasoft.co_op360.storage.sharedprefereces.SecureSharedPreferences;

/**
 * Created by mehedi on 6/1/17.
 */

public class DownloadImpl extends AsyncTask<String, String, String> implements Download,
        DownloadConfiguration.CallBack,
        DownloadEducationalQualification.CallBack,
        DownloadMember.CallBack,
        DownloadLoan.CallBack,
        DownloadSaving.CallBack,
        DownloadEmployee.CallBack,
        DownloadSamity.CallBack {

    private Executor threadExecutor;
    private MainThread mainThread;
    private Context mcontext;
    private Callback mCallback;
    private SecureSharedPreferences msecureSharedPreferences;
    private String mApi_key;
    private int mFo_id;
    private int mBranch_id;

    public DownloadImpl(Executor threadExecutor, MainThread mainThread, Context context, Callback callback) {
        this.threadExecutor = threadExecutor;
        this.mainThread = mainThread;
        mcontext = context;
        mCallback = callback;
        msecureSharedPreferences = SecureSharedPreferences.getInstance(mcontext, "MyPref");
        init();
    }

    private void init() {
        mApi_key = msecureSharedPreferences.getString("api_key", null);
        /*mFo_id = Integer.parseInt(msecureSharedPreferences.getString("employee_id", null));
        mBranch_id = Integer.parseInt(msecureSharedPreferences.getString("branch_id", null));*/
        mFo_id = 1;
        mBranch_id = 2;
    }

    @Override
    protected String doInBackground(String... params) {

        downloadConfig();
        return null;
    }

    @Override
    public void downloadConfig() {
        Log.e("DownloadImpl", "Downloading Configuration");
        new DownloadConfigurationImpl(threadExecutor, mainThread, this, mApi_key).execute();
    }

    @Override
    public void downloadEducationalQualification() {
        Log.e("DownloadImpl", "Downloading EducationalQualification");
        new DownloadEducationalQualificationImpl(threadExecutor, mainThread, this, mApi_key).execute();
    }

    @Override
    public void downloadMember() {
        Log.e("DownloadImpl", "Downloading Member");
        new DownloadMemberImpl(threadExecutor, mainThread, this, mApi_key, mFo_id, mBranch_id).execute();
    }

    @Override
    public void downloadLoan() {

        Log.e("DownloadImpl", "Downloading Loan");
        new DownloadLoanImpl(threadExecutor, mainThread, this, mApi_key, mFo_id, mBranch_id).execute();
    }

    @Override
    public void downloadSaving() {
        Log.e("DownloadImpl", "Downloading Saving");
        new DownloadSavingImpl(threadExecutor, mainThread, this, mApi_key, mFo_id, mBranch_id).execute();
    }

    @Override
    public void downloadEmployee() {
        Log.e("DownloadImpl", "Downloading Employee");
        new DownloadEmployeeImpl(threadExecutor, mainThread, this, mApi_key, mFo_id).execute();
    }

    @Override
    public void downloadSamity() {
        Log.e("DownloadImpl", "Downloading Samity");
        new DownloadSamityImpl(threadExecutor, mainThread, this, mApi_key, mFo_id, mBranch_id).execute();
    }

    @Override
    public void onConfigurationDownloaded() {
        Log.e("DownloadImpl", "Configuration downloaded");
        downloadEducationalQualification();
    }

    @Override
    public void onConfigurationDownloadError() {

    }


    @Override
    public void onEducationalQualificationDownloaded() {
        Log.e("DownloadImpl", "EducationalQualification downloaded");
        downloadMember();
    }

    @Override
    public void onEducationalQualificationDownloadError() {

    }

    @Override
    public void onMemberDownloaded() {
        Log.e("DownloadImpl", "Member downloaded");
        downloadLoan();
    }

    @Override
    public void onMemberDownloadError() {

    }

    @Override
    public void onLoanDownloaded() {

        Log.e("DownloadImpl", "Loan downloaded");
        downloadSaving();
    }

    @Override
    public void onLoanDownloadError() {

    }

    @Override
    public void onSavingDownloaded() {
        Log.e("DownloadImpl", "Saving downloaded");
        downloadEmployee();
    }

    @Override
    public void onSavingDownloadError() {

    }

    @Override
    public void onEmployeeDownloaded() {
        Log.e("DownloadImpl", "Employee downloaded");
        downloadSamity();
    }

    @Override
    public void onEmployeeDownloadError() {

    }

    @Override
    public void onSamityDownloaded() {
        Log.e("DownloadImpl", "Samity downloaded");
        mainThread.post(new Runnable() {
            @Override
            public void run() {
                mCallback.onDownloadComplete();
            }
        });
    }

    @Override
    public void onSamityDownloadError() {

    }
}
