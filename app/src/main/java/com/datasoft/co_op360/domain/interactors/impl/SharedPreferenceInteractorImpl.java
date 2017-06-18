package com.datasoft.co_op360.domain.interactors.impl;

import android.content.Context;
import android.util.Log;

import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.interactors.SharedPreferenceInteractor;
import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.network.model.RESTAuth;
import com.datasoft.co_op360.storage.sharedprefereces.SecureSharedPreferences;

/**
 * Created by mehedi on 6/3/17.
 */

public class SharedPreferenceInteractorImpl extends AbstractInteractor implements SharedPreferenceInteractor {

    private Context mContext;
    private Callback mCallback;
    private RESTAuth mRestAuth;

    public SharedPreferenceInteractorImpl(Executor threadExecutor, MainThread mainThread, Context context, Callback callback, RESTAuth restAuth) {
        super(threadExecutor, mainThread);
        mContext = context;
        mCallback = callback;
        mRestAuth = restAuth;
    }

    @Override
    public void run() {

        SecureSharedPreferences mSecureSharedPreferences = SecureSharedPreferences.getInstance(mContext, "MyPref");

        try {

            mSecureSharedPreferences.putBoolean("is_loggedIn", true);
            mSecureSharedPreferences.putString("api_key", mRestAuth.getApiKey());
            mSecureSharedPreferences.putString("name", mRestAuth.getName());
            mSecureSharedPreferences.putString("branch_id", mRestAuth.getBranchId());
            mSecureSharedPreferences.putString("branch_name", mRestAuth.getBranchName());
            mSecureSharedPreferences.putString("branch_type", mRestAuth.getBranchType());
            mSecureSharedPreferences.putString("employee_id", String.valueOf(mRestAuth.getEmployeeId()));
            mSecureSharedPreferences.putString("user_id", mRestAuth.getUserId());
            mSecureSharedPreferences.putString("organization_name", mRestAuth.getOrganizationName());

        } catch (Exception e) {

            Log.e("Exceptton", e.getMessage());
        } finally {

            Log.e("SharedPref", "Auth data saved in sharedPreference");
            mCallback.onPreferenceSaved();
        }

    }
}
