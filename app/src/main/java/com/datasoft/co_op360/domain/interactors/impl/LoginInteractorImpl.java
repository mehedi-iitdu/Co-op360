package com.datasoft.co_op360.domain.interactors.impl;

import android.util.Log;

import com.datasoft.co_op360.network.model.RESTAuth;
import com.datasoft.co_op360.domain.executor.Executor;
import com.datasoft.co_op360.domain.executor.MainThread;
import com.datasoft.co_op360.domain.interactors.LoginInteractor;
import com.datasoft.co_op360.domain.interactors.base.AbstractInteractor;
import com.datasoft.co_op360.network.ApiClient;
import com.datasoft.co_op360.network.response.AuthResponse;
import com.datasoft.co_op360.network.services.AuthApiInterface;

import retrofit2.Call;
import retrofit2.Response;

import static com.raizlabs.android.dbflow.config.FlowLog.TAG;

/**
 * Created by mehedi on 6/3/17.
 */

public class LoginInteractorImpl extends AbstractInteractor implements LoginInteractor {

    private RESTAuth mRestAuth;
    private Callback mCallback;
    private String mUsername;
    private String mPassword;

    public LoginInteractorImpl(Executor threadExecutor, MainThread mainThread, Callback callback, String username, String password) {
        super(threadExecutor, mainThread);
        mCallback = callback;
        mUsername = username;
        mPassword = password;
    }

    @Override
    public void run() {

        AuthApiInterface authApiInterface = ApiClient.getClient().create(AuthApiInterface.class);

        authApiInterface.getAuthResults(mUsername, mPassword).enqueue(new retrofit2.Callback<AuthResponse>() {

            @Override
            public void onResponse(Call<AuthResponse> call, Response<AuthResponse> response) {

                mRestAuth = response.body().getAuthResult();

                if (mRestAuth.getStatus().equals("successful")) {

                    Log.e("API key", mRestAuth.getApiKey());

                    mCallback.download(mRestAuth);


                } else {

                    mCallback.onUsernameError();
                    mCallback.onPasswordError();
                }

            }

            @Override
            public void onFailure(Call<AuthResponse> call, Throwable t) {

                Log.e(TAG, "Unable to submit post to API.");
                Log.e("Throwable", "" + t.getMessage());

                mCallback.onConnectionFailure();
            }

        });

    }
}
