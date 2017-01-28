package com.example.android.WeatherReport;

/**
 * Created by Jonathan S Garcia on 1/26/2017.
 */
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;

public class WeatherSettings extends AppCompatActivity {
    @Override
    protected void OnCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
    }
    public static class WeatherPreferenceFragment extends PreferenceFragment{

    }
}
