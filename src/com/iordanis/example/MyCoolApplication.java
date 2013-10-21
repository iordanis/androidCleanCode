package com.iordanis.example;

import android.app.Application;

public class MyCoolApplication extends Application {
	private static MyCoolApplication application;

	@Override
	public void onCreate() {
		application = this;
	}

	public static MyCoolApplication getApplication() {
		return application;
	}
}
