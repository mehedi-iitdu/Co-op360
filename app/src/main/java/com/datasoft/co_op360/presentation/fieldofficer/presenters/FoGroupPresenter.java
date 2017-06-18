package com.datasoft.co_op360.presentation.fieldofficer.presenters;

import com.datasoft.co_op360.domain.model.GroupData;

/**
 * Created by mehedi on 4/6/17.
 */

public interface FoGroupPresenter {

    void getAutoProcessData();

    void itemClick(GroupData groupData);

    void onDestroy();
}
