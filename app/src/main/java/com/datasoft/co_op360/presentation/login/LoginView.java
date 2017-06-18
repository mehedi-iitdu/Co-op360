package com.datasoft.co_op360.presentation.login;

/**
 * Created by mehedi on 3/14/17.
 */

public interface LoginView {

    void showProgress();

    void hideProgress();

    void setUsernameError(String usernameErrorText);

    void setPasswordError(String passwordErrorText);

    String getUsername();

    String getPassword();

    void navigateToFieldOfficerActivity();

    void navigateToBranchManagerActivity();

    void navigateToManagementPanelActivity();

    void showConnectionFailureMessage();
}
