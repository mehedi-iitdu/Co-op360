package com.datasoft.co_op360.presentation.fieldofficer.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

import com.datasoft.co_op360.domain.model.GroupData;
import com.datasoft.co_op360.R;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by mehedi on 5/11/17.
 */

public class AutoCompleteGroupsAdapter extends ArrayAdapter<GroupData> {
    List<GroupData> customers, tempGroupData, suggestions;
    Filter myFilter = new Filter() {
        @Override
        public CharSequence convertResultToString(Object resultValue) {
            GroupData groupData = (GroupData) resultValue;
            return groupData.getmGroupName();
        }

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            if (constraint != null) {
                suggestions.clear();
                for (GroupData groupData : tempGroupData) {
                    if (groupData.getmGroupName().toLowerCase().startsWith(constraint.toString().toLowerCase())) {
                        suggestions.add(groupData);
                    }
                }

                FilterResults filterResults = new FilterResults();
                filterResults.values = suggestions;
                filterResults.count = suggestions.size();
                return filterResults;
            } else {
                return new FilterResults();
            }
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            ArrayList<GroupData> c = (ArrayList<GroupData>) results.values;
            if (results != null && results.count > 0) {
                clear();
                for (GroupData cust : c) {
                    add(cust);
                    notifyDataSetChanged();
                }
            }
        }
    };

    public AutoCompleteGroupsAdapter(Context context, List<GroupData> objects) {
        super(context, android.R.layout.simple_list_item_1, objects);
        this.customers = objects;
        this.tempGroupData = new ArrayList<GroupData>(objects);
        this.suggestions = new ArrayList<GroupData>(objects);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GroupData groupData = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.auto_complete_group_item, parent, false);
        }
        TextView TvGroupName = (TextView) convertView.findViewById(R.id.tv_group_name);
        TextView TvGroupID = (TextView) convertView.findViewById(R.id.tv_total_member);

        TvGroupName.setText(groupData.getmGroupName());
        TvGroupID.setText(groupData.getmTotalMember());

        /*if (position % 2 == 0)
            convertView.setBackgroundColor(getContext().getColor(R.color.));
        else
            convertView.setBackgroundColor(getContext().getColor(R.color.even));*/

        return convertView;
    }

    @Override
    public Filter getFilter() {
        return myFilter;
    }
}