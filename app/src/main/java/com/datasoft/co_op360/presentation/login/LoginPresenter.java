package com.datasoft.co_op360.presentation.login;

/**
 * Created by mehedi on 3/14/17.
 */

public interface LoginPresenter {

    void validateCredentials(String username, String password);

    void onDestroy();
}
