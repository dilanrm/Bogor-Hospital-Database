package com.example.denahrumahsakit;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.os.Handler;
import android.content.Intent;
import android.content.SharedPreferences;


public class SpashScreenActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_spash_screen);
		
		 new Handler().postDelayed(new Runnable() {
				
				@Override
				public void run() {
					//SharedPreferences sharedPreferences = getSharedPreferences("sp", MODE_PRIVATE);
					Intent intent;
					//if(sharedPreferences.getBoolean("status", false)){
						intent = new Intent(SpashScreenActivity.this, MainActivity.class);
				        
//					} else{
//						intent = new Intent(SpashScreenActivity.this, LoginActivity.class);
//					}
			        startActivity(intent);
			        
			        finish();
				}
			}, 2000);
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_register, menu);
		return true;
	}*/

}
