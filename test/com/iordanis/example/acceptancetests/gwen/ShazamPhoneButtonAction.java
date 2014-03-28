package com.iordanis.example.acceptancetests.gwen;

import android.view.View;

import com.iordanis.example.R;
import com.jayway.android.robotium.solo.Solo;
import com.shazam.gwen.Action;

public class ShazamPhoneButtonAction implements Action<Solo, Void> {

	@Override
	public Void actOn(Solo solo) {
        final View shazamButton = solo.getView(R.id.big_button);
		solo.clickOnView(shazamButton);
		return null;
	}
}
