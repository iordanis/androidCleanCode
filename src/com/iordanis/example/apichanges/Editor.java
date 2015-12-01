package com.iordanis.example.apichanges;

import java.util.Set;

import android.content.SharedPreferences;

/**
 * An Editor that wraps the Android platform {@link SharedPreferences.Editor} and adds compatibility constraints.
 */
public interface Editor {

	/** @see SharedPreferences.Editor#putString(String, String) */
	Editor putString(String key, String value);

	/** @see SharedPreferences.Editor#putStringSet(String, Set) */
	Editor putStringSet(String key, Set<String> value);

	/** @see SharedPreferences.Editor#putInt(String, int) */
	Editor putInt(String key, int value);

	/** @see SharedPreferences.Editor#putLong(String, long) */
	Editor putLong(String key, long value);

	/** @see SharedPreferences.Editor#putFloat(String, float) */
	Editor putFloat(String key, float value);

	/** @see SharedPreferences.Editor#putBoolean(String, boolean) */
	Editor putBoolean(String key, boolean value);

	/** @see SharedPreferences.Editor#remove(String) */
	Editor remove(String key);

	/** @see SharedPreferences.Editor#clear() */
	Editor clear();

	/**
	 * Saves the current transaction with a runtime platform compatible way.
	 *
	 * @see SharedPreferences.Editor#commit()
	 * @see SharedPreferences.Editor#apply()
	 */
	Editor save();

}
