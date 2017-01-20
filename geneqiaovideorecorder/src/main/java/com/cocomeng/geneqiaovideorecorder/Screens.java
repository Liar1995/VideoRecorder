package com.cocomeng.geneqiaovideorecorder;

import android.content.Context;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;


class Screens {

    @SuppressWarnings("deprecation")
    static int getScreenHeight(Context context) {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        return display.getHeight();

    }

    @SuppressWarnings("deprecation")
    static int getScreenWidth(Context context) {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        return display.getWidth();
    }

    static int dpToPx(int dp, Context context) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
    }
}
