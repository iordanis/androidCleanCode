package com.iordanis.example.module;

import static com.iordanis.example.MyCoolApplication.getApplication;
import android.content.pm.PackageManager;

import com.iordanis.example.capabilities.GooglePlayAvailability;

public class GooglePlayAvailabilityModule {

	public static GooglePlayAvailability googlePlayAvailability() {
		PackageManager packageManager = getApplication().getPackageManager();
		return new GooglePlayAvailability(packageManager);
	}
}
