package com.iordanis.example.acceptancetests.module;

import static com.iordanis.example.acceptancetests.module.DeviceDecider.isTablet;

import com.iordanis.example.acceptancetests.gwen.ShazamPhoneButtonAction;
import com.iordanis.example.acceptancetests.gwen.ShazamTabletButtonAction;
import com.jayway.android.robotium.solo.Solo;
import com.shazam.gwen.Action;

public class ShazamActionModule {

	public static Action<Solo, Void> shazamAction() {
		if (isTablet()) {
			return new ShazamTabletButtonAction();
		} else {
			return new ShazamPhoneButtonAction();
		}
	}
}
