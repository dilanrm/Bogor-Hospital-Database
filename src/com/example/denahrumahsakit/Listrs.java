package com.example.denahrumahsakit;

import java.io.StringReader;
import java.util.ArrayList;

import com.android.volley.Response;
import com.android.volley.Response.Listener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.android.volley.RequestQueue;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class Listrs extends Activity {
	/*
	 * String[] id; String[] nama; String[] telp; String[] alamat; String[] web;
	 * String[] lokasi;
	 * 
	 * ListView lv; Context context;
	 * 
	 * /*public static final String JSON_ARRAY = "result"; private JSONArray
	 * data = null; private String json; String url =
	 * "http://127.0.0.1:8080/userapi/connectdb.php";
	 */

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listrs);

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
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Listrs.this);
							builder.setMessage(jsonResponse.getString("nama") + "\n" + jsonResponse.getString("alamat"))
									.setNegativeButton("Tutup", null)
									.create().show();
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
//							if (success) {
//								String nama = jsonResponse.getString("nama");
//								String alamat = jsonResponse
//										.getString("alamat");
//								String telp = jsonResponse.getString("telp");
//								String web = jsonResponse.getString("web");
//								String lokasi = jsonResponse
//										.getString("lokasi");
//								
//								Intent i = new Intent(Listrs.this,
//										DetailActivity.class);
//								i.putExtra("nama", nama);
//								i.putExtra("alamat", alamat);
//								i.putExtra("telp", telp);
//								i.putExtra("web", web);
//								i.putExtra("lokasi", lokasi);
//								startActivity(i);
//								finish();
//							} else {
//								AlertDialog.Builder builder = new AlertDialog.Builder(
//										Listrs.this);
//								builder.setMessage("Failed")
//										.setNegativeButton("Retry", null)
//										.create().show();
//							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Listrs.this);
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
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Listrs.this);
							builder.setMessage(jsonResponse.getString("nama") + "\n" + jsonResponse.getString("alamat"))
							.setNegativeButton("Tutup", null)
							.create().show();
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
//							if (success) {
//
//								String nama = jsonResponse.getString("nama");
//								String alamat = jsonResponse
//										.getString("alamat");
//								String telp = jsonResponse.getString("telp");
//								String web = jsonResponse.getString("web");
//								String lokasi = jsonResponse
//										.getString("lokasi");
//								Intent i = new Intent(Listrs.this,
//										DetailActivity.class);
//								i.putExtra("nama", nama);
//								i.putExtra("alamat", alamat);
//								i.putExtra("telp", telp);
//								i.putExtra("web", web);
//								i.putExtra("lokasi", lokasi);
//								startActivity(i);
//								finish();
//							} else {
//								AlertDialog.Builder builder = new AlertDialog.Builder(
//										Listrs.this);
//								builder.setMessage("Failed")
//										.setNegativeButton("Retry", null)
//										.create().show();
//							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Listrs.this);
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
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Listrs.this);
							builder.setMessage(jsonResponse.getString("nama") + "\n" + jsonResponse.getString("alamat"))
							.setNegativeButton("Tutup", null)
							.create().show();
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
//							if (success) {
//								String nama = jsonResponse.getString("nama");
//								String alamat = jsonResponse
//										.getString("alamat");
//								String telp = jsonResponse.getString("telp");
//								String web = jsonResponse.getString("web");
//								String lokasi = jsonResponse
//										.getString("lokasi");
//								Intent i = new Intent(Listrs.this,
//										DetailActivity.class);
//								i.putExtra("nama", nama);
//								i.putExtra("alamat", alamat);
//								i.putExtra("telp", telp);
//								i.putExtra("web", web);
//								i.putExtra("lokasi", lokasi);
//								startActivity(i);
//								finish();
//							} else {
//								AlertDialog.Builder builder = new AlertDialog.Builder(
//										Listrs.this);
//								builder.setMessage("Failed")
//										.setNegativeButton("Retry", null)
//										.create().show();
//							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Listrs.this);
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
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Listrs.this);
							builder.setMessage(jsonResponse.getString("nama") + "\n" + jsonResponse.getString("alamat"))
							.setNegativeButton("Tutup", null)
							.create().show();
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
//							if (success) {
//								String nama = jsonResponse.getString("nama");
//								String alamat = jsonResponse
//										.getString("alamat");
//								String telp = jsonResponse.getString("telp");
//								String web = jsonResponse.getString("web");
//								String lokasi = jsonResponse
//										.getString("lokasi");
//								Intent i = new Intent(Listrs.this,
//										DetailActivity.class);
//								i.putExtra("nama", nama);
//								i.putExtra("alamat", alamat);
//								i.putExtra("telp", telp);
//								i.putExtra("web", web);
//								i.putExtra("lokasi", lokasi);
//								startActivity(i);
//								finish();
//							} else {
//								AlertDialog.Builder builder = new AlertDialog.Builder(
//										Listrs.this);
//								builder.setMessage("Failed")
//										.setNegativeButton("Retry", null)
//										.create().show();
//							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Listrs.this);
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
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Listrs.this);
							builder.setMessage(jsonResponse.getString("nama") + "\n" + jsonResponse.getString("alamat"))
							.setNegativeButton("Tutup", null)
							.create().show();
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
//							if (success) {
//								String nama = jsonResponse.getString("nama");
//								String alamat = jsonResponse
//										.getString("alamat");
//								String telp = jsonResponse.getString("telp");
//								String web = jsonResponse.getString("web");
//								String lokasi = jsonResponse
//										.getString("lokasi");
//								Intent i = new Intent(Listrs.this,
//										DetailActivity.class);
//								i.putExtra("nama", nama);
//								i.putExtra("alamat", alamat);
//								i.putExtra("telp", telp);
//								i.putExtra("web", web);
//								i.putExtra("lokasi", lokasi);
//								startActivity(i);
//								finish();
//							} else {
//								AlertDialog.Builder builder = new AlertDialog.Builder(
//										Listrs.this);
//								builder.setMessage("Failed")
//										.setNegativeButton("Retry", null)
//										.create().show();
//							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Listrs.this);
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
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Listrs.this);
							builder.setMessage(jsonResponse.getString("nama") + "\n" + jsonResponse.getString("alamat"))
							.setNegativeButton("Tutup", null)
							.create().show();
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
//							if (success) {
//								String nama = jsonResponse.getString("nama");
//								String alamat = jsonResponse
//										.getString("alamat");
//								String telp = jsonResponse.getString("telp");
//								String web = jsonResponse.getString("web");
//								String lokasi = jsonResponse
//										.getString("lokasi");
//								Intent i = new Intent(Listrs.this,
//										DetailActivity.class);
//								i.putExtra("nama", nama);
//								i.putExtra("alamat", alamat);
//								i.putExtra("telp", telp);
//								i.putExtra("web", web);
//								i.putExtra("lokasi", lokasi);
//								startActivity(i);
//								finish();
//							} else {
//								AlertDialog.Builder builder = new AlertDialog.Builder(
//										Listrs.this);
//								builder.setMessage("Failed")
//										.setNegativeButton("Retry", null)
//										.create().show();
//							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Listrs.this);
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
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Listrs.this);
							builder.setMessage(jsonResponse.getString("nama") + "\n" + jsonResponse.getString("alamat"))
							.setNegativeButton("Tutup", null)
							.create().show();
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
//							if (success) {
//								String nama = jsonResponse.getString("nama");
//								String alamat = jsonResponse
//										.getString("alamat");
//								String telp = jsonResponse.getString("telp");
//								String web = jsonResponse.getString("web");
//								String lokasi = jsonResponse
//										.getString("lokasi");
//								Intent i = new Intent(Listrs.this,
//										DetailActivity.class);
//								i.putExtra("nama", nama);
//								i.putExtra("alamat", alamat);
//								i.putExtra("telp", telp);
//								i.putExtra("web", web);
//								i.putExtra("lokasi", lokasi);
//								startActivity(i);
//								finish();
//							} else {
//								AlertDialog.Builder builder = new AlertDialog.Builder(
//										Listrs.this);
//								builder.setMessage("Failed")
//										.setNegativeButton("Retry", null)
//										.create().show();
//							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Listrs.this);
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
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Listrs.this);
							builder.setMessage(jsonResponse.getString("nama") + "\n" + jsonResponse.getString("alamat"))
							.setNegativeButton("Tutup", null)
							.create().show();
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
//							if (success) {
//								String nama = jsonResponse.getString("nama");
//								String alamat = jsonResponse
//										.getString("alamat");
//								String telp = jsonResponse.getString("telp");
//								String web = jsonResponse.getString("web");
//								String lokasi = jsonResponse
//										.getString("lokasi");
//								Intent i = new Intent(Listrs.this,
//										DetailActivity.class);
//								i.putExtra("nama", nama);
//								i.putExtra("alamat", alamat);
//								i.putExtra("telp", telp);
//								i.putExtra("web", web);
//								i.putExtra("lokasi", lokasi);
//								startActivity(i);
//								finish();
//							} else {
//								AlertDialog.Builder builder = new AlertDialog.Builder(
//										Listrs.this);
//								builder.setMessage("Failed")
//										.setNegativeButton("Retry", null)
//										.create().show();
//							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Listrs.this);
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
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Listrs.this);
							builder.setMessage(jsonResponse.getString("nama") + "\n" + jsonResponse.getString("alamat"))
							.setNegativeButton("Tutup", null)
							.create().show();
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
//							if (success) {
//								String nama = jsonResponse.getString("nama");
//								String alamat = jsonResponse
//										.getString("alamat");
//								String telp = jsonResponse.getString("telp");
//								String web = jsonResponse.getString("web");
//								String lokasi = jsonResponse
//										.getString("lokasi");
//								Intent i = new Intent(Listrs.this,
//										DetailActivity.class);
//								i.putExtra("nama", nama);
//								i.putExtra("alamat", alamat);
//								i.putExtra("telp", telp);
//								i.putExtra("web", web);
//								i.putExtra("lokasi", lokasi);
//								startActivity(i);
//								finish();
//							} else {
//								AlertDialog.Builder builder = new AlertDialog.Builder(
//										Listrs.this);
//								builder.setMessage("Failed")
//										.setNegativeButton("Retry", null)
//										.create().show();
//							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Listrs.this);
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
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Listrs.this);
							builder.setMessage(jsonResponse.getString("nama") + "\n" + jsonResponse.getString("alamat"))
							.setNegativeButton("Tutup", null)
							.create().show();
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
//							if (success) {
//								String nama = jsonResponse.getString("nama");
//								String alamat = jsonResponse
//										.getString("alamat");
//								String telp = jsonResponse.getString("telp");
//								String web = jsonResponse.getString("web");
//								String lokasi = jsonResponse
//										.getString("lokasi");
//								Intent i = new Intent(Listrs.this,
//										DetailActivity.class);
//								i.putExtra("nama", nama);
//								i.putExtra("alamat", alamat);
//								i.putExtra("telp", telp);
//								i.putExtra("web", web);
//								i.putExtra("lokasi", lokasi);
//								startActivity(i);
//								finish();
//							} else {
//								AlertDialog.Builder builder = new AlertDialog.Builder(
//										Listrs.this);
//								builder.setMessage("Failed")
//										.setNegativeButton("Retry", null)
//										.create().show();
//							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Listrs.this);
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
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Listrs.this);
							builder.setMessage(jsonResponse.getString("nama") + "\n" + jsonResponse.getString("alamat"))
							.setNegativeButton("Tutup", null)
							.create().show();
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
//							if (success) {
//								String nama = jsonResponse.getString("nama");
//								String alamat = jsonResponse
//										.getString("alamat");
//								String telp = jsonResponse.getString("telp");
//								String web = jsonResponse.getString("web");
//								String lokasi = jsonResponse
//										.getString("lokasi");
//								Intent i = new Intent(Listrs.this,
//										DetailActivity.class);
//								i.putExtra("nama", nama);
//								i.putExtra("alamat", alamat);
//								i.putExtra("telp", telp);
//								i.putExtra("web", web);
//								i.putExtra("lokasi", lokasi);
//								startActivity(i);
//								finish();
//							} else {
//								AlertDialog.Builder builder = new AlertDialog.Builder(
//										Listrs.this);
//								builder.setMessage("Failed")
//										.setNegativeButton("Retry", null)
//										.create().show();
//							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Listrs.this);
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
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Listrs.this);
							builder.setMessage(jsonResponse.getString("nama") + "\n" + jsonResponse.getString("alamat"))
							.setNegativeButton("Tutup", null)
							.create().show();
							Toast.makeText(getApplicationContext(),
									"" + jsonResponse.getString("nama"),
									Toast.LENGTH_LONG).show();
