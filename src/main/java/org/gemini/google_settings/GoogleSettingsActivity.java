package org.gemini.google_settings;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;

public final class GoogleSettingsActivity extends Activity
{
    @Override
    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Intent intent = new Intent(Intent.ACTION_MAIN).
                                addCategory(Intent.CATEGORY_LAUNCHER).
                                setClassName("com.google.android.gms",
                                             "com.google.android.gms.app.settings.GoogleSettingsLink");
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Process.killProcess(Process.myPid());
        System.exit(0);
    }
}
