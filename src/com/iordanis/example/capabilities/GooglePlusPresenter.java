package com.iordanis.example.capabilities;

public class GooglePlusPresenter {
	private final GooglePlayAvailability googlePlayAvailability;
	private GooglePlusView googlePlusView;

	public GooglePlusPresenter(GooglePlayAvailability googlePlayAvailability) {
		this.googlePlayAvailability = googlePlayAvailability;
	}

	public void setView(GooglePlusView googlePlusView) {
		this.googlePlusView = googlePlusView;
	}

	public void present() {
		if (googlePlayAvailability.googlePlayIsAvailable()) {
			googlePlusView.showGooglePlus();
		} else {
			googlePlusView.hideGooglePlus();
		}
	}

}
