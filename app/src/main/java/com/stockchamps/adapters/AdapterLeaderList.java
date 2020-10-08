package com.stockchamps.adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stockchamps.R;
import com.stockchamps.activities.OtherActivitys;
import com.stockchamps.activities.StockPicksActivity;

import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;

public class AdapterLeaderList  extends RecyclerView.Adapter<AdapterLeaderList.ViewHolder> {

    Activity context;
    LayoutInflater inflater;

    public AdapterLeaderList(Activity con) {
        this.context = con;
        inflater = LayoutInflater.from(con);

    }

    @Override
    public AdapterLeaderList.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.adapterlistoptions, parent, false);
        AdapterLeaderList.ViewHolder holder;
        holder = new AdapterLeaderList.ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterLeaderList.ViewHolder holder, int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               context.startActivity(new Intent(context, OtherActivitys.class)
                        .putExtra("type","prizewinner"));
            }
        });


    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}