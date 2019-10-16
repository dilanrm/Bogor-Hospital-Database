package com.example.denahrumahsakit;

import org.json.JSONException;
import org.json.JSONObject;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		final EditText etAge= (EditText) findViewById(R.id.Age);
		final EditText etName= (EditText) findViewById(R.id.etName);
		final EditText etUsername= (EditText) findViewById(R.id.etUsername);
		final EditText etPassword= (EditText) findViewById(R.id.etPassword);
		final Button bRegister = (Button) findViewById(R.id.bRegister);
		
		bRegister.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				final String name = etName.getText().toString();
                final String username = etUsername.getText().toString();
                int age = 0;
                age = Integer.parseInt(etAge.getText().toString());
                final String password = etPassword.getText().toString();
				
				Response.Listener<String> responseListener = new Response.Listener<String>() {

					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse.getBoolean("success");
							
							if(success){
								Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
								startActivity(i);
								finish();
								
							}else{
								AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
								builder.setMessage("Register Failed").setNegativeButton("Retry", null)
								.create().show();
							}
							
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
				
				RegisterRequest registerRequest = new RegisterRequest(name, username, age, password, responseListener);
				RequestQueue queue = Volley.newRequestQueue(RegisterActivity.this);
				queue.add(registerRequest);
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
