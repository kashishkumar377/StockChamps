package com.stockchamps.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stockchamps.R;
import com.stockchamps.adapters.AdapterLeadership;
import com.stockchamps.adapters.AdapterStock;

public class LeaderShipFragment extends Fragment {

    public LeaderShipFragment() {

    }

    @BindView(R.id.allcontest_list)
    RecyclerView allcontest_list;

    AdapterLeadership adapterLeadership;

  @BindView(R.id.allcontest_list2)
    RecyclerView allcontest_list2;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_leader_ship, container, false);
        ButterKnife.bind(this, view);

        allcontest_list.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));


        adapterLeadership = new AdapterLeadership(getActivity());
        allcontest_list.setAdapter(adapterLeadership);

        allcontest_list2.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));

        adapterLeadership = new AdapterLeadership(getActivity());
        allcontest_list2.setAdapter(adapterLeadership);

        return view;
    }
}
