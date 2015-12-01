package com.iordanis.example.acceptancetests.gwen;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import android.support.v4.view.ViewPager;

import com.jayway.android.robotium.solo.Condition;
import com.jayway.android.robotium.solo.Solo;
import com.shazam.gwen.Assertion;

public class PhoneDetailsAssertion implements Assertion<Solo>{

	@Override
	public void assertWith(Solo solo) {
		assertThat(solo.getCurrentViews(ViewPager.class), empty());
		assertThat(solo.waitForCondition(titleAndArtistShowOnScreen(), 5000), is(true));
	}

	private Condition titleAndArtistShowOnScreen() {
		// Provide conditions that tell if the title is on screen
		throw new UnsupportedOperationException();
	}

}
