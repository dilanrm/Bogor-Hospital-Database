package com.example.denahrumahsakit;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Ciawi extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ciawi);
		
		Button web = (Button) findViewById(R.id.button2);
		Button lokasi = (Button) findViewById(R.id.bLogin);

		web.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri
						.parse("http://rsudciawi.bogorkab.go.id/"));
				startActivity(i);
			}
		});

		lokasi.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(
						android.content.Intent.ACTION_VIEW,
						Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.6603191,106.7833153,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e69c8e4c5436d4f:0x6f919a15065c020f!2m2!1d106.8533559!2d-6.660324"));
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
