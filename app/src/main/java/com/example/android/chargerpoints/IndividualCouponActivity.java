package com.example.android.chargerpoints;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.realm.Realm;

public class IndividualCouponActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Realm realm = Realm.getDefaultInstance();
        try {

            //
            // ... Do something ...
            //

        } finally {
            realm.close();
        }

        setContentView(R.layout.activity_individual_coupon);

        if(getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

}
