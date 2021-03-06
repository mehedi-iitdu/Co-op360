package com.datasoft.co_op360.presentation.fieldofficer.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.datasoft.co_op360.domain.model.Samity;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoGroupPresenter;
import com.datasoft.co_op360.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 4/6/17.
 */

public class FoGroupAdapter extends RecyclerView.Adapter<FoGroupAdapter.CardViewHolder> {

    Context context;
    List<Samity> samitys = new ArrayList<>();
    LayoutInflater inflater;
    FoGroupPresenter foGroupPresenter;

    public FoGroupAdapter(Context context, List<Samity> samitys, FoGroupPresenter foGroupPresenter) {
        this.context = context;
        this.samitys = samitys;
        this.foGroupPresenter = foGroupPresenter;
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

        holder.bind(samitys.get(position), position + 1, foGroupPresenter);
    }

    @Override
    public int getItemCount() {

        return samitys.size();
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

        public void bind(final Samity samity, int number, final FoGroupPresenter foGroupPresenter) {

            tv_number.setText("" + number);
            tv_group_pname.setText(samity.getName());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    foGroupPresenter.itemClick(samity);
                }
            });

        }
    }
}