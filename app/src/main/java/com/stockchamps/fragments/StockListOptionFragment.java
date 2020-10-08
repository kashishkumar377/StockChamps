package com.stockchamps.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stockchamps.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StockListOptionFragment extends Fragment {

    public StockListOptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stock_list_option, container, false);
    }
}
