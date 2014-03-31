package com.iordanis.example.acceptancetests.gwen;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import android.support.v4.view.ViewPager;

import com.jayway.android.robotium.solo.Condition;
import com.jayway.android.robotium.solo.Solo;
import com.shazam.gwen.Assertion;

public class TabletDetailsAssertion implements Assertion<Solo> {

	@Override
	public void assertWith(Solo solo) {
		waitForAnimationToFinish();
		assertThat(solo.getCurrentViews(ViewPager.class), not(empty()));
		assertThat(solo.waitForCondition(titleAndArtistShowOnSidePanel(), 5000), is(true));
	}


	private void waitForAnimationToFinish() {
	}

	private Condition titleAndArtistShowOnSidePanel() {
		return null;
	}
}
