package com.stockchamps.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stockchamps.R;
import com.stockchamps.customview.CustomTextView;

import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterResultList  extends RecyclerView.Adapter<AdapterResultList.ViewHolder> {

    Activity context;
    LayoutInflater inflater;

    public AdapterResultList(Activity con) {
        this.context = con;
        inflater = LayoutInflater.from(con);

    }

    @Override
    public AdapterResultList.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.adapter_result_list, parent, false);
        AdapterResultList.ViewHolder holder;
        holder = new AdapterResultList.ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterResultList.ViewHolder holder, int position) {
        holder.count.setText(position+1+"");


    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.count)
        CustomTextView count;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}
