package com.stockchamps.fragments;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stockchamps.R;
import com.stockchamps.activities.StockPicksActivity;

public class ContestRuleFragment extends Fragment {

    public static ContestRuleFragment newInstance() {
        ContestRuleFragment contestRuleFragment = new ContestRuleFragment();
        return contestRuleFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contest_rule, container, false);
        ButterKnife.bind(this, view);


        return view;
    }
    @OnClick(R.id.agree)
    void termsClick() {
       startActivity(new Intent(getActivity(), StockPicksActivity.class));
    }
}
