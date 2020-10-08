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
import com.stockchamps.activities.StockPicksActivity;
import com.stockchamps.adapters.AdapterResultList;
import com.stockchamps.adapters.AdapterStockPicks;
import com.stockchamps.healper.ViewUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResultsFragment extends Fragment {

    public static ResultsFragment newInstance() {
        ResultsFragment resultsFragment = new ResultsFragment();
        return resultsFragment;
    }

    @BindView(R.id.list)
    RecyclerView list;

    public ViewUtils viewUtils;

    AdapterResultList adapterResultList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_results, container, false);
        ButterKnife.bind(this,view);
        viewUtils = new ViewUtils(getActivity());
        viewUtils.statusbar_color();

        list.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));

        adapterResultList = new AdapterResultList(getActivity());
        list.setAdapter(adapterResultList);

        return view;
    }

}
