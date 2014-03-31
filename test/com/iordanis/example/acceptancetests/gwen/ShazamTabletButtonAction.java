package com.iordanis.example.acceptancetests.gwen;
import android.view.View;

import com.iordanis.example.R;
import com.jayway.android.robotium.solo.Solo;
import com.shazam.gwen.Action;

public class ShazamTabletButtonAction implements Action<Solo, Void> {

	@Override
	public Void actOn(Solo solo) {
        View shazamButton = solo.getView(R.id.small_button);
		solo.clickOnView(shazamButton);
		return null;
	}
}
