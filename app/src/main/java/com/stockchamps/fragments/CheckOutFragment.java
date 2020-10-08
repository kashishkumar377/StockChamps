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
public class CheckOutFragment extends Fragment {

    public static CheckOutFragment newInstance() {
        CheckOutFragment checkOutFragment = new CheckOutFragment();
        return checkOutFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_amount, container, false);


        return view;
    }
}
