package com.stockchamps.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;

import com.stockchamps.R;
import com.stockchamps.adapters.AdapterGraphlist;
import com.stockchamps.adapters.AdapterResultStocksPick;
import com.stockchamps.healper.ViewUtils;

public class GraphActivity extends AppCompatActivity {


    AdapterGraphlist adapterGraphlist;

    @BindView(R.id.list)
    RecyclerView list;

    public ViewUtils viewUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        ButterKnife.bind(this);
        viewUtils = new ViewUtils(this);
        viewUtils.statusbar_color();


        list.setLayoutManager(new LinearLayoutManager(GraphActivity.this,
                LinearLayoutManager.VERTICAL, false));

        adapterGraphlist = new AdapterGraphlist(GraphActivity.this);
        list.setAdapter(adapterGraphlist);

    }

}