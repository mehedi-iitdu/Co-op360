package com.datasoft.co_op360.presentation.login;

import android.content.Context;
import android.util.Log;

import com.datasoft.co_op360.domain.interactors.impl.SharedPreferenceInteractorImpl;
import com.datasoft.co_op360.network.download.Download;
import com.datasoft.co_op360.network.model.RESTAuth;
import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.interactors.LoginInteractor;
import com.datasoft.co_op360.domain.interactors.SharedPreferenceInteractor;
import com.datasoft.co_op360.domain.interactors.impl.LoginInteractorImpl;
import com.datasoft.co_op360.network.download.impl.DownloadImpl;

/**
 * Created by mehedi on 3/14/17.
 */

public class LoginPresenterImpl extends AbstractPresenter implements LoginPresenter, LoginInteractor.Callback, Download.Callback, SharedPreferenceInteractor.Callback {

    private LoginView loginView;
    private Context mContext;

    public LoginPresenterImpl(Executor executor, MainThread mainThread, LoginView loginView, Context context) {
        super(executor, mainThread);
        this.loginView = loginView;
        mContext = context;
    }

    @Override
    public void validateCredentials(String username, String password) {

        if (loginView != null) {
            loginView.showProgress();
        }

        new LoginInteractorImpl(mExecutor, mMainThread, this, username, password).execute();
    }

    @Override
    public void onDestroy() {
        loginView = null;
    }

    @Override
    public void onUsernameError() {
        if (loginView != null) {
            loginView.hideProgress();
            loginView.setUsernameError("Invalid Username");
        }
    }

    @Override
    public void onPasswordError() {

        if (loginView != null) {
            loginView.hideProgress();
            loginView.setPasswordError("Invalid Password");
        }
    }

    @Override
    public void download(RESTAuth restAuth) {

        new SharedPreferenceInteractorImpl(mExecutor, mMainThread, mContext, this, restAuth).execute();
    }

    @Override
    public void onConnectionFailure() {
        if (loginView != null) {
            loginView.hideProgress();
            loginView.showConnectionFailureMessage();
        }
    }

    @Override
    public void onDownloadComplete() {

        Log.e("Donwload", "Download Completed");
        loginView.navigateToFieldOfficerActivity();
    }


    @Override
    public void onPreferenceSaved() {

        new DownloadImpl(mExecutor, mMainThread, mContext, this).execute();
    }
}
