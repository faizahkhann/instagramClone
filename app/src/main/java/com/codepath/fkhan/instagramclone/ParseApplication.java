package com.codepath.fkhan.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application { //subclass of application

    //initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //register parse models
        ParseObject.registerSubclass((Post.class));

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("kDwZB5HHhw4mI5tVUqFHy0fMCyvI2fQ20iKyQtBE")
                .clientKey("K9I38ROx05yWgtjtixXX2Kw5laJE0uoy1TyamzhM")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
