package com.example.denahrumahsakit;

import java.util.HashMap;
import java.util.Map;

import com.android.volley.Response;
import com.android.volley.Request.Method;
import com.android.volley.toolbox.StringRequest;

public class UpdateRequest extends StringRequest {
	private static final String UPDATE_REQUEST_URL="http://kuunibyou.esy.es/projek/Update.php";
	private Map<String, String> params;
	
	public UpdateRequest(String username, int age, String password, String name, Response.Listener<String> listener) {
		super(Method.POST, UPDATE_REQUEST_URL, listener, null);
		params = new HashMap<String, String>();
		params.put("username", username);
		params.put("age", age + "");
		params.put("password", password);
		params.put("name", name);

	}
	
	@Override
	protected Map<String, String> getParams() {
		// TODO Auto-generated method stub
		return params;
	}
}
