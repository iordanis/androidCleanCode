package com.iordanis.example.gwen;
import static com.iordanis.example.module.DeviceDecider.isTablet;

import com.jayway.android.robotium.solo.Solo;
import com.shazam.gwen.Action;
import com.shazam.gwen.Actor;
import com.shazam.gwen.Asserter;
import com.shazam.gwen.Assertion;

public class User implements Actor, Asserter {
	private final Solo solo;

	public User(Solo solo) {
		this.solo = solo;
	}

	public void shazams() {
		Action<Solo, Void> action;
		if (isTablet()) {
			action = new ShazamTabletButtonAction();
		} else {
			action = new ShazamPhoneButtonAction();
		}
		action.actOn(solo);
	}

	public void seesDetailsForTrack() {
		Assertion<Solo> assertion;
		if (isTablet()) {
			assertion = new TabletDetailsAssertion();
		} else {
			assertion = new PhoneDetailsAssertion();
		}
		assertion.assertWith(solo);
	}
}
