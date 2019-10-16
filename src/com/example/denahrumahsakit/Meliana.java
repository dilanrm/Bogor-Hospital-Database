package com.example.denahrumahsakit;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Meliana extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_meliana);
		
		Button web = (Button) findViewById(R.id.button2);
		Button lokasi = (Button) findViewById(R.id.bLogin);

		web.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri
						.parse("http://www.rsmelania.co.id/"));
				startActivity(i);
			}
		});

		lokasi.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(
						android.content.Intent.ACTION_VIEW,
						Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.6112528,106.7305925,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e69c5e967900001:0x95d1ddff20550d3c!2m2!1d106.8006331!2d-6.6112577"));
				startActivity(i);
			}
		});
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_register, menu);
		return true;
	}*/

}
