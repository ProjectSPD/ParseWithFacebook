package com.priyanka.priyafbloginwparse;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.parse.Parse;
import com.parse.ParseFacebookUtils;

public class PriyaFBLoginWParseApp extends Application {
	static final String TAG = "PriyaFBLoginWParseApp";
	
    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        //Parse.enableLocalDatastore(this);
        
        Parse.initialize(this, "AX5WB3aed8WV060l6Ar7wnG3zooFXixj1ujxs8tF", "ZH9zXNkVJ8EF16f2Ed1MlzUOidNVeVYaTwl5NtT2");
        FacebookSdk.sdkInitialize(this);
        ParseFacebookUtils.initialize(this);

    }
}
