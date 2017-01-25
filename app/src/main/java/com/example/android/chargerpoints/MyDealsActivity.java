package com.example.android.chargerpoints;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import io.realm.Realm;

public class MyDealsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Realm realm = Realm.getDefaultInstance();
        Realm.init(this);
        try {

            //
            // ... Do something ...
            //

        } finally {
            realm.close();
        }


        setContentView(R.layout.coupon_list);

        if(getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Initialize Realm

        // Use them like regular java objects
        Coupon coupon = new Coupon();
        coupon.setCompanyName("JCPenney's");
        coupon.setDescription("In Store and Online. Select apparel, shoes, accessories, fine jewelry & home. Expires 12/31/2016");
        coupon.setCouponValue("$10 off $25!");
        coupon.setPts(15);
        coupon.setPicImageResourceId(R.drawable.jcplogo);
        coupon.setQrImageResourceId(R.drawable.jcpqr);

        ArrayList<Coupon> myDeals = new ArrayList<Coupon>();

        myDeals.add(coupon);

        myDeals.add(coupon);

        myDeals.add(coupon);

        myDeals.add(coupon);

        myDeals.add(coupon);

        CouponAdapter adapter = new CouponAdapter(this, myDeals);
        ListView listview = (ListView)findViewById(R.id.list);
        listview.setAdapter(adapter);

    }


}
