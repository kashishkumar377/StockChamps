package com.stockchamps.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stockchamps.R;
import com.stockchamps.activities.OtherActivitys;
import com.stockchamps.adapters.AdapterContest;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContestFragment extends Fragment {

    public ContestFragment() {
        // Required empty public constructor
    }

    @BindView(R.id.allcontest_list)
    RecyclerView allcontest_list;

    AdapterContest contestAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_contest, container, false);
        ButterKnife.bind(this, view);

        allcontest_list.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));

        contestAdapter = new AdapterContest(getActivity());
        allcontest_list.setAdapter(contestAdapter);

        return view;

    }

    @OnClick(R.id.contestrule)
    void contestruleClick() {
        startActivity(new Intent(getActivity(), OtherActivitys.class)
                .putExtra("type","contestrule"));
    }
}
