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
import com.stockchamps.adapters.AdapterStock;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyStockFragment extends Fragment {

    public MyStockFragment() {
        // Required empty public constructor
    }

    @BindView(R.id.allcontest_list)
    RecyclerView allcontest_list;

    @BindView(R.id.allcontest_list2)
    RecyclerView allcontest_list2;

    AdapterStock adapterStock;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_stock, container, false);
        ButterKnife.bind(this, view);

        allcontest_list.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));

        adapterStock = new AdapterStock(getActivity());
        allcontest_list.setAdapter(adapterStock);

        allcontest_list2.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));

        adapterStock = new AdapterStock(getActivity());
        allcontest_list2.setAdapter(adapterStock);


        return view;
    }
}
