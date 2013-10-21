package com.iordanis.example.apichanges;
import org.jmock.Expectations;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.content.SharedPreferences.Editor;

import com.iordanis.example.apichanges.MainActivityAfter;
import com.iordanis.example.apichanges.PreferencesSaver;
import com.xtremelabs.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MainActivity6cTest {

	@Rule public JUnitRuleMockery mockery = new JUnitRuleMockery();
	@Mock Editor editor;
	@Mock PreferencesSaver saver;

	@Test
	public void canSaveLaunchFlag() {
		mockery.checking(new Expectations() {{
			oneOf(editor).putBoolean("has_launched_before", true);
			oneOf(saver).save(editor);
		}});

		MainActivityAfter mainActivity6c = new MainActivityAfter(editor, saver);
		mainActivity6c.onResume();
	}

}
