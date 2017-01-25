package com.example.android.chargerpoints;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Jenna on 1/23/2017.
 */

    public class MyApplication extends Application{
        @Override
        public void onCreate() {
            super.onCreate();
            // The Realm file will be located in Context.getFilesDir() with name "default.realm"
            Realm.init(this);
            RealmConfiguration config = new RealmConfiguration.Builder().build();
            Realm.setDefaultConfiguration(config);

            RealmConfiguration myConfig = new RealmConfiguration.Builder()
                    .name("myrealm.realm")
                    .inMemory()
                    .build();

        }

    }

