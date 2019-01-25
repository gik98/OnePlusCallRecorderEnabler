package eu.fabrisg.onepluscallrecorderenabler;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_enable = findViewById(R.id.btn_enable);
        btn_enable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Settings.Global.putInt(MainActivity.this.getContentResolver(), "op_voice_recording_supported_by_mcc", 1);
                } catch (Exception e) {
                    Log.e("OPCR_enabler", e.getMessage());
                    e.printStackTrace();
                }
            }
        });
    }
}
