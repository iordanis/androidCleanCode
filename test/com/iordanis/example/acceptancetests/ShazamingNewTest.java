package com.iordanis.example.acceptancetests;
import static com.shazam.gwen.Gwen.given;
import static com.shazam.gwen.Gwen.then;
import static com.shazam.gwen.Gwen.when;
import android.test.ActivityInstrumentationTestCase2;

import com.iordanis.example.acceptancetests.gwen.User;
import com.jayway.android.robotium.solo.Solo;

public class ShazamingNewTest extends ActivityInstrumentationTestCase2<ActivityUnderTest> {
	private Solo solo;
	private User user;
	private Server server;

	public ShazamingNewTest(Class<ActivityUnderTest> activityClass) {
		super(activityClass);
	}

	@Override
	protected void setUp() {
		solo = new Solo(getInstrumentation());
		user = new User(solo);
		server = new Server();
	}

	public void testShazamingShowsDetails() {
		given(server).returnsKnownTrack();

		when(user).shazams();

		then(user).seesDetailsForTrack();
	}
}
