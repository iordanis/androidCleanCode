package com.iordanis.example.capabilities;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import com.iordanis.example.R;

public class MainActivityBefore extends Activity {
	private View googlePlus;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		googlePlus = findViewById(R.id.google_plus);
	}

	@Override
	protected void onResume() {
		try {
			getPackageManager().getApplicationInfo("com.android.vending", 0);
			googlePlus.setVisibility(VISIBLE);
		} catch (PackageManager.NameNotFoundException e) {
			googlePlus.setVisibility(GONE);
		}
	}
}
