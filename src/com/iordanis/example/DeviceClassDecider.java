package com.iordanis.example;

import android.content.res.Resources;

import com.iordanis.example.R;

public class DeviceClassDecider {

	private final Resources resources;

	public DeviceClassDecider(Resources resources) {
		this.resources = resources;
	}

	public boolean isLargeTablet() {
		return resources.getBoolean(R.bool.large_tablet);
	}

}
