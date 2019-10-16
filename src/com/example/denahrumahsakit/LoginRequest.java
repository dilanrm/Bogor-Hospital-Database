package com.example.denahrumahsakit;

import java.util.HashMap;
import java.util.Map;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.Request.Method;
import com.android.volley.toolbox.StringRequest;

public class LoginRequest extends StringRequest{
	private static final String LOGIN_REQUEST_URL="http://kuunibyou.esy.es/projek/Login.php";
	private Map<String, String> params;
	
	public LoginRequest(String username, String password, Response.Listener<String> listener) {
		super(Method.POST, LOGIN_REQUEST_URL, listener, null);
		params = new HashMap<String, String>();
		params.put("username", username);
		params.put("password", password);
	}
	
	@Override
	protected Map<String, String> getParams(){
		// TODO Auto-generated method stub
		return params;
	}
}
