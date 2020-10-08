package com.stockchamps.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stockchamps.R;
import com.stockchamps.activities.LoginProcessActivity;
import com.stockchamps.activities.MainActivity;
import com.stockchamps.activities.Splash;
import com.stockchamps.customview.EditTextCustom;
import com.stockchamps.healper.ViewUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    public static LoginFragment loginFragment;

    public static LoginFragment newInstance() {
        if (loginFragment == null)
            loginFragment = new LoginFragment();
        return loginFragment;
    }

    @BindView(R.id.username)
    EditTextCustom username;

    @BindView(R.id.ed_password)
    EditTextCustom ed_password;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this, view);


        return  view;

    }


    @OnClick(R.id.login)
    void login() {
        if (username.getText().toString().trim().equalsIgnoreCase("")) {
            ViewUtils.showToast(getContext(), getString(R.string.enter_name));
        } else if (ed_password.getText().toString().trim().equalsIgnoreCase("")) {
            ViewUtils.showToast(getContext(), getString(R.string.enter_password));
        } else {
            startActivity(new Intent(getActivity(), MainActivity.class));
        }
    }

 @OnClick(R.id.register)
    void signupClick() {
        SignupFragment loginFragment = SignupFragment.newInstance();
        FragmentTransaction fts = getActivity().getSupportFragmentManager().beginTransaction();
        fts.replace(R.id.fragmentHolder, loginFragment);
        fts.addToBackStack(loginFragment.getClass().getSimpleName());
        fts.commit();
    }


}
