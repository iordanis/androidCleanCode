package com.iordanis.example.module;

import android.os.Build;

import com.iordanis.example.apichanges.ApplyPreferencesSaver;
import com.iordanis.example.apichanges.CommitPreferencesSaver;
import com.iordanis.example.apichanges.PreferencesSaver;

public class PreferencesSaverModule {

	public static PreferencesSaver preferencesSaver() {
		if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
		    return new ApplyPreferencesSaver();
		} else {
			return new CommitPreferencesSaver();
		}
	}
}
