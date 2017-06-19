package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.GroupData;
import com.datasoft.co_op360.domain.model.Samity;

/**
 * Created by mehedi on 4/6/17.
 */

public interface FoGroupPresenter {

    void getAutoProcessData();

    void itemClick(Samity samity);

    void onDestroy();
}
