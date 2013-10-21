package com.iordanis.example.apichanges;

import android.content.SharedPreferences;

public class CommitPreferencesSaver implements PreferencesSaver {

	@Override
	public void save(SharedPreferences.Editor editor) {
		editor.commit();
	}

}