//							if (success) {
//								String nama = jsonResponse.getString("nama");
//								String alamat = jsonResponse
//										.getString("alamat");
//								String telp = jsonResponse.getString("telp");
//								String web = jsonResponse.getString("web");
//								String lokasi = jsonResponse
//										.getString("lokasi");
//								Intent i = new Intent(Listrs.this,
//										DetailActivity.class);
//								i.putExtra("nama", nama);
//								i.putExtra("alamat", alamat);
//								i.putExtra("telp", telp);
//								i.putExtra("web", web);
//								i.putExtra("lokasi", lokasi);
//								startActivity(i);
//								finish();
//							} else {
//								AlertDialog.Builder builder = new AlertDialog.Builder(
//										Listrs.this);
//								builder.setMessage("Failed")
//										.setNegativeButton("Retry", null)
//										.create().show();
//							}
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				DataRequest dataRequest = new DataRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Listrs.this);
				queue.add(dataRequest);
			}
		});

		/*
		 * lv = (ListView) findViewById(R.id.listView1); context = this;
		 * 
		 * StringRequest stringRequest = new StringRequest(url, new
		 * Listener<String>() {
		 * 
		 * @Override public void onResponse(String json_param) { json =
		 * json_param; parseJSON(); ArrayAdapter<String> adapter = new
		 * ArrayAdapter<String>( Listrs.this,
		 * android.R.layout.simple_list_item_1, nama);
		 * 
		 * lv.setAdapter(adapter); // lv.setAdapter(new
		 * CustomAdapter(Listrs.this, // nama,telp, alamat, lokasi, id, web));
		 * // Toast.makeText(ListPengaduanActivity.this, // nama_pengadu[0],
		 * Toast.LENGTH_LONG).show(); } }, new ErrorListener() {
		 * 
		 * @Override public void onErrorResponse(VolleyError volleyError) {
		 * 
		 * } }); RequestQueue requestQueue =
		 * Volley.newRequestQueue(Listrs.this); requestQueue.add(stringRequest);
		 * }
		 * 
		 * private void parseJSON() { try { JSONObject jsonObject = new
		 * JSONObject(json);
		 * 
		 * data = jsonObject.getJSONArray(json);
		 * 
		 * id = new String[data.length()]; nama = new String[data.length()];
		 * telp = new String[data.length()]; alamat = new String[data.length()];
		 * web = new String[data.length()]; lokasi = new String[data.length()];
		 * 
		 * for (int i = 0; i < data.length(); i++) { id[i] =
		 * data.getJSONObject(i).getString("id"); nama[i] =
		 * data.getJSONObject(i).getString("nama"); telp[i] =
		 * data.getJSONObject(i).getString("telp"); alamat[i] =
		 * data.getJSONObject(i).getString("alamat"); web[i] =
		 * data.getJSONObject(i).getString("web"); lokasi[i] =
		 * data.getJSONObject(i).getString("lokasi"); } } catch (JSONException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * 
		 * ArrayList<String> data = null; new
		 * MainActivityAsync().execute("load"); DBHandler dbHandler = new
		 * DBHandler(this);
		 * 
		 * dbHandler.openDB();
		 * 
		 * data = DBHandler.selectAll();
		 * 
		 * dbHandler.closeDB();
		 * 
		 * CustomAdapter adapter = new CustomAdapter(this, data);
		 * 
		 * ArrayAdapter<String> cursadapter = new ArrayAdapter<String>(this,
		 * android.R.layout.simple_list_item_1, data);
		 * 
		 * ListView listView = (ListView)findViewById(R.id.listView1);
		 * 
		 * listView.setAdapter(cursadapter);
		 */
		/*
		 * final ListView lv = (ListView) findViewById(R.id.listView1);
		 * 
		 * String data[] =
		 * {"Rumah Sakit BMC","Rumah Sakit Salak","Rumah Sakit Azra"};
		 * ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		 * android.R.layout.simple_list_item_1, data); lv.setAdapter(adapter);
		 * 
		 * lv.setOnItemClickListener(new OnItemClickListener() {
		 * 
		 * @Override public void onItemClick(AdapterView<?> arg0, View arg1, int
		 * position, long arg3) { if(position!=0){ Intent i = new
		 * Intent(Listrs.this, DetailActivity.class);
		 * 
		 * startActivity(i); } Toast.makeText(getApplicationContext(), position,
		 * Toast.LENGTH_LONG).show(); } }); } /* lv.setOnItemClickListener(new
		 * OnItemClickListener() { public void onItemClick(AdapterView<?> arg0,
		 * View arg1, int position, long arg3) { String value =
		 * "Detail belum tersedia pada versi ini.";
		 * 
		 * Toast.makeText(getApplicationContext(), value,
		 * Toast.LENGTH_LONG).show(); }});
		 */
		Button binfo = (Button) findViewById(R.id.binfo);
		Button blokasi = (Button) findViewById(R.id.blokasi);
		Button bwebs = (Button) findViewById(R.id.bwebs);
		Button bkontak = (Button) findViewById(R.id.bkontak);
		
		binfo.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Anda sudah berada di halaman info", Toast.LENGTH_LONG).show();
				
			}
		});
		
		
	blokasi.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent i = new Intent(Listrs.this, Lokasi.class);
			startActivity(i);finish();
		}
	});
		
	bwebs.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent in = new Intent(Listrs.this, Website.class);
			startActivity(in);finish();
		}
	});
	bkontak.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {                                                               
			 Intent intent = new Intent(Listrs.this, Kontak.class);
			startActivity(intent);
			finish();
		}
	});
	}

	
	  @Override 
	  public boolean onCreateOptionsMenu(Menu menu) { 
		  // Inflate the menu; this adds items to the action bar if it is present.
		  getMenuInflater().inflate(R.menu.menu, menu); 
	  return true;
	  }
	  
	  public boolean onOptionItemSelected(MenuItem item) {
		 switch (item.getItemId()) {
			case R.id.info:
				Toast.makeText(getApplicationContext(), "Anda sudah berada di halaman info", Toast.LENGTH_LONG).show();
				return true;
				
			case R.id.webs: //web
				Intent i = new Intent(Listrs.this, Website.class);
				startActivity(i);
				return true;
			case R.id.lokasi: //lokasi
				Intent in = new Intent(Listrs.this, Lokasi.class);
				startActivity(in);
				return true;
			case R.id.kontak: //kontak
				 Intent intent = new Intent(Listrs.this, Kontak.class);
				startActivity(intent);
			default:
				break;
			}
			return false;
		}
	 
}
