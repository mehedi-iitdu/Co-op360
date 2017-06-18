package com.datasoft.co_op360.domain.interactors;

import com.datasoft.co_op360.domain.interactors.base.Interactor;
import com.datasoft.co_op360.network.model.RESTAuth;

/**
 * Created by mehedi on 6/3/17.
 */

public interface LoginInteractor extends Interactor {

    interface Callback {

        void onUsernameError();

        void onPasswordError();

        void download(RESTAuth restAuth);

        void onConnectionFailure();
    }
}
