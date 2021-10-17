package vn.edu.usth.weather;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        PagerAdapter adapter = new HomeFragmentPagerAdapter(
                getSupportFragmentManager());
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);
        pager.setAdapter(adapter);



        Log.i("Weather", "OnCreate() Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather", "OnStart() Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather", "OnStop() Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather", "OnDestroy() Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather", "OnPause() Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather", "OnResume() Called");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.i("Weather", "OnCreate() Called");
    }


    public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
        private final int PAGE_COUNT = 3;
        private String titles[] = new String[]{"ICT", "CS", "MST"};


        public HomeFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return PAGE_COUNT; // number of pages for a ViewPager
        }

        @Override
        public Fragment getItem(int page) {
// returns an instance of Fragment corresponding to the specified page
            switch (page) {
                case 0:
                    return new WeatherAndForecastFragment();
                case 1:
                    return new WeatherAndForecastFragment();
                case 2:
                    return new WeatherAndForecastFragment();
            }
            return new Fragment(); // failsafe
        }

        @Override
        public CharSequence getPageTitle(int page) {
            return titles[page];
        }
    }
}