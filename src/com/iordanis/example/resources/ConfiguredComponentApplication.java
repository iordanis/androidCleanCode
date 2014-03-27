package com.iordanis.example.resources;

import static android.content.pm.PackageManager.COMPONENT_ENABLED_STATE_DISABLED;
import static android.content.pm.PackageManager.DONT_KILL_APP;

import com.iordanis.example.R;
import android.app.Application;
import android.content.ComponentName;

public class ConfiguredComponentApplication extends Application {

	@Override
	public void onCreate() {
		bootstrapComponents();
	}

	private void bootstrapComponents() {
		boolean isLargeTablet = getResources().getBoolean(R.bool.large_tablet);
		if (isLargeTablet) {
			switchOffComponent("com.iordanis.example.resources.PhoneActivity");
		} else {
			switchOffComponent("com.iordanis.example.resources.TabletActivity");
		}
	}

	private void switchOffComponent(String component) {
		ComponentName componentName = new ComponentName(getApplicationContext(), component);
		getPackageManager().setComponentEnabledSetting(componentName,
				COMPONENT_ENABLED_STATE_DISABLED, DONT_KILL_APP);
	}
}
