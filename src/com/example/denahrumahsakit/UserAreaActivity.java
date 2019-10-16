package com.example.denahrumahsakit;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class UserAreaActivity extends Activity {

	String name = null;
	int age = 0, userid=0;
	String password = null;
	String username = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_area);
		
		final EditText etusername = (EditText) findViewById(R.id.edxUsername);
		final EditText etage = (EditText) findViewById(R.id.edAge);
		final TextView welcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg);
		final EditText edxpassword = (EditText) findViewById(R.id.edxPassword);
		//final EditText nama = (EditText) findViewById(R.id.editText1);
		
		Intent i = getIntent();
		name = i.getStringExtra("name");
		username = i.getStringExtra("username");
		password = i.getStringExtra("password");
		age = i.getIntExtra("age", -1);
		userid = i.getIntExtra("user_id", -1);
		
		String message = null;
		if(name != null ){
			message = "Welcome " + name;
		}else{
			message = "Welcome Guest";
		}
		welcomeMsg.setText(message);
		if(username!=null){
			etusername.setText(username);
		}else{
			etusername.setText("anonymous");
		}
		etage.setText(age + "");
		edxpassword.setText(password);
		//nama.setText(name);
		
		TextView lanjut = (TextView) findViewById(R.id.textView1);
		lanjut.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(UserAreaActivity.this, MainActivity.class);
				//i.putExtra("user_id", userid);
				i.putExtra("name", name);
				i.putExtra("username", username);
				i.putExtra("age", age);
				i.putExtra("password", password);
				startActivity(i);
				finish();
			}
		});
		
		/*Button upda = (Button) findViewById(R.id.upda);
		upda.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				//final String named = name;
                //final String usernamed = username;
                //final int aged = age;
                //final String passwordd = password;
				
				Response.Listener<String> responseListener = new Response.Listener<String>() {

					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse.getBoolean("success");
							
							if(success){
								AlertDialog.Builder builder = new AlertDialog.Builder(UserAreaActivity.this);
								builder.setMessage("Update Success").setNegativeButton("OK", null)
								.create().show();
								
							}else{
								AlertDialog.Builder builder = new AlertDialog.Builder(UserAreaActivity.this);
								builder.setMessage("Update Failed").setNegativeButton("Retry", null)
								.create().show();
							}
							
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
				
				UpdateRequest updateRequest = new UpdateRequest(username, age, password, name, responseListener);
				RequestQueue queue = Volley.newRequestQueue(UserAreaActivity.this);
				queue.add(updateRequest);
			
			}
		});*/
		
		Button del = (Button) findViewById(R.id.del);
		del.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
                //final String nama = name;
				
				Response.Listener<String> responseListener = new Response.Listener<String>() {

					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse.getBoolean("success");
							//Toast.makeText(getApplicationContext(), name, Toast.LENGTH_LONG).show();
							
							if(success){
								Toast.makeText(getApplicationContext(), "Delete Success", Toast.LENGTH_LONG).show();
								Intent i = new Intent(UserAreaActivity.this, LoginActivity.class);
								startActivity(i);
								
							}else{
								AlertDialog.Builder builder = new AlertDialog.Builder(UserAreaActivity.this);
								builder.setMessage("Delete Progressed").setNegativeButton("OK", null)
								.create().show();
								Intent i = new Intent(UserAreaActivity.this, LoginActivity.class);
								startActivity(i);
							}
							
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};
				
				DeleteRequest deleteRequest = new DeleteRequest(name, responseListener);
				RequestQueue queue = Volley.newRequestQueue(UserAreaActivity.this);
				queue.add(deleteRequest);
			
			
				
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
