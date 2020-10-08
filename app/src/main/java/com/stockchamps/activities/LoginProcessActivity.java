package com.stockchamps.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.stockchamps.R;
import com.stockchamps.fragments.LoginFragment;
import com.stockchamps.healper.ViewUtils;

public class LoginProcessActivity extends AppCompatActivity {

    public ViewUtils viewUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_process);
        viewUtils = new ViewUtils(this);
        viewUtils.statusbar_color();

        LoginFragment loginFragment = LoginFragment.newInstance();
        FragmentTransaction fts = this.getSupportFragmentManager().beginTransaction();
        fts.replace(R.id.fragmentHolder, loginFragment);
        fts.addToBackStack(loginFragment.getClass().getSimpleName());
        fts.commit();

    }

    @Override
    public void onBackPressed() {
        FragmentTransaction fts = this.getSupportFragmentManager().beginTransaction();
        FragmentManager fragmentManager = this.getSupportFragmentManager();
        if (fragmentManager.getBackStackEntryCount() > 1) {
            fragmentManager.popBackStackImmediate();
            fts.commit();
        } else {
            finish();
        }
    }
}
