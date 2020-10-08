package com.stockchamps.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.pixplicity.easyprefs.library.Prefs;
import com.stockchamps.R;
import com.stockchamps.adapters.AdapterStockPicks;
import com.stockchamps.adapters.AdapterStocks;
import com.stockchamps.fragments.PrizeFragment;
import com.stockchamps.healper.ViewUtils;

public class StockPicksActivity extends AppCompatActivity {
    AdapterStockPicks adapterStocks;

    @BindView(R.id.list)
    RecyclerView list;

    public ViewUtils viewUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock_picks);
        ButterKnife.bind(this);
        viewUtils = new ViewUtils(this);
        viewUtils.statusbar_color();

        String fromtab = getIntent().getStringExtra("fromtab");


        list.setLayoutManager(new LinearLayoutManager(StockPicksActivity.this,
                LinearLayoutManager.VERTICAL, false));

        adapterStocks = new AdapterStockPicks(StockPicksActivity.this,fromtab);
        list.setAdapter(adapterStocks);

    }

    @OnClick(R.id.submit)
    void expanded_menu() {
        popup_successfully();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }


    public void popup_successfully() {
        android.app.AlertDialog.Builder alertDialog = new
                android.app.AlertDialog.Builder(StockPicksActivity.this);

        alertDialog.setTitle("");
        alertDialog.setMessage("Stocks added successfully to the contest.");
        alertDialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                startActivity(new Intent(StockPicksActivity.this, OtherActivitys.class)
                        .putExtra("type","prizewinner"));
            }
        });


        alertDialog.show();
    }
}
