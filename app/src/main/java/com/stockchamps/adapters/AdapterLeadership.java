package com.stockchamps.adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.stockchamps.R;
import com.stockchamps.activities.OtherActivitys;
import com.stockchamps.customview.CustomTextView;

import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterLeadership  extends RecyclerView.Adapter<AdapterLeadership.ViewHolder> {

    Activity context;
    LayoutInflater inflater;

    public AdapterLeadership(Activity con) {
        this.context = con;
        inflater = LayoutInflater.from(con);

    }

    @Override
    public AdapterLeadership.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.adapter_contest, parent, false);
        AdapterLeadership.ViewHolder holder;
        holder = new AdapterLeadership.ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterLeadership.ViewHolder holder, int position) {
        holder.stockview.setVisibility(View.GONE);
        holder.lay_stock.setVisibility(View.VISIBLE);
        holder.open.setVisibility(View.GONE);



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, OtherActivitys.class)
                .putExtra("type","leadership"));
            }
        });

    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.open)
        CustomTextView open;

        @BindView(R.id.stockview)
        RelativeLayout stockview;

        @BindView(R.id.lay_stock)
        LinearLayout lay_stock;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
