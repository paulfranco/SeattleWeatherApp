package co.paulfran.paulfranco.seattleweather.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import co.paulfran.paulfranco.seattleweather.MainActivity;
import co.paulfran.paulfranco.seattleweather.R;
import co.paulfran.paulfranco.seattleweather.adapters.DayAdapter;
import co.paulfran.paulfranco.seattleweather.weather.Day;

public class DailyForecastActivity extends AppCompatActivity {
    private Day[] mDays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        Intent intent = getIntent();
        mDays = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);

        DayAdapter adapter = new DayAdapter(this, mDays);
    }
}
