package com.iordanis.example.module;

import static android.preference.PreferenceManager.getDefaultSharedPreferences;
import static com.iordanis.example.DependencyInjectedApplication.getApplication;
import android.content.Context;
import android.content.SharedPreferences;

import com.iordanis.example.apichanges.Editor;
import com.iordanis.example.apichanges.EditorCompat;

public class EditorModule {

	public static Editor editor() {
		Context applicationContext = getApplication().getApplicationContext();
		SharedPreferences sharedPreferences = getDefaultSharedPreferences(applicationContext);
		return new EditorCompat(sharedPreferences.edit());
	}

}
