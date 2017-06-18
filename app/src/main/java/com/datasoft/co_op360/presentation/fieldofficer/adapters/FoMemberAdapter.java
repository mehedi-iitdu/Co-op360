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
import com.datasoft.co_op360.domain.model.Member;
import com.datasoft.co_op360.presentation.fieldofficer.presenters.FoMemberPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehedi on 5/9/17.
 */

public class FoMemberAdapter extends RecyclerView.Adapter<FoMemberAdapter.CardViewHolder> {

    Context context;
    List<Member> memberListDatas = new ArrayList<>();
    LayoutInflater inflater;
    FoMemberPresenter foMemberPresenter;

    public FoMemberAdapter(Context context, List<Member> memberListDatas, FoMemberPresenter foMemberPresenter) {
        this.context = context;
        this.memberListDatas = memberListDatas;
        this.foMemberPresenter = foMemberPresenter;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.fo_member_list_item, parent, false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        holder.bind(memberListDatas.get(position), position + 1, foMemberPresenter);
    }

    @Override
    public int getItemCount() {

        return memberListDatas.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        TextView tv_number;
        TextView tv_member_name;
        TextView tv_member_id;
        TextView tv_member_spouse;
        ImageButton IbMenu;

        public CardViewHolder(View itemView) {
            super(itemView);

            tv_number = (TextView) itemView.findViewById(R.id.tv_number);
            tv_member_name = (TextView) itemView.findViewById(R.id.tv_member_name);
            tv_member_id = (TextView) itemView.findViewById(R.id.tv_member_id);
            tv_member_spouse = (TextView) itemView.findViewById(R.id.tv_member_spouse);
            IbMenu = (ImageButton) itemView.findViewById(R.id.button_menu);
        }

        public void bind(final Member memberListData, int number, final FoMemberPresenter foMemberPresenter) {

            tv_number.setText("" + number);
            tv_member_name.setText(memberListData.getName());
            tv_member_id.setText(String.valueOf(memberListData.getId()));
            tv_member_spouse.setText("Spouse : " + memberListData.getFatherName());

            IbMenu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PopupMenu popup = new PopupMenu(context, IbMenu);
                    popup.inflate(R.menu.menu_item);
                    popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            switch (item.getItemId()) {
                                /*case R.id.item_edit:
                                    foMemberPresenter.editClick(memberListData);
                                    break;
                                case R.id.item_delete:
                                    foMemberPresenter.deleteClick(memberListData);
                                    break;*/
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