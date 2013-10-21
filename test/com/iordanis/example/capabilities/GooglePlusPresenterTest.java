package com.iordanis.example.capabilities;
import org.jmock.Expectations;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import com.iordanis.example.capabilities.GooglePlayAvailability;
import com.iordanis.example.capabilities.GooglePlusPresenter;
import com.iordanis.example.capabilities.GooglePlusView;


public class GooglePlusPresenterTest {
	@Rule public JUnitRuleMockery mockery = new JUnitRuleMockery();

	@Mock GooglePlayAvailability googlePlayAvailability;
	@Mock GooglePlusView googlePlusView;
	private GooglePlusPresenter presenter;

	@Before
	private void setup() {
		presenter = new GooglePlusPresenter(googlePlayAvailability);
		presenter.setView(googlePlusView);
	}

	@Test
	public void hidesGooglePlusIfNotAvailable() {
		mockery.checking(new Expectations() {{
			allowing(googlePlayAvailability).googlePlayIsAvailable();
				will(returnValue(false));
			oneOf(googlePlusView).hideGooglePlus();
		}});

		presenter.present();
	}

	@Test
	public void showsGooglePlusIfAvailable() {
		mockery.checking(new Expectations() {{
			allowing(googlePlayAvailability).googlePlayIsAvailable();
				will(returnValue(true));
			oneOf(googlePlusView).showGooglePlus();
		}});

		presenter.present();
	}
}
