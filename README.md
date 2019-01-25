# OnePlusCallRecorderEnabler
A as-simple-as-possible Android application enabling the "hidden" call recording feature on OnePlus devices. No root necessary!

Hi OnePlus users!

As you may know, on Android 9 Google decided to block all third-party call recorders (well, you'll know for sure if you use one of them).

This restriction may be circumvented by system applications, and kindly enough the OnePlus telephone dialer app includes one.

Hurray!

Kinda.

It seems like OnePlus enabled this feature on a per-regional basis; and it's not clear what policy has been followed.
Since in my country (Italy) call recording is perfectly legal, I'd like to have that feature back...

The workaround is to launch in an Android shell the command:

```
settings put global op_voice_recording_supported_by_mcc 1
```

You can try that, and it works, but unfortunately it gets reset after a reboot.

This application does nothing more than executing this known workaround after the phone is unlocked.

# How to install

Under the release tab you can find a .zip file containing the apk. If you prefer, you can clone the repository and import the project in Android studio / IntelliJ IDEA.

After you install the apk, connect the phone to your computer, enable USB debugging, and execute this command in adb shell:

```
pm grant eu.fabrisg.onepluscallrecorderenabler android.permission.WRITE_SECURE_SETTINGS
```

It is necessary to grant the application the WRITE_SECURE_SETTINGS permission, otherwise it cannot edit certain global settings (like the one aforementioned). AFAIK, that's the only method to grant an application this permission.

I'm quite sure you also need to switch off battery optimization for this application in order to get it working. It should not affect your battery performance as it is executed only at startup.

Launch the application once and press the button. Then, open the OnePlus dialer app, navigate to settings, you should find "call record" in the menu. If you switch off and turn back on the phone, the setting should be still there.

# Disclaimer
Before using this app, you should check whether call recording is legal in your country. Anyway, the responsibility of what you do with this code is all yours!
