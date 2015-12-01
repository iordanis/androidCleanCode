package com.iordanis.example;

import android.app.Application;

public class DependencyInjectedApplication extends Application {
	private static DependencyInjectedApplication application;

	@Override
	public void onCreate() {
		application = this;
	}

	public static DependencyInjectedApplication getApplication() {
		return application;
	}
}
