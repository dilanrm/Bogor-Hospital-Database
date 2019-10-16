package com.example.denahrumahsakit;

import java.util.HashMap;
import java.util.Map;

import android.R.string;

import com.android.volley.Response;
import com.android.volley.Request.Method;
import com.android.volley.toolbox.StringRequest;

public class DeleteRequest extends StringRequest {
	private static final String DELETE_REQUEST_URL="http://kuunibyou.esy.es/projek/Delete.php";
	private Map<String, String> params;
	
	public DeleteRequest(String name, Response.Listener<String> listener) {
		super(Method.POST, DELETE_REQUEST_URL, listener, null);
		params = new HashMap<String, String>();
		params.put("name", name);

	}
	
	@Override
	protected Map<String, String> getParams() {
		// TODO Auto-generated method stub
		return params;
	}
}
