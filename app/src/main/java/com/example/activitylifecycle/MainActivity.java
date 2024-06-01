package com.example.activitylifecycle;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public String TAG = this.getClass().getSimpleName();

    private String getCurrentState() {
        return this.getLifecycle().getCurrentState().name();
    }

    private void logMsg() {
        Log.i(TAG, "Owner " + this.getCurrentState());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        this.getLifecycle().addObserver(new MainActivityObserver());

        this.logMsg();
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.logMsg();
    }
    @Override
    protected void onResume() {
        super.onResume();
        this.logMsg();
    }
    @Override
    protected void onPause() {
        super.onPause();
        this.logMsg();
    }
    @Override
    protected void onStop() {
        super.onStop();
        this.logMsg();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.logMsg();
    }
}
