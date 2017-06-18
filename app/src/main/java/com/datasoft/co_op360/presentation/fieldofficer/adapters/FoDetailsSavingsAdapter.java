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

import com.datasoft.co_op360.R;
import com.datasoft.co_op360.domain.model.IndividualSavingsData;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoDetailsSavingsPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 4/16/17.
 */

public class FoDetailsSavingsAdapter extends RecyclerView.Adapter<FoDetailsSavingsAdapter.CardViewHolder> {

    Context context;
    List<IndividualSavingsData> individualSavingsDataList = new ArrayList<>();
    LayoutInflater inflater;
    FoDetailsSavingsPresenter foDetailsSavingsPresenter;

    public FoDetailsSavingsAdapter(Context context, List<IndividualSavingsData> individualSavingsDataList, FoDetailsSavingsPresenter foDetailsSavingsPresenter) {
        this.context = context;
        this.individualSavingsDataList = individualSavingsDataList;
        this.foDetailsSavingsPresenter = foDetailsSavingsPresenter;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.fo_savings_individual_item, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

        holder.bind(individualSavingsDataList.get(position), foDetailsSavingsPresenter);
    }

    @Override
    public int getItemCount() {

        return individualSavingsDataList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView TvSavingsType;
        TextView TvSavingsProduct;
        TextView TvAmount;
        ImageButton IbMenu;

        public CardViewHolder(View itemView) {
            super(itemView);

            TvSavingsType = (TextView) itemView.findViewById(R.id.tv_share_type);
            TvSavingsProduct = (TextView) itemView.findViewById(R.id.tv_savings_product);
            TvAmount = (TextView) itemView.findViewById(R.id.tv_amount);
            IbMenu = (ImageButton) itemView.findViewById(R.id.button_menu);
        }

        public void bind(final IndividualSavingsData individualSavingsData, final FoDetailsSavingsPresenter foDetailsSavingsPresenter) {

            TvSavingsType.setText(individualSavingsData.getSavingsType());
            TvSavingsProduct.setText(individualSavingsData.getSavingsProduct());
            TvAmount.setText(individualSavingsData.getSavingsAmount());

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
                                    foDetailsSavingsPresenter.onEditClick(individualSavingsData);
                                    break;
                                case R.id.item_delete:
                                    foDetailsSavingsPresenter.onDeleteClick(individualSavingsData);
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
