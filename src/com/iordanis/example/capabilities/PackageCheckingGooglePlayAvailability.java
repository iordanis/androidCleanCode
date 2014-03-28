package com.iordanis.example.capabilities;

import android.content.pm.PackageManager;

/**
 * Checks the existence of Play Services, using the package manager.
 */
public class PackageCheckingGooglePlayAvailability implements GooglePlayAvailability {
	private final PackageManager packageManager;

	public PackageCheckingGooglePlayAvailability(PackageManager packageManager) {
		this.packageManager = packageManager;
	}

	@Override
	public boolean googlePlayIsAvailable() {
		try {
			packageManager.getApplicationInfo("com.android.vending", 0);
			return true;
		} catch (PackageManager.NameNotFoundException e) {
			return false;
		}
	}

}
