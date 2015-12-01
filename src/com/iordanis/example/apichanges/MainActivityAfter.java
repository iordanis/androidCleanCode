package com.iordanis.example.apichanges;

import static com.iordanis.example.module.EditorModule.editor;

import com.iordanis.example.R;

import android.os.Bundle;
import android.app.Activity;

public class MainActivityAfter extends Activity {
	private final Editor editor;

	// Constructor the system will call to instantiate this activity
	public MainActivityAfter() {
		this(editor());
	}

	// Constructor that can be used in production and test code
	public MainActivityAfter(Editor editor) {
		this.editor = editor;
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
		editor.save();
	}
}
