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
import android.widget.LinearLayout;

import com.stockchamps.R;
import com.stockchamps.adapters.AdapterLeadership;
import com.stockchamps.adapters.AdapterListOption;

/**
 * A simple {@link Fragment} subclass.
 */
public class LeaderListFragment extends Fragment {

    public static LeaderListFragment newInstance() {
        LeaderListFragment leaderListFragment = new LeaderListFragment();
        return leaderListFragment;
    }

    @BindView(R.id.list)
    RecyclerView list;

    AdapterListOption adapterListOption;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_leader_list, container, false);
        ButterKnife.bind(this, view);

        list.setLayoutManager(new LinearLayoutManager(getActivity(),
                LinearLayoutManager.VERTICAL, false));

        adapterListOption = new AdapterListOption(getActivity());
        list.setAdapter(adapterListOption);
        
        return view;
    }
}
