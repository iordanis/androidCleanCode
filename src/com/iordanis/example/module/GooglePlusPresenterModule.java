package com.iordanis.example.module;

import static com.iordanis.example.module.GooglePlayAvailabilityModule.googlePlayAvailability;

import com.iordanis.example.capabilities.GooglePlusPresenter;

public class GooglePlusPresenterModule {

	public static GooglePlusPresenter googlePlusPresenter() {
		return new GooglePlusPresenter(googlePlayAvailability());
	}

}
