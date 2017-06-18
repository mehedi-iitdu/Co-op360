package com.datasoft.co_op360.presentation.fieldofficer.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.datasoft.co_op360.R;
import com.datasoft.co_op360.domain.model.LoanTransactionData;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.LoanTransactionPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 4/17/17.
 */

public class LoanTransactionAdapter extends RecyclerView.Adapter<LoanTransactionAdapter.CardViewHolder> {

    Context context;
    List<LoanTransactionData> loanTransactionDataList = new ArrayList<>();
    LayoutInflater inflater;
    LoanTransactionPresenter loanTransactionPresenter;

    public LoanTransactionAdapter(Context context, List<LoanTransactionData> loanTransactionDataList, LoanTransactionPresenter loanTransactionPresenter) {

        this.context = context;
        this.loanTransactionPresenter = loanTransactionPresenter;
        this.inflater = LayoutInflater.from(context);
        this.loanTransactionDataList = loanTransactionDataList;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.fo_loan_transaction_list_item, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {

        holder.bind(loanTransactionDataList.get(position), position + 1, loanTransactionPresenter);
    }

    @Override
    public int getItemCount() {
        return loanTransactionDataList.size();
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

        public void bind(final LoanTransactionData loanTransactionData, int number, final LoanTransactionPresenter loanTransactionPresenter) {

            TvNumber.setText("" + number);
            TvMembername.setText(loanTransactionData.getmMemberName());
            TvMemberCode.setText(loanTransactionData.getmMemberId());
            TvMemberGuardian.setText(loanTransactionData.getmMemberSpouse());
            TvMemberLoanAmount.setText(loanTransactionData.getmMemberLoanAmount());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    loanTransactionPresenter.onItemClick(loanTransactionData);
                }
            });

        }
    }
}
