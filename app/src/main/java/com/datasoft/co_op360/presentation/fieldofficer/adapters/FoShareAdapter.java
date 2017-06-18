package com.datasoft.co_op360.presentation.fieldofficer.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoSharePresenter;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.domain.model.ShareListItemData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 5/15/17.
 */

public class FoShareAdapter extends RecyclerView.Adapter<FoShareAdapter.CardViewHolder> {

    Context context;
    List<ShareListItemData> shareListItemDataList = new ArrayList<>();
    LayoutInflater inflater;
    FoSharePresenter foSharePresenter;

    public FoShareAdapter(Context context, List<ShareListItemData> shareListItemDataList, FoSharePresenter foSharePresenter) {
        this.context = context;
        this.shareListItemDataList = shareListItemDataList;
        this.foSharePresenter = foSharePresenter;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.fo_share_list_item, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

        holder.bind(shareListItemDataList.get(position), position + 1, foSharePresenter);
    }

    @Override
    public int getItemCount() {
        return shareListItemDataList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView TvNumber;
        TextView TvMemberName;
        TextView TvMemberCode;
        TextView TvMemberGuardian;
        TextView TvShares;

        public CardViewHolder(View itemView) {
            super(itemView);

            TvNumber = (TextView) itemView.findViewById(R.id.tv_number);
            TvMemberName = (TextView) itemView.findViewById(R.id.tv_member_name);
            TvMemberCode = (TextView) itemView.findViewById(R.id.tv_member_id);
            TvMemberGuardian = (TextView) itemView.findViewById(R.id.tv_member_gaurdian);
            TvShares = (TextView) itemView.findViewById(R.id.tv_shares);
        }

        public void bind(final ShareListItemData shareListItemData, int number, final FoSharePresenter foSharePresenter) {

            TvNumber.setText("" + number);
            TvMemberName.setText(shareListItemData.getmMemberName());
            TvMemberCode.setText(shareListItemData.getmMemberId());
            TvMemberGuardian.setText(shareListItemData.getmMemberSpouse());
            TvShares.setText(shareListItemData.getmMemberShareAmount());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    foSharePresenter.onItemClick(shareListItemData);
                }
            });

        }
    }
}