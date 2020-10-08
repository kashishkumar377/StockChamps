package com.stockchamps.adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.pixplicity.easyprefs.library.Prefs;
import com.stockchamps.R;
import com.stockchamps.activities.OtherActivitys;
import com.stockchamps.activities.StockPicksActivity;
import com.stockchamps.customview.CustomTextView;

import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterStocks  extends RecyclerView.Adapter<AdapterStocks.ViewHolder> {

    Activity context;
    LayoutInflater inflater;

    public AdapterStocks(Activity con) {
        this.context = con;
        inflater = LayoutInflater.from(con);

    }

    @Override
    public AdapterStocks.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.adapter_stocks, parent, false);
        AdapterStocks.ViewHolder holder;
        holder = new AdapterStocks.ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterStocks.ViewHolder holder, int position) {


        holder.add_stock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, StockPicksActivity.class));
                Prefs.putBoolean("addstock",true);

                if (position == 0){
                    Prefs.putString("position0",position+"");
                }else if (position == 1){
                    Prefs.putString("position1",position+"");
                }else if (position == 2){
                    Prefs.putString("position2",position+"");
                }else if (position == 3){
                    Prefs.putString("position3",position+"");
                }else if (position == 4){
                    Prefs.putString("position4",position+"");
                }



            }
        });

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.add_stock)
        CustomTextView add_stock;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}