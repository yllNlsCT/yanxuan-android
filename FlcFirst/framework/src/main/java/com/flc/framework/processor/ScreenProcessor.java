package com.flc.framework.processor;

import android.util.DisplayMetrics;

import com.flc.framework.BaseApp;

/**
 * Created by channagihong on 31/12/2017.
 */

public class ScreenProcessor {

    private static int widthPixel;
    private static int heightPixel;
    private static float density;
    private static int[] size;

    public void init() {
        DisplayMetrics displayMetrics = BaseApp.getInstance().getResources().getDisplayMetrics();
        widthPixel = displayMetrics.widthPixels;
        heightPixel = displayMetrics.heightPixels;
        density = displayMetrics.density;
    }

    public int[] getPortraitScreenSize() {
        if(null == size) {
            size = new int[] {widthPixel, heightPixel};
        }
        return size;
    }

    public int getPortraitScreenWidth() {
        return widthPixel;
    }

    public int getPotraitScreenHeight() {
        return heightPixel;
    }

}
