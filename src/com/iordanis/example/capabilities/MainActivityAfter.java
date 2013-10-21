package com.iordanis.example.capabilities;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;
import static com.iordanis.example.module.GooglePlusPresenterModule.googlePlusPresenter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.iordanis.example.R;

public class MainActivityAfter extends Activity implements GooglePlusView {
	private final GooglePlusPresenter googlePlusPresenter;
	private View googlePlus;

	public MainActivityAfter() {
		this(googlePlusPresenter());
	}

	public MainActivityAfter(GooglePlusPresenter googlePlusPresenter) {
		this.googlePlusPresenter = googlePlusPresenter;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		googlePlus = findViewById(R.id.google_plus);
		googlePlusPresenter.setView(this);

		googlePlusPresenter.present();
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
