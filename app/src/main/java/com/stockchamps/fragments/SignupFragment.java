package com.stockchamps.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.text.Html;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.stockchamps.R;
import com.stockchamps.activities.MainActivity;
import com.stockchamps.customview.CustomTextView;
import com.stockchamps.customview.EditTextCustom;
import com.stockchamps.healper.ViewUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignupFragment extends Fragment {

    public static SignupFragment newInstance() {
        SignupFragment signupFragment = new SignupFragment();
        return signupFragment;
    }

    @BindView(R.id.terms)
    CustomTextView terms;

    @BindView(R.id.ed_username)
    EditTextCustom username;

    @BindView(R.id.ed_mail)
    EditTextCustom ed_mail;

    @BindView(R.id.ed_password)
    EditTextCustom ed_password;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_signup, container, false);
        ButterKnife.bind(this, view);
        setText();


        return view;
    }

    public void setText(){
        String first = getString(R.string.terms_text);
        String second = "<font color='#1e90ff'> Terms of Service </font>";
        String third = "<font color='#1e90ff'> Privacy Policy </font>";
        String four = getString(R.string.and);

        terms.setText(Html.fromHtml(first + second+ four+ third));
    }

    @OnClick(R.id.signup)
    void login() {
        if (username.getText().toString().trim().equalsIgnoreCase("")) {
            ViewUtils.showToast(getContext(), getString(R.string.enter_name));
        }else if (ed_mail.getText().toString().trim().equalsIgnoreCase("")) {
            ViewUtils.showToast(getContext(), getString(R.string.enter_valid_email));
        } else if (!Patterns.EMAIL_ADDRESS.matcher(ed_mail.getText().toString()).matches()) {
            ViewUtils.showToast(getContext(), getString(R.string.enter_valid_email));
        } else if (ed_password.getText().toString().trim().equalsIgnoreCase("")) {
            ViewUtils.showToast(getContext(), getString(R.string.enter_password));
        } else {
            startActivity(new Intent(getActivity(), MainActivity.class));
        }
    }

    @OnClick(R.id.login_text)
    void signupClick() {
        LoginFragment loginFragment = LoginFragment.newInstance();
        FragmentTransaction fts = getActivity().getSupportFragmentManager().beginTransaction();
        fts.replace(R.id.fragmentHolder, loginFragment);
        fts.addToBackStack(null);
        fts.commit();
    }
  @OnClick(R.id.terms)
    void termsClick() {
        TermsFragment termsFragment = TermsFragment.newInstance();
        FragmentTransaction fts = getActivity().getSupportFragmentManager().beginTransaction();
        fts.replace(R.id.fragmentHolder, termsFragment);
        fts.addToBackStack(termsFragment.getClass().getSimpleName());
        fts.commit();
    }
}
