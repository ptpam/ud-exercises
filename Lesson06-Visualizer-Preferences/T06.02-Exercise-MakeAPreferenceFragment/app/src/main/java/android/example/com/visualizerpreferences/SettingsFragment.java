package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by ITU on 25/01/2018.
 */
import android.support.v7.preference.PreferenceFragmentCompat;

public class SettingsFragment extends PreferenceFragmentCompat{
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
