package com.iordanis.example.capabilities;

import android.content.pm.PackageManager;

public class GooglePlayAvailability {
	private final PackageManager packageManager;

	public GooglePlayAvailability(PackageManager packageManager) {
		this.packageManager = packageManager;
	}

	public boolean googlePlayIsAvailable() {
		try {
			packageManager.getApplicationInfo("com.android.vending", 0);
			return true;
		} catch (PackageManager.NameNotFoundException e) {
			return false;
		}
	}

}
