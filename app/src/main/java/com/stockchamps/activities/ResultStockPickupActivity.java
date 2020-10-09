package com.stockchamps.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;

import com.stockchamps.R;
import com.stockchamps.adapters.AdapterResultStocksPick;
import com.stockchamps.adapters.AdapterStockPicks;
import com.stockchamps.healper.ViewUtils;

public class ResultStockPickupActivity extends AppCompatActivity {

    AdapterResultStocksPick adapterStocks;

    @BindView(R.id.list)
    RecyclerView list;

    public ViewUtils viewUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_stock_pickup);
        ButterKnife.bind(this);
        viewUtils = new ViewUtils(this);
        viewUtils.statusbar_color();


        list.setLayoutManager(new LinearLayoutManager(ResultStockPickupActivity.this,
                LinearLayoutManager.VERTICAL, false));

        adapterStocks = new AdapterResultStocksPick(ResultStockPickupActivity.this);
        list.setAdapter(adapterStocks);
    }


}