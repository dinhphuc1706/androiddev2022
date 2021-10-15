package vn.edu.usth.weather;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    private ForecastFragment forecastFragment;
    private WeatherFragment weatherFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        forecastFragment = new ForecastFragment();
        weatherFragment = new WeatherFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.forecast, forecastFragment)
                .replace(R.id.weather, weatherFragment)
                .commit();


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
}