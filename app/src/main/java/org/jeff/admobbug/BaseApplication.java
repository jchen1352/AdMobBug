package org.jeff.admobbug;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;

public class BaseApplication extends Application {

    public static final String APP_ID = "ca-app-pub-3940256099942544~3347511713";
    public static final String AD_UNIT_ID = "ca-app-pub-3940256099942544/5224354917";

    @Override
    public void onCreate() {
        super.onCreate();
        //Initialize only once per application
        MobileAds.initialize(getApplicationContext(), APP_ID);
    }
}
