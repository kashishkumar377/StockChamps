package com.stockchamps.adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.stockchamps.R;
import com.stockchamps.activities.GraphActivity;
import com.stockchamps.customview.CustomTextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterGraphlist  extends RecyclerView.Adapter<AdapterGraphlist.ViewHolder> {

    Activity context;
    LayoutInflater inflater;
    String fromtab;

    public AdapterGraphlist(Activity con) {
        this.context = con;
        inflater = LayoutInflater.from(con);

    }

    @Override
    public AdapterGraphlist.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.adapter_graph, parent, false);
        AdapterGraphlist.ViewHolder holder;
        holder = new AdapterGraphlist.ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterGraphlist.ViewHolder holder, int position) {
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                context.startActivity(new Intent(context, GraphActivity.class));
//            }
//        });
//
//
//        holder.count.setText(position+1+"");
    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

//        @BindView(R.id.count)
//        CustomTextView count;
////
//        @BindView(R.id.text1)
//        CustomTextView text1;
//
//        @BindView(R.id.text2)
//        CustomTextView text2;
//
//
//        @BindView(R.id.select_stock_view)
//        LinearLayout select_stock_view;
//
//        @BindView(R.id.add_stock_view)
//        LinearLayout add_stock_view;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
