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

public class Lokasi extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lokasi);
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
							String lok = jsonResponse.getString("lokasi");
							Intent link = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir/Current+Location/@-6.4071908,106.770648,11z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x2e69c5e74eb6588f:0x86b125a2a42c4dd2!2m2!1d106.8110514!2d-6.6079995"));
							startActivity(link);
							Toast.makeText(getApplicationContext(),
									jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Lokasi.this);
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
							Intent link = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.4748873,106.7594899,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e69c21e2bf3e0d7:0x924d4024df26985d!2m2!1d106.8295305!2d-6.4748921"));
							startActivity(link);
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
				RequestQueue queue = Volley.newRequestQueue(Lokasi.this);
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
							Intent link = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.4730307,106.7939275,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e69c1cd6b1840c3:0x46fc0015d1f9742!2m2!1d106.8639681!2d-6.4730355"));
							startActivity(link);
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
				RequestQueue queue = Volley.newRequestQueue(Lokasi.this);
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
							Intent link = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.3755634,106.9006368,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e699387f03fef6d:0xc8553ddc5222c022!2m2!1d106.9706774!2d-6.3755681"));
							startActivity(link);
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
				RequestQueue queue = Volley.newRequestQueue(Lokasi.this);
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
							Intent link = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.5755376,106.7374043,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e69c4251868c47f:0x35e7b54d54c3b93e!2m2!1d106.8074449!2d-6.5755425"));
							startActivity(link);
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
				RequestQueue queue = Volley.newRequestQueue(Lokasi.this);
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
							Intent link = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.5913632,106.7275197,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e69c422586888a1:0xa507f2fabe97ec47!2m2!1d106.7975603!2d-6.5913681"));
							startActivity(link);
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
				RequestQueue queue = Volley.newRequestQueue(Lokasi.this);
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
							Intent link = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.5814556,106.7388453,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e69c42fcaa22031:0x9e374b4cc81d17eb!2m2!1d106.8088859!2d-6.5814605"));
							startActivity(link);
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
				RequestQueue queue = Volley.newRequestQueue(Lokasi.this);
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
							Intent link = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.5706468,106.6695457,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e69c451172ec01b:0xbc365b0c875c45df!2m2!1d106.7395863!2d-6.5706517"));
							startActivity(link);
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
				RequestQueue queue = Volley.newRequestQueue(Lokasi.this);
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
							Intent link = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.5806139,106.7078276,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e69c452261f0e47:0xe69e3c7f455ab603!2m2!1d106.7778682!2d-6.5806188"));
							startActivity(link);
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
				RequestQueue queue = Volley.newRequestQueue(Lokasi.this);
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
							Intent link = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.5589481,106.7220698,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e69ed3f8c27501f:0x8bbf44124197da74!2m2!1d106.7921104!2d-6.558953"));
							startActivity(link);
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
				RequestQueue queue = Volley.newRequestQueue(Lokasi.this);
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
							Intent link = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.6603191,106.7833153,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e69c8e4c5436d4f:0x6f919a15065c020f!2m2!1d106.8533559!2d-6.660324"));
							startActivity(link);
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
				RequestQueue queue = Volley.newRequestQueue(Lokasi.this);
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
							Intent link = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://www.google.co.id/maps/dir/Current+Location/@-6.6112528,106.7305925,12z/data=!3m1!4b1!4m8!4m7!1m0!1m5!1m1!1s0x2e69c5e967900001:0x95d1ddff20550d3c!2m2!1d106.8006331!2d-6.6112577"));
							startActivity(link);
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("lokasi"),
									Toast.LENGTH_LONG).show();
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Lokasi.this);
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
				Intent i = new Intent(Lokasi.this, Listrs.class);
				startActivity(i);
				finish();
			}
		});
		
		
	blokasi.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Toast.makeText(getApplicationContext(), "Anda sudah di halaman lokasi", Toast.LENGTH_LONG).show();
		}
	});
		
	bwebs.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent in = new Intent(Lokasi.this, Website.class);
			startActivity(in);
			finish();
		}
	});
	bkontak.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {                                                               
			 Intent intent = new Intent(Lokasi.this, Kontak.class);
			startActivity(intent);
			finish();
		}
	});
		
	}

	
	  @Override 
	  public boolean onCreateOptionsMenu(Menu menu) { 
		  // Inflate the menu; this adds items to the action bar if it is present.
	  getMenuInflater().inflate(R.menu.lokasi, menu); 
	  return true; 
	  }
	  
	  public boolean onOptionItemSelected(MenuItem item) {
			switch (item.getItemId()) {
			case R.id.item1:
				Intent i = new Intent(Lokasi.this, Listrs.class);
				startActivity(i);
				return true;
				
			case R.id.item2: //web
				 i = new Intent(Lokasi.this, Website.class);
				startActivity(i);
				return true;
			case R.id.item3: //lokasi
				Toast.makeText(getApplicationContext(), "Anda sudah di halaman lokasi", Toast.LENGTH_LONG).show();
				return true;
			case R.id.item4: //kontak
				 i = new Intent(Lokasi.this, Kontak.class);
				startActivity(i);
			default:
				break;
			}
			return false;
		}

}
