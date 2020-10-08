package com.stockchamps.adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stockchamps.R;
import com.stockchamps.activities.OtherActivitys;
import com.stockchamps.customview.CustomTextView;

import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterContest extends RecyclerView.Adapter<AdapterContest.ViewHolder> {

    Activity context;
    LayoutInflater inflater;

    public AdapterContest(Activity con) {
        this.context = con;
        inflater = LayoutInflater.from(con);

    }

    @Override
    public AdapterContest.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.adaptercontest_new, parent, false);
        AdapterContest.ViewHolder holder;
        holder = new AdapterContest.ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterContest.ViewHolder holder, int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, OtherActivitys.class)
                        .putExtra("type","amount"));
            }
        });

      holder.contest_rule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, OtherActivitys.class)
                        .putExtra("type","contestrule"));
            }
        });

    holder.open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, OtherActivitys.class)
                        .putExtra("type","contestrule"));
            }
        });

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.contest_rule)
        CustomTextView contest_rule;

        @BindView(R.id.open)
        CustomTextView open;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}