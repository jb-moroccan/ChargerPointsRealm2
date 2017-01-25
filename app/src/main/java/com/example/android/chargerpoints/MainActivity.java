package com.example.android.chargerpoints;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import io.realm.Realm;


public class MainActivity extends AppCompatActivity {

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

        setContentView(R.layout.activity_main);

        TextView couponsTextView = (TextView) findViewById(R.id.coupons);
        couponsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent couponsIntent = new Intent(MainActivity.this, CouponsActivity.class);
                startActivity(couponsIntent);
            }
        });

        TextView helpTextView = (TextView) findViewById(R.id.help);
        helpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent helpIntent = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(helpIntent);
            }
        });

        TextView myDealsTextView = (TextView) findViewById(R.id.myDeals);
        myDealsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myDealsIntent = new Intent(MainActivity.this, MyDealsActivity.class);
                startActivity(myDealsIntent);
            }
        });

    }

}