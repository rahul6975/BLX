package com.rahul.blx.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.rahul.blx.Activities.ViewPagerAdapter;
import com.rahul.blx.R;


public class MessageFragment extends Fragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ImageView ivHome, ivChat, ivSell, ivHeart, ivAccount;

    public MessageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewPager = view.findViewById(R.id.viewPage);
        tabLayout = view.findViewById(R.id.TbTabLayout);
        ivHome = view.findViewById(R.id.ibRefresh);
        ivChat = view.findViewById(R.id.ibLocation);
        ivSell = view.findViewById(R.id.ibHeart);
        ivHeart = view.findViewById(R.id.ibChat);
        ivAccount = view.findViewById(R.id.ibUser);
        setViewpgaerAdapter();

    }


    private void setViewpgaerAdapter() {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}