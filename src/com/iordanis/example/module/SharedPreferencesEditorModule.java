package com.iordanis.example.module;

import static com.iordanis.example.MyCoolApplication.getApplication;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public class SharedPreferencesEditorModule {

	public static SharedPreferences.Editor sharedPreferencesEditor() {
		Context applicationContext = getApplication().getApplicationContext();
		SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
		Editor editor = sharedPreferences.edit();

		return editor;
	}

}
