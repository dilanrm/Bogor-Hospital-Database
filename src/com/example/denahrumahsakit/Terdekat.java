package com.example.denahrumahsakit;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Terdekat extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_terdekat);
		
		Button terdekat = (Button) findViewById(R.id.dir);
		terdekat.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent deket = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/search/rumah+sakit+bogor"));
				startActivity(deket);
			}
		}) ;
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_register, menu);
		return true;
	}*/

}
