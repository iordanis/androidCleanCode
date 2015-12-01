package com.iordanis.example.capabilities;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;
import static com.iordanis.example.module.GooglePlayAvailabilityModule.googlePlayAvailability;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.iordanis.example.R;

public class MainActivityAfter extends Activity implements GooglePlusView {
	private final GooglePlayAvailability googlePlayAvailability;

	private View googlePlus;
	private GooglePlusPresenter googlePlusPresenter;

	public MainActivityAfter() {
		googlePlayAvailability = googlePlayAvailability();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		googlePlus = findViewById(R.id.google_plus);
		googlePlusPresenter = new GooglePlusPresenter(this, googlePlayAvailability);
	}

	@Override
	protected void onResume() {
		googlePlusPresenter.present();
	}

	@Override
	protected void onPause() {
		googlePlusPresenter.stopPresenting();
	}

	@Override
	public void showGooglePlus() {
		googlePlus.setVisibility(VISIBLE);
	}

	@Override
	public void hideGooglePlus() {
		googlePlus.setVisibility(GONE);
	}
}
