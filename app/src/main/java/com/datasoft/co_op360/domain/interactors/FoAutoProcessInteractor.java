package com.datasoft.co_op360.domain.interactors;

import com.datasoft.co_op360.domain.interactors.base.Interactor;
import com.datasoft.co_op360.domain.model.Samity;

import java.util.List;

/**
 * Created by mehedi on 3/31/17.
 */

public interface FoAutoProcessInteractor extends Interactor {

    interface Callback {

        void onProcessDataLoad(List<Samity> list);
    }
}
