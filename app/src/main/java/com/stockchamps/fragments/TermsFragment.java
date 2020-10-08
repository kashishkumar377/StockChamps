package com.stockchamps.fragments;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stockchamps.R;
public class TermsFragment extends Fragment {

    public static TermsFragment newInstance() {
        TermsFragment termsFragment = new TermsFragment();
        return termsFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_terms, container, false);
        ButterKnife.bind(this, view);


        return  view;
    }

    @OnClick(R.id.back)
    void termsClick() {
        SignupFragment loginFragment = SignupFragment.newInstance();
        FragmentTransaction fts = getActivity().getSupportFragmentManager().beginTransaction();
        fts.replace(R.id.fragmentHolder, loginFragment);
//        fts.addToBackStack(loginFragment.getClass().getSimpleName());
        fts.commit();
    }
}
