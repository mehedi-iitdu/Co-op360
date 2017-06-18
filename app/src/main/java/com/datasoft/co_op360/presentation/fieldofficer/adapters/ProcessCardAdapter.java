package com.datasoft.co_op360.presentation.fieldofficer.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.datasoft.co_op360.domain.model.ProcessData;
import com.datasoft.co_op360.R;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.ProcessPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 1/23/17.
 */

public class ProcessCardAdapter extends RecyclerView.Adapter<ProcessCardAdapter.CardViewHolder> {

    Context context;
    List<ProcessData> processDatas = new ArrayList<>();
    LayoutInflater inflater;
    ProcessPresenter processPresenter;

    public ProcessCardAdapter(Context context, List<ProcessData> processDatas, ProcessPresenter processPresenter) {
        this.context = context;
        this.processDatas = processDatas;
        this.processPresenter = processPresenter;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.fo_process_card, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        holder.bind(processDatas.get(position), processPresenter);
    }

    @Override
    public int getItemCount() {

        return processDatas.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_process_image;
        TextView tv_process_name;

        public CardViewHolder(View itemView) {
            super(itemView);

            iv_process_image = (ImageView) itemView.findViewById(R.id.process_image);
            tv_process_name = (TextView) itemView.findViewById(R.id.process_name);
        }

        public void bind(final ProcessData cardData, final ProcessPresenter processPresenter) {

            iv_process_image.setImageResource(cardData.getProcess_image());
            tv_process_name.setText(cardData.getProcess_name());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    processPresenter.click(cardData);
                }
            });

        }
    }
}
