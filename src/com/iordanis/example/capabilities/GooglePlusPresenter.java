package com.iordanis.example.capabilities;

public class GooglePlusPresenter {
	private final GooglePlusView googlePlusView;
	private final GooglePlayAvailability googlePlayAvailability;

	public GooglePlusPresenter(GooglePlusView googlePlusView, GooglePlayAvailability googlePlayAvailability) {
		this.googlePlusView = googlePlusView;
		this.googlePlayAvailability = googlePlayAvailability;
	}

	public void present() {
		if (googlePlayAvailability.googlePlayIsAvailable()) {
			googlePlusView.showGooglePlus();
		} else {
			googlePlusView.hideGooglePlus();
		}
	}

	public void stopPresenting() {
		// Do any view cleanup, release potentially open resources on the view.
	}

}
