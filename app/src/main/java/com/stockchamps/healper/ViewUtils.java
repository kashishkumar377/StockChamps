package com.stockchamps.healper;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;

import com.stockchamps.R;

import androidx.core.content.ContextCompat;

public class ViewUtils {

    private static Context activitys;
    Activity activity;

    public ViewUtils(Activity c) {
        this.activity = c;
        this.activitys = c;
    }

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public final boolean IsInternetOn() {
        boolean flag = false;
        ConnectivityManager connec = (ConnectivityManager) activity.getSystemService(activity.CONNECTIVITY_SERVICE);

        if (connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTED ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTED) {

            flag = true;

        } else if (connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.DISCONNECTED ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.DISCONNECTED) {

            flag = false;
        }
        return flag;
    }
    AlertDialog.Builder ad;
    public void DialogInternet(final int requestCode) {
        ad = new AlertDialog.Builder(activity);
        ad.setTitle("No Internet Connection");
        ad.setMessage("Turn On your Internet Connection");
        ad.setCancelable(false);
        ad.setNegativeButton("Mobile Data", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(Settings.ACTION_DATA_ROAMING_SETTINGS);
                activity.startActivityForResult(i, requestCode);
            }
        });
        ad.setPositiveButton("Wifi", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(Settings.ACTION_WIFI_SETTINGS);
                activity.startActivityForResult(i, requestCode);
            }
        });

        ad.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        ad.show();
    }

    public void statusbar_color() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            activity.getWindow().setStatusBarColor(ContextCompat.getColor(activity,
                    R.color.app_statusbarcolor));
        activity.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
    }

}
