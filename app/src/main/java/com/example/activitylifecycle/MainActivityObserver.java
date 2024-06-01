package com.example.activitylifecycle;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

public class MainActivityObserver implements DefaultLifecycleObserver {
    public String TAG = this.getClass().getName();

    private String getCurrentState(LifecycleOwner owner) {
        return owner.getLifecycle().getCurrentState().name();
    }

    private void logMsg(LifecycleOwner owner) {
        Log.i(TAG, "Observer " + this.getCurrentState(owner));
    }

    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
        this.logMsg(owner);
    }

    @Override
    public void onStart(@NonNull LifecycleOwner owner) {
        this.logMsg(owner);
    }

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        this.logMsg(owner);
    }

    @Override
    public void onPause(@NonNull LifecycleOwner owner) {
        this.logMsg(owner);
    }

    @Override
    public void onStop(@NonNull LifecycleOwner owner) {
        this.logMsg(owner);
    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        this.logMsg(owner);
    }
}
