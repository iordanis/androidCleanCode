package com.iordanis.example.module;

import static com.iordanis.example.DependencyInjectedApplication.getApplication;
import android.content.res.Resources;

import com.iordanis.example.DeviceClassDecider;

public class DeviceClassDeciderModule {

	public static DeviceClassDecider deviceClassDecider() {
		Resources resources = getApplication().getResources();
		return new DeviceClassDecider(resources);
	}

}
