package com.datasoft.co_op360.storage.sharedprefereces;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.datasoft.co_op360.network.model.RESTAuth;

/**
 * Created by mehedi on 6/3/17.
 */

public class SaveToPreferences {

    public void saveToSharedPreference(Context context, RESTAuth restAuth) {

        SecureSharedPreferences mSecureSharedPreferences = SecureSharedPreferences.getInstance(context, "MyPref");

        try {

            mSecureSharedPreferences.putBoolean("is_loggedIn", true);
            mSecureSharedPreferences.putString("api_key", restAuth.getApiKey());
            mSecureSharedPreferences.putString("name", restAuth.getName());
            mSecureSharedPreferences.putString("branch_id", restAuth.getBranchId());
            mSecureSharedPreferences.putString("branch_name", restAuth.getBranchName());
            mSecureSharedPreferences.putString("branch_type", restAuth.getBranchType());
            mSecureSharedPreferences.putString("employee_id", String.valueOf(restAuth.getEmployeeId()));
            mSecureSharedPreferences.putString("user_id", restAuth.getUserId());
            mSecureSharedPreferences.putString("organization_name", restAuth.getOrganizationName());

        } catch (Exception e) {

            Log.e("Exceptton", e.getMessage());
        } finally {

            Toast.makeText(context, "Login Data is saved is SharedPreference", Toast.LENGTH_SHORT).show();
        }
    }
}
