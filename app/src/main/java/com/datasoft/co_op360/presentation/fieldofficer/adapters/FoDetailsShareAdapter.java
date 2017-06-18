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

import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoDetailsSharePresenter;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.domain.model.IndividualShareData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 5/15/17.
 */

public class FoDetailsShareAdapter extends RecyclerView.Adapter<FoDetailsShareAdapter.CardViewHolder> {

    Context context;
    List<IndividualShareData> individualShareDataList = new ArrayList<>();
    LayoutInflater inflater;
    FoDetailsSharePresenter foDetailsSharePresenter;

    public FoDetailsShareAdapter(Context context, List<IndividualShareData> individualShareDataList, FoDetailsSharePresenter foDetailsSharePresenter) {
        this.context = context;
        this.individualShareDataList = individualShareDataList;
        this.foDetailsSharePresenter = foDetailsSharePresenter;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.fo_share_individual_item, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

        holder.bind(individualShareDataList.get(position), foDetailsSharePresenter);
    }

    @Override
    public int getItemCount() {

        return individualShareDataList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView TvShareType;
        TextView TvShareProduct;
        TextView TvAmount;
        ImageButton IbMenu;

        public CardViewHolder(View itemView) {
            super(itemView);

            TvShareType = (TextView) itemView.findViewById(R.id.tv_share_type);
            TvShareProduct = (TextView) itemView.findViewById(R.id.tv_share_product);
            TvAmount = (TextView) itemView.findViewById(R.id.tv_amount);
            IbMenu = (ImageButton) itemView.findViewById(R.id.button_menu);
        }

        public void bind(final IndividualShareData individualShareData, final FoDetailsSharePresenter foDetailsSharePresenter) {

            TvShareType.setText(individualShareData.getShareType());
            TvShareProduct.setText(individualShareData.getShareProduct());
            TvAmount.setText(individualShareData.getShareAmount());

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
                                    foDetailsSharePresenter.onEditClick(individualShareData);
                                    break;
                                case R.id.item_delete:
                                    foDetailsSharePresenter.onDeleteClick(individualShareData);
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

