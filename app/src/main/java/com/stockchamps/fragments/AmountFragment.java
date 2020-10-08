package com.stockchamps.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;

import com.stockchamps.R;
import com.stockchamps.activities.OtherActivitys;
import com.stockchamps.customview.CustomTextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class AmountFragment extends Fragment {

    public static AmountFragment newInstance() {
        // Required empty public constructor
        AmountFragment amountFragment = new AmountFragment();
        return amountFragment;
    }

    @BindView(R.id.switchbox)
    Switch switchbox;

  @BindView(R.id.addfund_view)
  LinearLayout addfund_view;

@BindView(R.id.on_view)
  LinearLayout on_view;

@BindView(R.id.add_fund)
CustomTextView add_fund;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_amount, container, false);
        ButterKnife.bind(this,view);

        switchbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    on_view.setVisibility(View.VISIBLE);
                    addfund_view.setVisibility(View.GONE);
                } else {
                    on_view.setVisibility(View.GONE);
                    addfund_view.setVisibility(View.VISIBLE);
                }
            }
        });



        return view;
    }

    @OnClick(R.id.add_fund)
    void add_fundClick() {
        startActivity(new Intent(getActivity(), OtherActivitys.class)
                .putExtra("type","history"));
    }

}
