package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.Samity;

/**
 * Created by mehedi on 3/31/17.
 */

public interface FoAutoProcessPresenter {

    void getAutoProcessData();

    void itemClick(Samity samity);

    void onDestroy();
}
