package com.stockchamps.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.os.Bundle;

import com.stockchamps.R;
import com.stockchamps.adapters.AdapterLeadership;
import com.stockchamps.adapters.AdapterStocks;
import com.stockchamps.fragments.PrizeFragment;
import com.stockchamps.fragments.TermsFragment;
import com.stockchamps.healper.ViewUtils;

public class StockActivity extends AppCompatActivity {


    AdapterStocks adapterStocks;

    @BindView(R.id.list)
    RecyclerView list;

    public ViewUtils viewUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock);
        ButterKnife.bind(this);
        viewUtils = new ViewUtils(this);
        viewUtils.statusbar_color();

        list.setLayoutManager(new LinearLayoutManager(StockActivity.this,
                LinearLayoutManager.VERTICAL, false));

        adapterStocks = new AdapterStocks(StockActivity.this);
        list.setAdapter(adapterStocks);

    }


}
