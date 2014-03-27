package com.iordanis.example.apichanges;

import java.util.Set;

import android.content.SharedPreferences;
import android.os.Build;

public class EditorCompat implements Editor {

	private final android.content.SharedPreferences.Editor delegateEditor;

	public EditorCompat(SharedPreferences.Editor delegateEditor) {
		this.delegateEditor = delegateEditor;
	}

	@Override
	public Editor putString(String key, String value) {
		delegateEditor.putString(key, value);
		return this;
	}

	@Override
	public Editor putStringSet(String key, Set<String> value) {
		delegateEditor.putStringSet(key, value);
		return this;
	}

	@Override
	public Editor putInt(String key, int value) {
		delegateEditor.putInt(key, value);
		return this;
	}

	@Override
	public Editor putLong(String key, long value) {
		delegateEditor.putLong(key, value);
		return this;
	}

	@Override
	public Editor putFloat(String key, float value) {
		delegateEditor.putFloat(key, value);
		return this;
	}

	@Override
	public Editor putBoolean(String key, boolean value) {
		delegateEditor.putBoolean(key, value);
		return this;
	}

	@Override
	public Editor remove(String key) {
		delegateEditor.remove(key);
		return this;
	}

	@Override
	public Editor clear() {
		delegateEditor.clear();
		return this;
	}

	@Override
	public Editor save() {
		if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
			delegateEditor.apply();
		} else {
			delegateEditor.commit();
		}
		return this;
	}

}
