package com.jordilucas.visatest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.checkout.CheckoutKit;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*CheckoutKit.init(getApplicationContext(), CheckoutKit.Environment.SANDBOX,
                "MERCHANT-API-KEY", "PROFILE-NAME",
                new VisaCheckoutSdkInitListener() {
                    @Override public void status(int code, String message) {
                        Log.v(TAG, "Code:" + code + "  Message:" + message);
                    }
                });*/

    }
}
