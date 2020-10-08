package com.stockchamps.fragments;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stockchamps.R;

public class ResultListOptionsFragment extends Fragment {

    public ResultListOptionsFragment newInstance() {
        ResultListOptionsFragment resultListOptionsFragment = new ResultListOptionsFragment();
        return resultListOptionsFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result_list_options, container, false);
    }
}
