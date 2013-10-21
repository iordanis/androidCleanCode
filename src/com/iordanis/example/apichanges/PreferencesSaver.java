package com.iordanis.example.apichanges;

import android.content.SharedPreferences;

public interface PreferencesSaver {

	void save(SharedPreferences.Editor editor);
}
