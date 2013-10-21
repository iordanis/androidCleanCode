package com.iordanis.example.acceptancetests;
import static com.shazam.gwen.Gwen.then;
import static com.shazam.gwen.Gwen.when;
import android.test.ActivityInstrumentationTestCase2;

import com.iordanis.example.gwen.User;
import com.jayway.android.robotium.solo.Solo;

public class ShazamTestAfter extends ActivityInstrumentationTestCase2<ActivityUnderTest> {
	private Solo solo;
	private User user;

	public ShazamTestAfter(Class<ActivityUnderTest> activityClass) {
		super(activityClass);
	}

	@Override
	protected void setUp() {
		solo = new Solo(getInstrumentation());
		user = new User(solo);
		// Configure a local server to return a known track...
	}

	public void testShazamingShowsDetails() {
		when(user).shazams();

		then(user).seesDetailsForTrack();
	}
}
