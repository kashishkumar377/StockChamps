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
public class WinnerPrizeFragment extends Fragment {

    public static WinnerPrizeFragment newInstance() {
        WinnerPrizeFragment winnerPrizeFragment = new WinnerPrizeFragment();
        return winnerPrizeFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_winner_prize, container, false);



        return view;
    }
}
