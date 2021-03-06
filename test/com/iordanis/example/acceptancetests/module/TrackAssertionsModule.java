package com.iordanis.example.acceptancetests.module;

import static com.iordanis.example.module.DeviceClassDeciderModule.deviceClassDecider;

import com.iordanis.example.acceptancetests.gwen.PhoneDetailsAssertion;
import com.iordanis.example.acceptancetests.gwen.TabletDetailsAssertion;
import com.jayway.android.robotium.solo.Solo;
import com.shazam.gwen.Assertion;

public class TrackAssertionsModule {

	public static Assertion<Solo> trackDetailsAssertion() {
		if (deviceClassDecider().isLargeTablet()) {
			return new TabletDetailsAssertion();
		} else {
			return new PhoneDetailsAssertion();
		}
	}
}
