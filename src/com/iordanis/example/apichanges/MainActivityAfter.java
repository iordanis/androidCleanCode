package com.iordanis.example.apichanges;

import static com.iordanis.example.module.PreferencesSaverModule.preferencesSaver;
import static com.iordanis.example.module.SharedPreferencesEditorModule.sharedPreferencesEditor;

import com.iordanis.example.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences.Editor;

public class MainActivityAfter extends Activity {
	private final PreferencesSaver preferencesSaver;
	private final Editor editor;

	// Constructor the system will call to instantiate this activity
	public MainActivityAfter() {
		this(sharedPreferencesEditor(), preferencesSaver());
	}

	// Constructor that can be used in production and test code
	public MainActivityAfter(Editor editor,
			PreferencesSaver preferencesSaver) {
		this.editor = editor;
		this.preferencesSaver = preferencesSaver;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public void onResume() {
		super.onResume();
		editor.putBoolean("has_launched_before", true);
		preferencesSaver.save(editor);
	}
}
