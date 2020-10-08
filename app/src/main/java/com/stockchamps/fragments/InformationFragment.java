package com.stockchamps.fragments;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.stockchamps.R;
public class InformationFragment extends Fragment {

    public InformationFragment newInstance() {
        InformationFragment informationFragment = new InformationFragment();
        return informationFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_information, container, false);



        return view;
    }

}
