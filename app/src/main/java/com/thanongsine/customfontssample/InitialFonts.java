package com.thanongsine.customfontssample;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Ted555 on 6/21/2016.
 */
public class InitialFonts extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        //Config default Fonts
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("Fonts/Phetsarath_OT.ttf")
                .setFontAttrId(R.attr.fontPath).build());
    }
}
