package com.example.denahrumahsakit;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Salak extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_salak);
		
		Button web = (Button) findViewById(R.id.button2);
		Button lokasi = (Button) findViewById(R.id.button1);

		web.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri
						.parse("http://rssalakbogor.com/"));
				startActivity(i);
			}
		});

		lokasi.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(
						android.content.Intent.ACTION_VIEW,
						Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.5913632,106.7275197,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e69c422586888a1:0xa507f2fabe97ec47!2m2!1d106.7975603!2d-6.5913681"));
				startActivity(intent);
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