package com.stockchamps.fragments;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.stockchamps.R;
import com.stockchamps.activities.MainActivity;
import com.stockchamps.customview.CustomTextView;
import com.stockchamps.healper.ViewUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrizeFragment extends Fragment {

    public static PrizeFragment newInstance() {
        // Required empty public constructor
        PrizeFragment prizeFragment = new PrizeFragment();
        return prizeFragment;
    }

    @BindView(R.id.rv_contest)
    RelativeLayout rv_contest;

    @BindView(R.id.rv_rules)
    RelativeLayout rv_rules;

    @BindView(R.id.rv_winner)
    RelativeLayout rv_winner;

    @BindView(R.id.cv_prize)
    CustomTextView cv_prize;

    @BindView(R.id.cv_rules)
    CustomTextView cv_rules;

    @BindView(R.id.cv_contest)
    CustomTextView cv_contest;

    @BindView(R.id.view2)
    View view2;

    @BindView(R.id.view1)
    View view1;

    @BindView(R.id.view3)
    View view3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_prize, container, false);
        ButterKnife.bind(this, view);
        rv_winner();

        return view;
    }

    @OnClick(R.id.rv_contest)
    void rv_contest() {
        view1.setVisibility(View.VISIBLE);
        view2.setVisibility(View.INVISIBLE);
        view3.setVisibility(View.INVISIBLE);

        cv_contest.setTextColor(ContextCompat.getColor(getActivity(), R.color.orange_red));
        cv_rules.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
        cv_prize.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));


        ContestTabFragment loginFragment = ContestTabFragment.newInstance();
        FragmentTransaction fts = getActivity().getSupportFragmentManager().beginTransaction();
        fts.replace(R.id.fragmentHolders, loginFragment);
        fts.addToBackStack(loginFragment.getClass().getSimpleName());
        fts.commit();


    }

    @OnClick(R.id.rv_rules)
    void rv_rules() {
      view1.setVisibility(View.INVISIBLE);
      view2.setVisibility(View.VISIBLE);
      view3.setVisibility(View.INVISIBLE);


        cv_contest.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
        cv_rules.setTextColor(ContextCompat.getColor(getActivity(), R.color.orange_red));
        cv_prize.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));


        ContestRuleFragment contestRuleFragment = ContestRuleFragment.newInstance();
        FragmentTransaction fts = getActivity().getSupportFragmentManager().beginTransaction();
        fts.replace(R.id.fragmentHolders, contestRuleFragment);
        fts.addToBackStack(contestRuleFragment.getClass().getSimpleName());
        fts.commit();

    }

    @OnClick(R.id.rv_winner)
    void rv_winner() {
      view1.setVisibility(View.INVISIBLE);
      view2.setVisibility(View.INVISIBLE);
      view3.setVisibility(View.VISIBLE);

        cv_contest.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
        cv_rules.setTextColor(ContextCompat.getColor(getActivity(), R.color.white));
        cv_prize.setTextColor(ContextCompat.getColor(getActivity(), R.color.orange_red));


        WinnerPrizeFragment loginFragment = WinnerPrizeFragment.newInstance();
        FragmentTransaction fts = getActivity().getSupportFragmentManager().beginTransaction();
        fts.replace(R.id.fragmentHolders, loginFragment);
        fts.addToBackStack(loginFragment.getClass().getSimpleName());
        fts.commit();
    }

}
