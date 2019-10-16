package com.example.denahrumahsakit;

import java.util.HashMap;
import java.util.Map;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class ArtikelRequest extends StringRequest {
	private static final String ARTIKEL_REQUEST_URL="http://kuunibyou.esy.es/projek/Artikel.php";
	private Map<String, String> params;
	
	public ArtikelRequest(String id, Response.Listener<String> listener) {
		super(Method.POST, ARTIKEL_REQUEST_URL, listener, null);
		params = new HashMap<String, String>();
		params.put("id", id);

	}
	
	@Override
	protected Map<String, String> getParams() {
		// TODO Auto-generated method stub
		return params;
	}
}
