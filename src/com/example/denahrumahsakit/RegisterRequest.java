package com.example.denahrumahsakit;

import java.util.HashMap;
import java.util.Map;

import android.R.string;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.StringRequest;

public class RegisterRequest extends StringRequest {
	private static final String REGISTER_REQUEST_URL="http://kuunibyou.esy.es/projek/Register.php";
	private Map<String, String> params;
	
	public RegisterRequest(String name, String username, int age, String password, Response.Listener<String> listener) {
		super(Method.POST, REGISTER_REQUEST_URL, listener, null);
		params = new HashMap<String, String>();
		params.put("name", name);
		params.put("username", username);
		params.put("age", age + "");
		params.put("password", password);

	}
	
	@Override
	protected Map<String, String> getParams() {
		// TODO Auto-generated method stub
		return params;
	}
}
