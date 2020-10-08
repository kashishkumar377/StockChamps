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
import com.stockchamps.adapters.AdapterLeaderList;
import com.stockchamps.adapters.AdapterResult;

public class ResultListFragment extends Fragment {

    public ResultListFragment newInstance() {
        ResultListFragment resultListFragment = new ResultListFragment();
        return resultListFragment;
    }

    @BindView(R.id.list)
    RecyclerView list;

    AdapterResult adapterListOption;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result_list, container, false);
        ButterKnife.bind(this, view);

        list.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));

        adapterListOption = new AdapterResult(getActivity());
        list.setAdapter(adapterListOption);

        return view;
    }


}