package com.example.denahrumahsakit;

import org.json.JSONException;
import org.json.JSONObject;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Kontak extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kontak);
		Button bmc = (Button) findViewById(R.id.bLogin);
		Button cib = (Button) findViewById(R.id.button2);
		Button husa = (Button) findViewById(R.id.button3);
		Button thamrin = (Button) findViewById(R.id.button41);
		Button paja = (Button) findViewById(R.id.button5);
		Button salak = (Button) findViewById(R.id.button6);
		Button azra = (Button) findViewById(R.id.button7);
		Button pra = (Button) findViewById(R.id.button8);
		Button bogor = (Button) findViewById(R.id.button9);
		Button islam = (Button) findViewById(R.id.button10);
		Button ciawi = (Button) findViewById(R.id.button11);
		Button meli = (Button) findViewById(R.id.button12);

		bmc.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				final String id = "1";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + jsonResponse.getString("telp")));
							startActivity(intent);
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Kontak.this);
				queue.add(dataRequest);
			}
		});

		cib.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				final String id = "10";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + jsonResponse.getString("telp")));
							startActivity(intent);
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Kontak.this);
				queue.add(dataRequest);
			}
		});

		husa.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				final String id = "11";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + jsonResponse.getString("telp")));
							startActivity(intent);
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Kontak.this);
				queue.add(dataRequest);
			}
		});

		thamrin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				final String id = "12";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + jsonResponse.getString("telp")));
							startActivity(intent);
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Kontak.this);
				queue.add(dataRequest);
			}
		});

		paja.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				final String id = "14";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + jsonResponse.getString("telp")));
							startActivity(intent);
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Kontak.this);
				queue.add(dataRequest);
			}
		});

		salak.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				final String id = "2";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + jsonResponse.getString("telp")));
							startActivity(intent);
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Kontak.this);
				queue.add(dataRequest);
			}
		});

		azra.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				final String id = "3";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + jsonResponse.getString("telp")));
							startActivity(intent);
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Kontak.this);
				queue.add(dataRequest);
			}
		});

		pra.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				final String id = "4";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + jsonResponse.getString("telp")));
							startActivity(intent);
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Kontak.this);
				queue.add(dataRequest);
			}
		});

		bogor.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				final String id = "5";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + jsonResponse.getString("telp")));
							startActivity(intent);
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Kontak.this);
				queue.add(dataRequest);
			}
		});

		islam.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				final String id = "6";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + jsonResponse.getString("telp")));
							startActivity(intent);
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Kontak.this);
				queue.add(dataRequest);
			}
		});

		ciawi.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				final String id = "7";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + jsonResponse.getString("telp")));
							startActivity(intent);
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Kontak.this);
				queue.add(dataRequest);
			}
		});

		meli.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				final String id = "9";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + jsonResponse.getString("telp")));
							startActivity(intent);
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Kontak.this);
				queue.add(dataRequest);
			}
		});

		Button binfo = (Button) findViewById(R.id.binfo);
		Button blokasi = (Button) findViewById(R.id.blokasi);
		Button bwebs = (Button) findViewById(R.id.bwebs);
		Button bkontak = (Button) findViewById(R.id.bkontak);
		
		binfo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(Kontak.this, Listrs.class);
				startActivity(i);finish();
				
			}
		});
		
		
	blokasi.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent in = new Intent(Kontak.this, Lokasi.class);
			startActivity(in);finish();
		}
	});
		
	bwebs.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent in = new Intent(Kontak.this, Website.class);
			startActivity(in);finish();
		}
	});
	bkontak.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {                                
			 Toast.makeText(getApplicationContext(), "Anda sudah di halaman kontak", Toast.LENGTH_LONG).show();
		}
	});
	
	}

	
	  @Override 
	  public boolean onCreateOptionsMenu(Menu menu) { 
		  // Inflate the menu; this adds items to the action bar if it is present.
	  getMenuInflater().inflate(R.menu.kontak, menu); 
	  return true; 
	  }
	  
	  public boolean onOptionItemSelected(MenuItem item) {
			switch (item.getItemId()) {
			case R.id.item1:
				Intent i = new Intent(Kontak.this, Listrs.class);
				startActivity(i);
				return true;
				
			case R.id.item2: //web
				 i = new Intent(Kontak.this, Website.class);
				startActivity(i);
				return true;
			case R.id.item3: //lokasi
				i = new Intent(Kontak.this, Lokasi.class);
				startActivity(i);
				return true;
			case R.id.item4: //kontak
				Toast.makeText(getApplicationContext(), "Anda sudah di halaman kontak", Toast.LENGTH_LONG).show();
			default:
				break;
			}
			return false;
		}

}
