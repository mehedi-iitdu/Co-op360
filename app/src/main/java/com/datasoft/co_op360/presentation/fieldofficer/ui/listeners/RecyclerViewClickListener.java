package com.datasoft.co_op360.presentation.fieldofficer.ui.listeners;

/**
 * Created by mehedi on 4/11/17.
 */

public interface RecyclerViewClickListener {

    void onClickView(int position);

    void onClickEdit(int position, String savingsID);

    void onClickDelete(int position, String savingsId);
}
