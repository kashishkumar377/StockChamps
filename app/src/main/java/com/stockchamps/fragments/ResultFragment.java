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
import com.stockchamps.adapters.AdapterResult;
import com.stockchamps.adapters.AdapterStock;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends Fragment {

    public ResultFragment() {
        // Required empty public constructor
    }

    @BindView(R.id.allcontest_list)
    RecyclerView allcontest_list;

    @BindView(R.id.allcontest_list2)
    RecyclerView allcontest_list2;

    AdapterResult adapterResult;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_result, container, false);
        ButterKnife.bind(this, view);

        allcontest_list.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));

        adapterResult = new AdapterResult(getActivity());
        allcontest_list.setAdapter(adapterResult);

        allcontest_list2.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));


        adapterResult = new AdapterResult(getActivity());
        allcontest_list2.setAdapter(adapterResult);

    return view;
    }
}
