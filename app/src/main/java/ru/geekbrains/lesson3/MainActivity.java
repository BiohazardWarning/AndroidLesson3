package ru.geekbrains.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    private Button toSecondActivity;
    private EditText enterCity;
    public static String keyCity = "keyCity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setOnClickButNextActivity();
        Toast.makeText(getApplicationContext(), "MainActivity onCreate()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle", "MainActivity onCreate()");
        setWeather();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "MainActivity onStart()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle", "MainActivity onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "MainActivity onRestart()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle", "MainActivity onRestart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "MainActivity onPause()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle", "MainActivity onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "MainActivity onCreate()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle", "MainActivity onCreate()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "MainActivity onStop()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle", "MainActivity onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "MainActivity onDestroy()", Toast.LENGTH_SHORT).show();
        Log.i("LifeCycle", "MainActivity onDestroy()");
    }

    private void setOnClickButNextActivity() {
        toSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String cityString = enterCity.getText().toString();
                intent.putExtra(keyCity, cityString);
            }
        });
    }

    private void setWeather() {
        enterCity = findViewById(R.id.enterCity);
        toSecondActivity = findViewById(R.id.butNextActivity);
    }
}