package com.iordanis.example.capabilities;
import org.jmock.Expectations;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;


public class GooglePlusPresenterTest {
	@Rule public JUnitRuleMockery mockery = new JUnitRuleMockery();
	@Mock private GooglePlusView googlePlusView;

	@Test
	public void hidesGooglePlusIfNotAvailable() {
		mockery.checking(new Expectations() {{
			oneOf(googlePlusView).hideGooglePlus();
		}});

		presenterWithPlayInstalled(false).present();
	}

	@Test
	public void showsGooglePlusIfAvailable() {
		mockery.checking(new Expectations() {{
			oneOf(googlePlusView).showGooglePlus();
		}});

		presenterWithPlayInstalled(true).present();
	}

	private GooglePlusPresenter presenterWithPlayInstalled(final boolean installed) {
		return new GooglePlusPresenter(googlePlusView, new GooglePlayAvailability() {
			@Override
			public boolean googlePlayIsAvailable() {
				return installed;
			}
		});
	}

}
