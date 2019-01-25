package eu.fabrisg.onepluscallrecorderenabler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.util.Log;

public class BootReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            Settings.Global.putInt(context.getContentResolver(), "op_voice_recording_supported_by_mcc", 1);
        } catch (Exception e) {
            Log.e("OPCR_enabler", e.getMessage());
            e.printStackTrace();
        }

        Log.w("OPCR", "Call recorder enabled");
    }
}
