package com.datasoft.co_op360.presentation.managementpanel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.datasoft.co_op360.R;
import com.datasoft.co_op360.presentation.managementpanel.process.MpProcessFragment;
import com.datasoft.co_op360.presentation.managementpanel.report.MpReportFragment;

import java.util.ArrayList;

/**
 * Created by jahid on 1/15/17.
 */

public class MpTabFragment extends Fragment {
    private View viewMain;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private MyPagerAdapter adapter;

    public static MpTabFragment getInstance() {
        MpTabFragment instance = new MpTabFragment();
        return instance;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        viewMain = inflater.inflate(R.layout.mp_fragment_home, container, false);
        init();
        setupTabLayout();
        setupViewPager();
        return viewMain;
    }


    private void init() {
        tabLayout = (TabLayout) viewMain.findViewById(R.id.tabs);
        viewPager = (ViewPager) viewMain.findViewById(R.id.viewpager);
        adapter = new MyPagerAdapter(getFragmentManager());
    }

    private void setupTabLayout() {
        adapter = new MyPagerAdapter(getFragmentManager());

        adapter.addFragment(new MpDashboardFragment(), "Dashboard");
        adapter.addFragment(new MpProcessFragment(), "Process");
        adapter.addFragment(new MpReportFragment(), "Report");
        viewPager.setAdapter(adapter);

    }

    private void setupViewPager() {
        tabLayout.setupWithViewPager(viewPager);

        //tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
    }


    class MyPagerAdapter extends FragmentStatePagerAdapter {
        private final ArrayList<Fragment> mFragmentList = new ArrayList<Fragment>();
        private final ArrayList<String> mFragmentTitleList = new ArrayList<String>();

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {

            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);

        }

        @Override
        public CharSequence getPageTitle(int position) {

            return mFragmentTitleList.get(position);
        }
    }
}
