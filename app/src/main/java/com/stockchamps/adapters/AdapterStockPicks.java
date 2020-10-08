package com.stockchamps.adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.pixplicity.easyprefs.library.Prefs;
import com.stockchamps.R;
import com.stockchamps.activities.StockActivity;
import com.stockchamps.activities.StockPicksActivity;
import com.stockchamps.customview.CustomTextView;

import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterStockPicks extends RecyclerView.Adapter<AdapterStockPicks.ViewHolder> {

    Activity context;
    LayoutInflater inflater;
    String fromtab;

    public AdapterStockPicks(Activity con,String fromtab) {
        this.context = con;
        this.fromtab = fromtab;
        inflater = LayoutInflater.from(con);

    }

    @Override
    public AdapterStockPicks.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.adapter_stock_pick, parent, false);
        AdapterStockPicks.ViewHolder holder;
        holder = new AdapterStockPicks.ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterStockPicks.ViewHolder holder, int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, StockActivity.class));
            }
        });


        if (fromtab != null)
            if (fromtab.equalsIgnoreCase("1")){
                holder.select_stock_view.setVisibility(View.GONE);
                holder.add_stock_view.setVisibility(View.VISIBLE);
            }

        if (position != 0) {
            holder.count.setText(position + 1 + "");
        }


        if (Prefs.getBoolean("addstock", false) == true) {
            if (Prefs.getString("position0", "").equalsIgnoreCase(position + "")) {
                holder.select_stock_view.setVisibility(View.GONE);
                holder.add_stock_view.setVisibility(View.VISIBLE);

                holder.text1.setText("AAAL");
                holder.text2.setText("Agilent Technologies");

            } else {
                holder.select_stock_view.setVisibility(View.VISIBLE);
                holder.add_stock_view.setVisibility(View.GONE);
            }

            if (Prefs.getString("position1", "fds").equalsIgnoreCase(position + "")) {
                holder.select_stock_view.setVisibility(View.GONE);
                holder.add_stock_view.setVisibility(View.VISIBLE);

                holder.text1.setText("AA");
                holder.text2.setText("Agilent Technologies");
            }
            if (Prefs.getString("position2", "fds").equalsIgnoreCase(position + "")) {
                holder.select_stock_view.setVisibility(View.GONE);
                holder.add_stock_view.setVisibility(View.VISIBLE);
                holder.text1.setText("AL");
                holder.text2.setText("Agilent Technologies");
            }
            if (Prefs.getString("position3", "fdfds").equalsIgnoreCase(position + "")) {
                holder.select_stock_view.setVisibility(View.GONE);
                holder.add_stock_view.setVisibility(View.VISIBLE);

                holder.text1.setText("AAL");
                holder.text2.setText("Agilent Technologies");
            }
            if (Prefs.getString("position4", "dasddsa").equalsIgnoreCase(position + "")) {
                holder.select_stock_view.setVisibility(View.GONE);
                holder.add_stock_view.setVisibility(View.VISIBLE);

                holder.text1.setText("AL");
                holder.text2.setText("Agilent Technologies");
            }


        }

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.count)
        CustomTextView count;

        @BindView(R.id.text1)
        CustomTextView text1;

        @BindView(R.id.text2)
        CustomTextView text2;


        @BindView(R.id.select_stock_view)
        LinearLayout select_stock_view;

        @BindView(R.id.add_stock_view)
        LinearLayout add_stock_view;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}