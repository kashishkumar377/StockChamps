package com.stockchamps.adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.stockchamps.R;
import com.stockchamps.activities.ResultStockPickupActivity;
import com.stockchamps.activities.StockActivity;
import com.stockchamps.activities.StockPicksActivity;
import com.stockchamps.customview.CustomTextView;

import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterResulttab extends RecyclerView.Adapter<AdapterResulttab.ViewHolder> {

    Activity context;
    LayoutInflater inflater;

    public AdapterResulttab(Activity con) {
        this.context = con;
        inflater = LayoutInflater.from(con);

    }

    @Override
    public AdapterResulttab.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.adapter_result_tab, parent, false);
        AdapterResulttab.ViewHolder holder;
        holder = new AdapterResulttab.ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterResulttab.ViewHolder holder, int position) {
        holder.count.setText(position+1+"");

        if(position % 2 == 0)
        {
            //holder.rootView.setBackgroundColor(Color.BLACK);
            holder.loss_view.setVisibility(View.VISIBLE);
            holder.profit_view.setVisibility(View.GONE);
        }
        else
        {
            //holder.rootView.setBackgroundColor(Color.WHITE);
            holder.loss_view.setVisibility(View.GONE);
            holder.profit_view.setVisibility(View.VISIBLE);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, ResultStockPickupActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.count)
        CustomTextView count;

        @BindView(R.id.loss_view)
        LinearLayout loss_view;

         @BindView(R.id.profit_view)
         LinearLayout profit_view;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
