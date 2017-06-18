package com.datasoft.co_op360.presentation.fieldofficer.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.datasoft.co_op360.R;
import com.datasoft.co_op360.domain.model.Samity;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoAutoProcessPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 3/31/17.
 */

public class FoAutoProcessAdapter extends RecyclerView.Adapter<FoAutoProcessAdapter.CardViewHolder> {

    Context context;
    List<Samity> samities = new ArrayList<>();
    LayoutInflater inflater;

    FoAutoProcessPresenter foAutoProcessPresenter;

    public FoAutoProcessAdapter(Context context, List<Samity> samities, FoAutoProcessPresenter foAutoProcessPresenter) {
        this.context = context;
        this.samities = samities;
        this.foAutoProcessPresenter = foAutoProcessPresenter;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.fo_group_list_item, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

        holder.bind(samities.get(position), position + 1, foAutoProcessPresenter);
    }

    @Override
    public int getItemCount() {

        return samities.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView tv_number;
        TextView tv_group_pname;
        TextView tv_total_member;
        TextView tv_savings;
        TextView tv_share;
        TextView tv_loan;


        public CardViewHolder(View itemView) {
            super(itemView);

            tv_number = (TextView) itemView.findViewById(R.id.tv_number);
            tv_group_pname = (TextView) itemView.findViewById(R.id.tv_group_name);
            tv_total_member = (TextView) itemView.findViewById(R.id.tv_total_member);
            tv_savings = (TextView) itemView.findViewById(R.id.tv_savings);
            tv_share = (TextView) itemView.findViewById(R.id.tv_share);
            tv_loan = (TextView) itemView.findViewById(R.id.tv_loan);
        }

        public void bind(final Samity foautoProcessSamity, int number, final FoAutoProcessPresenter processPresenter) {

            tv_number.setText("" + number);
            tv_group_pname.setText(foautoProcessSamity.getName());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    processPresenter.itemClick(foautoProcessSamity);
                }
            });

        }
    }
}