package com.datasoft.co_op360.presentation.fieldofficer.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.datasoft.co_op360.domain.model.LoanProposalData;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.LoanProposalPresenter;
import com.datasoft.co_op360.R;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 4/18/17.
 */

public class LoanProposalAdapter extends RecyclerView.Adapter<LoanProposalAdapter.CardViewHolder> {

    Context context;
    List<LoanProposalData> loanProposalDataList = new ArrayList<>();
    LayoutInflater inflater;
    LoanProposalPresenter loanProposalPresenter;

    public LoanProposalAdapter(Context context, List<LoanProposalData> loanProposalDataList, LoanProposalPresenter loanProposalPresenter) {

        this.context = context;
        this.loanProposalPresenter = loanProposalPresenter;
        this.inflater = LayoutInflater.from(context);
        this.loanProposalDataList = loanProposalDataList;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.fo_loan_proposal_list_item, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

        holder.bind(loanProposalDataList.get(position), position + 1, loanProposalPresenter);
    }

    @Override
    public int getItemCount() {
        return loanProposalDataList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView TvNumber;
        TextView TvMembername;
        TextView TvMemberCode;
        TextView TvMemberGuardian;
        TextView TvMemberLoanAmount;

        public CardViewHolder(View itemView) {
            super(itemView);

            TvNumber = (TextView) itemView.findViewById(R.id.tv_number);
            TvMembername = (TextView) itemView.findViewById(R.id.tv_member_name);
            TvMemberCode = (TextView) itemView.findViewById(R.id.tv_member_id);
            TvMemberGuardian = (TextView) itemView.findViewById(R.id.tv_member_gaurdian);
            TvMemberLoanAmount = (TextView) itemView.findViewById(R.id.tv_loan_amount);
        }

        public void bind(final LoanProposalData loanProposalData, int number, final LoanProposalPresenter loanProposalPresenter) {

            TvNumber.setText("" + number);
            TvMembername.setText(loanProposalData.getmMemberName());
            TvMemberCode.setText(loanProposalData.getmMemberId());
            TvMemberGuardian.setText(loanProposalData.getmMemberSpouse());
            TvMemberLoanAmount.setText(loanProposalData.getmMemberLoanProposalAmount());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    loanProposalPresenter.onItemClick(loanProposalData);
                }
            });

        }
    }
}
