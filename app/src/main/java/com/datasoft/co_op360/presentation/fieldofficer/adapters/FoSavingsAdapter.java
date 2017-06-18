package com.datasoft.co_op360.presentation.fieldofficer.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoSavingsPresenter;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.domain.model.SavingsListItemData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 16/04/17.
 */

public class FoSavingsAdapter extends RecyclerView.Adapter<FoSavingsAdapter.CardViewHolder> {

    Context context;
    List<SavingsListItemData> savingsListItemDatas = new ArrayList<>();
    LayoutInflater inflater;
    FoSavingsPresenter foSavingsPresenter;

    public FoSavingsAdapter(Context context, List<SavingsListItemData> savingsListItemDatas, FoSavingsPresenter foSavingsPresenter) {
        this.context = context;
        this.savingsListItemDatas = savingsListItemDatas;
        this.foSavingsPresenter = foSavingsPresenter;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.fo_savings_list_item, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

        holder.bind(savingsListItemDatas.get(position), position + 1, foSavingsPresenter);
    }

    @Override
    public int getItemCount() {
        return savingsListItemDatas.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView TvNumber;
        TextView TvMemberName;
        TextView TvMemberCode;
        TextView TvMemberGuardian;
        TextView TvSavings;

        public CardViewHolder(View itemView) {
            super(itemView);

            TvNumber = (TextView) itemView.findViewById(R.id.tv_number);
            TvMemberName = (TextView) itemView.findViewById(R.id.tv_member_name);
            TvMemberCode = (TextView) itemView.findViewById(R.id.tv_member_id);
            TvMemberGuardian = (TextView) itemView.findViewById(R.id.tv_member_gaurdian);
            TvSavings = (TextView) itemView.findViewById(R.id.tv_savings);
        }

        public void bind(final SavingsListItemData savingsListItemData, int number, final FoSavingsPresenter foSavingsPresenter) {

            TvNumber.setText("" + number);
            TvMemberName.setText(savingsListItemData.getmMemberName());
            TvMemberCode.setText(savingsListItemData.getmMemberId());
            TvMemberGuardian.setText(savingsListItemData.getmMemberSpouse());
            TvSavings.setText(savingsListItemData.getmMemberSavingsAmount());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    foSavingsPresenter.onItemClick(savingsListItemData);
                }
            });

        }
    }
}