package com.datasoft.co_op360.presentation.fieldofficer.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.datasoft.co_op360.presentation.fieldofficer.presenters.impl.LoanProposalPresenterImpl;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.presentation.fieldofficer.adapters.LoanProposalAdapter;
import com.datasoft.co_op360.domain.model.LoanProposalData;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.LoanProposalPresenter;
import com.datasoft.co_op360.presentation.fieldofficer.ui.LoanProposalView;

import java.util.List;

/**
 * Created by mehedi on 4/17/17.
 */

public class FoLoanProposalFragment extends Fragment implements LoanProposalView {

    LoanProposalAdapter loanProposalAdapter;
    LoanProposalPresenter loanProposalPresenter;
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fo_loan_proposal_fragment, null);
        recyclerView = (RecyclerView) view.findViewById(R.id.rv_loan_proposal_list);

        loanProposalPresenter = new LoanProposalPresenterImpl(this);
        loanProposalPresenter.getLoanProposalData();

        return view;
    }

    @Override
    public void setLoanProposals(List<LoanProposalData> loanProposalDataList) {

        loanProposalAdapter = new LoanProposalAdapter(getActivity(), loanProposalDataList, loanProposalPresenter);
        recyclerView.setAdapter(loanProposalAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

    @Override
    public void itemClick(LoanProposalData loanProposalData) {

        Toast.makeText(getContext(), loanProposalData.getmMemberName(), Toast.LENGTH_SHORT).show();
    }
}
