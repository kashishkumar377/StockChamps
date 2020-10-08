package com.stockchamps.adapters;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.stockchamps.R;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;

public class AdapterHistory  extends RecyclerView.Adapter<AdapterHistory.ViewHolder> {

    Activity context;
    LayoutInflater inflater;

    public AdapterHistory(Activity con) {
        this.context = con;
        inflater = LayoutInflater.from(con);

    }

    @Override
    public AdapterHistory.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.adapter_history, parent, false);
        AdapterHistory.ViewHolder holder;
        holder = new AdapterHistory.ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterHistory.ViewHolder holder, int position) {
        

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }
    }
}