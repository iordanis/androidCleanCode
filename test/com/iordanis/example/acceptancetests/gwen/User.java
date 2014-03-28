package com.iordanis.example.acceptancetests.gwen;
import static com.iordanis.example.acceptancetests.module.ShazamActionModule.shazamAction;
import static com.iordanis.example.acceptancetests.module.TrackAssertionsModule.trackDetailsAssertion;

import com.jayway.android.robotium.solo.Solo;
import com.shazam.gwen.Actor;
import com.shazam.gwen.Asserter;

public class User implements Actor, Asserter {
	private final Solo solo;

	public User(Solo solo) {
		this.solo = solo;
	}

	public void shazams() {
		shazamAction().actOn(solo);
	}

	public void seesDetailsForTrack() {
		trackDetailsAssertion().assertWith(solo);
	}
}
