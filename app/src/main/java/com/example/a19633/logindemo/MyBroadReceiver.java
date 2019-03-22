package com.example.a19633.logindemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"receiver in MyBroadcastReceiver",Toast.LENGTH_SHORT).show();
    }
}
