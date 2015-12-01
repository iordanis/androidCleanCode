package com.iordanis.example.apichanges;

import org.jmock.Expectations;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.iordanis.example.apichanges.Editor;
import com.xtremelabs.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivityAfterTest {

	@Rule public JUnitRuleMockery mockery = new JUnitRuleMockery();
	@Mock private Editor editor;

	@Test
	public void canSaveLaunchFlag() {
		mockery.checking(new Expectations() {{
			oneOf(editor).putBoolean("has_launched_before", true);
			oneOf(editor).save();
		}});

		MainActivityAfter mainActivity = new MainActivityAfter(editor);
		mainActivity.onResume();
	}

}
