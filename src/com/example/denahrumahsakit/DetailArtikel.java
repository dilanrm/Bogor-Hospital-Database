package com.example.denahrumahsakit;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class DetailArtikel extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail_artikel);
		
		Intent i = getIntent();
		String isi = i.getStringExtra("isi");
		TextView art = (TextView) findViewById(R.id.detilart);
		art.setText(isi);
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.detail_artikel, menu);
//		return true;
//	}

}
