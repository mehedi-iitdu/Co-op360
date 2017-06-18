package com.datasoft.co_op360.presentation.fieldofficer.adapters;

import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.datasoft.co_op360.domain.model.IndividualLoanTransactionData;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoDetailsLoanTransactionPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 4/19/17.
 */

public class FoDetailsLoanTransactionAdapter extends RecyclerView.Adapter<FoDetailsLoanTransactionAdapter.CardViewHolder> {

    Context context;
    List<IndividualLoanTransactionData> individualLoanTransactionDataList = new ArrayList<>();
    LayoutInflater inflater;
    FoDetailsLoanTransactionPresenter foDetailsLoanTransactionPresenter;

    public FoDetailsLoanTransactionAdapter(Context context, List<IndividualLoanTransactionData> individualLoanTransactionDataList, FoDetailsLoanTransactionPresenter foDetailsLoanTransactionPresenter) {
        this.context = context;
        this.individualLoanTransactionDataList = individualLoanTransactionDataList;
        this.foDetailsLoanTransactionPresenter = foDetailsLoanTransactionPresenter;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.fo_details_loan_transaction_item, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

        holder.bind(individualLoanTransactionDataList.get(position), foDetailsLoanTransactionPresenter);
    }

    @Override
    public int getItemCount() {

        return individualLoanTransactionDataList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView TvLoanProduct;
        TextView TvAmount;
        ImageButton IbMenu;

        public CardViewHolder(View itemView) {
            super(itemView);


            TvLoanProduct = (TextView) itemView.findViewById(R.id.tv_share_type);
            TvAmount = (TextView) itemView.findViewById(R.id.tv_amount);
            IbMenu = (ImageButton) itemView.findViewById(R.id.button_menu);
        }

        public void bind(final IndividualLoanTransactionData individualLoanTransactionData, final FoDetailsLoanTransactionPresenter foDetailsLoanTransactionPresenter) {

            TvLoanProduct.setText(individualLoanTransactionData.getmLoanProduct());
            TvAmount.setText(individualLoanTransactionData.getmLoanAmount());

            IbMenu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PopupMenu popup = new PopupMenu(context, IbMenu);
                    //inflating menu from xml resource
                    popup.inflate(R.menu.menu_item);
                    //adding click listener
                    popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            switch (item.getItemId()) {
                                case R.id.item_edit:
                                    foDetailsLoanTransactionPresenter.onEditClick(individualLoanTransactionData);
                                    break;
                                case R.id.item_delete:
                                    foDetailsLoanTransactionPresenter.onDeleteClick(individualLoanTransactionData);
                                    break;
                            }
                            return false;
                        }
                    });
                    popup.show();
                }
            });

        }
    }
}