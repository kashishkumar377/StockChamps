package com.stockchamps.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.stockchamps.R;
import com.stockchamps.adapters.AdapterHistory;

public class TransactionHistoryFragment extends Fragment {

    public static TransactionHistoryFragment newInstance() {
         TransactionHistoryFragment transactionHistoryFragment = new TransactionHistoryFragment();
        return transactionHistoryFragment;
    }

    @BindView(R.id.list)
    RecyclerView list;

    AdapterHistory adapterHistory;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_transaction_history, container, false);
        ButterKnife.bind(this, view);

        list.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));

        adapterHistory = new AdapterHistory(getActivity());
        list.setAdapter(adapterHistory);


        return view;
    }
}
