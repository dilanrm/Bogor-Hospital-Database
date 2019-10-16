package com.example.denahrumahsakit;

import org.json.JSONException;
import org.json.JSONObject;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class LoginActivity extends Activity {
	//String TAG = "LoginActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_register);

		final EditText etUsername = (EditText) findViewById(R.id.etxUsername);
		final EditText etPassword = (EditText) findViewById(R.id.etxPassword);
		final Button bLogin = (Button) findViewById(R.id.bLogin);
		final TextView registerLink = (TextView) findViewById(R.id.tvWelcomeMsg);
		final TextView lewat = (TextView) findViewById(R.id.textView1);

		registerLink.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent register = new Intent(LoginActivity.this,
						RegisterActivity.class);
				startActivity(register);
			}
		});

		lewat.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(LoginActivity.this,
						MainActivity.class);
				startActivity(i);
				finish();
			}
		});
		
		//Log.d(TAG, "Tes");
		bLogin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				final String username = etUsername.getText().toString();
				final String password = etPassword.getText().toString();

				Response.Listener<String> responseListener = new Response.Listener<String>() {

					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							
//							Toast.makeText(getApplicationContext(), "" + jsonResponse, Toast.LENGTH_LONG).show();

							if (success) {
								/*SharedPreferences.Editor editor = getSharedPreferences("sp", MODE_PRIVATE).edit();
								
								editor.putBoolean("status", true);
								editor.putString("username", etUsername.getText().toString());
								editor.putString("username", "");*/
								String name = jsonResponse.getString("name");
								int age = jsonResponse.getInt("age");
								//int userid = jsonResponse.getInt("user_id");
								Intent i = new Intent(LoginActivity.this,
										UserAreaActivity.class);
								//i.putExtra("user_id", userid);
								i.putExtra("name", name);
								i.putExtra("username", username);
								i.putExtra("age", age);
								i.putExtra("password", password);
								startActivity(i);
								finish();
							} else {
								AlertDialog.Builder builder = new AlertDialog.Builder(
										LoginActivity.this);
								builder.setMessage("Login Failed")
										.setNegativeButton("Retry", null)
										.create().show();
							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				LoginRequest loginRequest = new LoginRequest(username,
						password, responseListener);
				RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
				queue.add(loginRequest);
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
