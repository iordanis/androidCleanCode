package com.iordanis.example.apichanges;

import android.content.SharedPreferences;

public class ApplyPreferencesSaver implements PreferencesSaver {

	@Override
	public void save(SharedPreferences.Editor editor) {
		editor.apply();
	}

}
