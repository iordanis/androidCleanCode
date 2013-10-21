package com.iordanis.example.acceptancetests;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import com.iordanis.example.R;
import com.jayway.android.robotium.solo.Condition;
import com.jayway.android.robotium.solo.Solo;

import android.support.v4.view.ViewPager;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;

public class ShazamTest extends ActivityInstrumentationTestCase2<ActivityUnderTest> {
	private static final int TIMEOUT = 5000;
	private Solo solo;

	public ShazamTest(Class<ActivityUnderTest> activityClass) {
		super(activityClass);
	}

	@Override
	protected void setUp() {
		solo = new Solo(getInstrumentation());
		// Configure a fake server to return a track...

	}

	public void testShazamingOnPhone() {
		// Action
        final View shazamButton = solo.getView(R.id.big_button);
		solo.clickOnView(shazamButton);

		// Assertions
		// Details have to be full screen
		assertThat(solo.getCurrentViews(ViewPager.class), empty());

		// Track details are showing on screen
		assertThat(solo.waitForCondition(titleShowsOnFullScreen(),
				TIMEOUT), is(true));
	}


	public void testShazamingOnTablet() {
		// Action
		final View shazamButton = solo.getView(R.id.small_button);
		solo.clickOnView(shazamButton);

		waitForAnimationToFinish();

		// Assertions
		// Details have to be on main screen
		assertThat(solo.getCurrentViews(ViewPager.class), not(empty()));

		// Track details are showing on side panel
		assertThat(solo.waitForCondition(titleShowsOnSidePanel(),
				TIMEOUT), is(true));
	}


	private Condition titleShowsOnSidePanel() {
		throw new UnsupportedOperationException();
	}

	private void waitForAnimationToFinish() {
		throw new UnsupportedOperationException();
	}
	private Condition titleShowsOnFullScreen() {
		throw new UnsupportedOperationException();
	}

}
