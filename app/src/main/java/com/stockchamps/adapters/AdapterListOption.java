package com.stockchamps.adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stockchamps.R;
import com.stockchamps.activities.StockPicksActivity;
import com.stockchamps.customview.CustomTextView;

import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterListOption extends RecyclerView.Adapter<AdapterListOption.ViewHolder> {

    Activity context;
    LayoutInflater inflater;

    public AdapterListOption(Activity con) {
        this.context = con;
        inflater = LayoutInflater.from(con);

    }

    @Override
    public AdapterListOption.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.adapterlistoptions, parent, false);
        AdapterListOption.ViewHolder holder;
        holder = new AdapterListOption.ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterListOption.ViewHolder holder, int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, StockPicksActivity.class)
                        .putExtra("fromtab","1"));
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