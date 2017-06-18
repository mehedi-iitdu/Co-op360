package com.datasoft.co_op360.presentation.login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.datasoft.co_op360.presentation.branchmanager.BmMainActivity;
import com.datasoft.co_op360.presentation.fieldofficer.ui.activities.FoMainActivity;
import com.datasoft.co_op360.threading.MainThreadImpl;
import com.datasoft.co_op360.utils.AeSimpleSHA1;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.domain.executor.impl.ThreadExecutor;
import com.datasoft.co_op360.presentation.managementpanel.MpMainActivity;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener {

    LoginPresenter loginPresenter;
    private ProgressDialog mProgressDialog;
    private EditText mUsername;
    private EditText mPassword;
    private Button mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsername = (EditText) findViewById(R.id.username);
        mPassword = (EditText) findViewById(R.id.password);
        mLoginButton = (Button) findViewById(R.id.button_login);
        mLoginButton.setOnClickListener(this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Login");
        setSupportActionBar(toolbar);

        loginPresenter = new LoginPresenterImpl(ThreadExecutor.getInstance(), MainThreadImpl.getInstance(), this, getApplicationContext());

        //getEmployee();
    }

    @Override
    public void onDestroy() {
        loginPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void showProgress() {

        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setMessage("Please Wait...");
        mProgressDialog.show();
    }

    @Override
    public void hideProgress() {

        mProgressDialog.dismiss();
    }

    @Override
    public void setUsernameError(String usernameErrorText) {
        mUsername.setError(usernameErrorText);
    }

    @Override
    public void setPasswordError(String passwordErrorText) {
        mPassword.setError(passwordErrorText);
    }

    @Override
    public String getUsername() {
        return mUsername.getText().toString();
    }

    @Override
    public String getPassword() {
        return mPassword.getText().toString();
    }

    @Override
    public void navigateToFieldOfficerActivity() {

        mProgressDialog.dismiss();
        startActivity(new Intent(this, FoMainActivity.class));
        finish();
    }

    @Override
    public void navigateToBranchManagerActivity() {

        mProgressDialog.dismiss();
        startActivity(new Intent(this, BmMainActivity.class));
        finish();
    }

    @Override
    public void navigateToManagementPanelActivity() {

        mProgressDialog.dismiss();
        startActivity(new Intent(this, MpMainActivity.class));
        finish();
    }


    @Override
    public void showConnectionFailureMessage() {

        mProgressDialog.dismiss();
        Toast.makeText(this, "Failed to connect the server...", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {

        if (getUsername().isEmpty()) {

            setUsernameError("Username can't be empty...");
        } else if (getPassword().isEmpty()) {

            setPasswordError("Password can't be empty...");
        } else {

            loginPresenter.validateCredentials(getUsername(), convert(getPassword().toString()));
        }

    }

    private String convert(String s) {

        String hash = null;

        try {
            hash = AeSimpleSHA1.SHA1(s);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        Log.e("Hashing", hash);

        return hash;

    }

}
