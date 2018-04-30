package com.dinocata.speechtotext;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MainActivity.VoiceCommand.initAll(this);
    }
}
