package com.example.kageboshi.myngatest.Utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class ScreenUtils {

    public static int getWidth(Context context) {
        WindowManager manager = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE));
        //  DisplayMetrics dm = new DisplayMetrics();
        int width = manager.getDefaultDisplay().getWidth();
        //int width = dm.widthPixels;
        return width;
    }

    public static int getHeight(Context context) {
        WindowManager manager = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE));
        DisplayMetrics dm = new DisplayMetrics();
        int height = manager.getDefaultDisplay().getHeight();
        return height;
    }
}
