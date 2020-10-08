package com.stockchamps.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;
import com.pixplicity.easyprefs.library.Prefs;
import com.stockchamps.R;
import com.stockchamps.customview.CustomTextView;
import com.stockchamps.fragments.ContestFragment;
import com.stockchamps.fragments.LeaderListFragment;
import com.stockchamps.fragments.LeaderShipFragment;
import com.stockchamps.fragments.LeaderTabListFragment;
import com.stockchamps.fragments.MyStockFragment;
import com.stockchamps.fragments.ResultFragment;
import com.stockchamps.fragments.ResultListFragment;
import com.stockchamps.fragments.ResultListOptionsFragment;
import com.stockchamps.fragments.ResultsFragment;
import com.stockchamps.healper.ViewUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.title)
    CustomTextView title;

    public ViewUtils viewUtils;

    public int[] tabIcons = {
            R.drawable.conestent,
            R.drawable.stock,
            R.drawable.leaderboard,
            R.drawable.ic_result_tab,
    };

    private TabLayout tabLayout;
    private ViewPager mViewPager;
    private ViewPagerAdapter viewpager_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        viewUtils = new ViewUtils(this);
        viewUtils.statusbar_color();

        Prefs.putBoolean("addstock",false);

        viewpager();

    }

    public void viewpager() {
        viewpager_adapter = new ViewPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setOffscreenPageLimit(3);
        setupViewPager(mViewPager);
        tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(mViewPager);
        mViewPager.setCurrentItem(0);
        setupTabIcons();


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int tabIconColor = ContextCompat.getColor(MainActivity.this, R.color.color_pink);
                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);

                if (tab.getPosition() == 0) {
                    title.setText("CONTESTS");
                }else if (tab.getPosition() == 1){
                    title.setText("MY STOCKS");
                }else if (tab.getPosition() == 2){
                    title.setText("LEADERBOARD");
                }else if (tab.getPosition() == 3){
                    title.setText("RESULT");
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

                int tabIconColor = ContextCompat.getColor(MainActivity.this, R.color.darkGray);
                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {



            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public void startUpdate(ViewGroup container) {
            super.startUpdate(container);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[2]);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        tabLayout.getTabAt(0).getIcon().setColorFilter(Color.parseColor("#e82d94"), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(1).getIcon().setColorFilter(Color.parseColor("#636363"), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(2).getIcon().setColorFilter(Color.parseColor("#636363"), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(3).getIcon().setColorFilter(Color.parseColor("#636363"), PorterDuff.Mode.SRC_IN);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new ContestFragment(), "CONTESTS");
        adapter.addFragment(new LeaderListFragment(), "MY STOCKS");
        adapter.addFragment(new LeaderTabListFragment(), "LEADERBOARD");
        adapter.addFragment(new ResultListFragment(), "RESULTS");

        viewPager.setAdapter(adapter);
    }

}
