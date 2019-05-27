package ru.geekbrains.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class SecondActivity extends AppCompatActivity implements WeatherString{

    private TextView textWeather;
    private String enterCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        enterCity = Objects.requireNonNull(getIntent().getExtras()).getString(MainActivity.keyCity);
        InitView();
        setWeather();
        Toast.makeText(getApplicationContext(), "SecondActivity onCreate()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle","SecondActivity onCreate()");

    }

    private void InitView() {
        textWeather = findViewById(R.id.textWeather);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "SecondActivity onStart()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle","SecondActivity onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "SecondActivity onRestart()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle","SecondActivity onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "SecondActivity onPause()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle","SecondActivity onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "SecondActivity onCreate()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle","SecondActivity onCreate()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "SecondActivity onStop()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle","SecondActivity onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "SecondActivity onDestroy()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle","SecondActivity onDestroy()");
    }

    private void setWeather() {
        Weather builder = new Weather(this);
        String text = builder.getText();
        textWeather.setText(text);
    }

    @Override
    public String getVisibilityString() {
        return getString(R.string.wclear);
    }

    @Override
    public String getCityString() {
        return enterCity;
    }

    @Override
    public String getTemperatureString() {
        return getString(R.string.temperature);
    }
}
