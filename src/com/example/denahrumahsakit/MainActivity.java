package com.example.denahrumahsakit;

import java.security.acl.LastOwnerException;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	SharedPreferences sharedPreferences;
	Editor editor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Intent in = getIntent();
		final String name = in.getStringExtra("name");
		final String username = in.getStringExtra("username");
		final String password = in.getStringExtra("password");
		final int age = in.getIntExtra("age", -1);
		final int userid = in.getIntExtra("user_id", -1);
		
		sharedPreferences = getSharedPreferences("sp", MODE_PRIVATE);
		String nama = sharedPreferences.getString("user", "");
		Button listrs = (Button) findViewById(R.id.dir);
		listrs.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent listrss = new Intent(MainActivity.this, Listrs.class);
				startActivity(listrss);
			}
		}) ;
		
		Button terdekat = (Button) findViewById(R.id.web);
		terdekat.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent deket = new Intent(MainActivity.this, Terdekat.class);
				startActivity(deket);
			}
		}) ;
		
		Button artikel = (Button) findViewById(R.id.button144);
		artikel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent artikels = new Intent(MainActivity.this, Artikel.class);
				startActivity(artikels);
			}
		}) ;
		
		Button keluar = (Button) findViewById(R.id.button41);
		keluar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				finish();
			}
		}) ;
		
		Button about = (Button) findViewById(R.id.button5);
		about.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent tentang = new Intent(MainActivity.this, About.class);
				startActivity(tentang);
			}
		}) ;
		
		/*Button userarea = (Button) findViewById(R.id.ganti);
		userarea.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(MainActivity.this, LoginActivity.class);
				startActivity(i);
			}
		});*/
		
		
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_register, menu);
		return true;
	}*/

}
