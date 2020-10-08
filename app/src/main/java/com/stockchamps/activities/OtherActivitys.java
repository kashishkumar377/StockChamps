package com.stockchamps.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.stockchamps.R;
import com.stockchamps.customview.CustomTextView;
import com.stockchamps.fragments.AmountFragment;
import com.stockchamps.fragments.CheckOutFragment;
import com.stockchamps.fragments.ContestRuleFragment;
import com.stockchamps.fragments.LeaderListFragment;
import com.stockchamps.fragments.LeaderShipFragment;
import com.stockchamps.fragments.PrizeFragment;
import com.stockchamps.fragments.ResultsFragment;
import com.stockchamps.fragments.TransactionHistoryFragment;
import com.stockchamps.healper.ViewUtils;

public class OtherActivitys extends AppCompatActivity {

    @BindView(R.id.title)
    CustomTextView title;

     @BindView(R.id.pick)
    CustomTextView pick;

    @BindView(R.id.dollar)
    ImageView dollar;

    public ViewUtils viewUtils;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_activitys);
        ButterKnife.bind(this);
        viewUtils = new ViewUtils(this);
        viewUtils.statusbar_color();
        dollar.setVisibility(View.GONE);
        Intent intent = getIntent();
        String type = intent.getStringExtra("type");

        if (type.equalsIgnoreCase("leadership")){
            title.setText("LEADERBOARD");
            LeaderListFragment loginFragment = LeaderListFragment.newInstance();
            FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
            fts.replace(R.id.fragmentHolder, loginFragment);
            fts.addToBackStack(loginFragment.getClass().getSimpleName());
            fts.commit();
        }else if (type.equalsIgnoreCase("stock")){
            title.setText("MY STOCK");
            LeaderListFragment loginFragment = LeaderListFragment.newInstance();
            FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
            fts.replace(R.id.fragmentHolder, loginFragment);
            fts.addToBackStack(loginFragment.getClass().getSimpleName());
            fts.commit();

        }else if (type.equalsIgnoreCase("result")){
            title.setText("RESULTS");
            ResultsFragment loginFragment = ResultsFragment.newInstance();
            FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
            fts.replace(R.id.fragmentHolder, loginFragment);
            fts.addToBackStack(loginFragment.getClass().getSimpleName());
            fts.commit();
        }else if (type.equalsIgnoreCase("contestrule")){
            title.setText("Contest rules");
            dollar.setVisibility(View.VISIBLE);
            pick.setVisibility(View.GONE);
            ContestRuleFragment loginFragment = ContestRuleFragment.newInstance();
            FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
            fts.replace(R.id.fragmentHolder, loginFragment);
            fts.addToBackStack(loginFragment.getClass().getSimpleName());
            fts.commit();
        }else if (type.equalsIgnoreCase("prizewinner")){
            title.setText("LEADERBOARD");
            dollar.setVisibility(View.GONE);
            pick.setVisibility(View.VISIBLE);
            PrizeFragment termsFragment = PrizeFragment.newInstance();
            FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
            fts.replace(R.id.fragmentHolder, termsFragment);
            fts.addToBackStack(termsFragment.getClass().getSimpleName());
            fts.commit();
        }else if (type.equalsIgnoreCase("amount")){
            title.setText("ACCOUNT");
            dollar.setVisibility(View.GONE);
            pick.setVisibility(View.VISIBLE);
            AmountFragment termsFragment = AmountFragment.newInstance();
            FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
            fts.replace(R.id.fragmentHolder, termsFragment);
            fts.addToBackStack(termsFragment.getClass().getSimpleName());
            fts.commit();
        }else if (type.equalsIgnoreCase("history")){
            title.setText("Transaction History");
            dollar.setVisibility(View.GONE);
            pick.setVisibility(View.VISIBLE);
            TransactionHistoryFragment transactionHistoryFragment = TransactionHistoryFragment.newInstance();
            FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
            fts.replace(R.id.fragmentHolder, transactionHistoryFragment);
            fts.addToBackStack(transactionHistoryFragment.getClass().getSimpleName());
            fts.commit();
        }else {
            title.setText("CHECKOUT");
            CheckOutFragment loginFragment = CheckOutFragment.newInstance();
            FragmentTransaction fts = getSupportFragmentManager().beginTransaction();
            fts.replace(R.id.fragmentHolder, loginFragment);
            fts.addToBackStack(loginFragment.getClass().getSimpleName());
            fts.commit();
        }

    }
    @Override
    public void onBackPressed() {
       finish();
    }
}
