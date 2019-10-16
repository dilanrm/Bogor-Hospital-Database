package com.example.denahrumahsakit;

import org.json.JSONException;
import org.json.JSONObject;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Artikel extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_artikel);

		TextView makan = (TextView) findViewById(R.id.nama);
		TextView tomat = (TextView) findViewById(R.id.nama1);
		TextView pola = (TextView) findViewById(R.id.nama2);
		ImageView makanb = (ImageView) findViewById(R.id.imageView1);
		ImageView tomato = (ImageView) findViewById(R.id.tomat);
		ImageView polah = (ImageView) findViewById(R.id.pola);

		makan.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
//				Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri
//						.parse("https://pastebin.com/raw/APWQsmth"));
//				startActivity(i);
				final String id = "1";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Artikel.this);
							builder.setMessage(jsonResponse.getString("isi"))
									.setNegativeButton("Tutup", null)
									.create().show();
								String isi = jsonResponse.getString("isi");

								
								Intent i = new Intent(Artikel.this,
										DetailArtikel.class);
								i.putExtra("isi", isi);
								startActivity(i);
								
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				ArtikelRequest artikelRequest = new ArtikelRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Artikel.this);
				queue.add(artikelRequest);
			}
		});

		makanb.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
//				Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri
//						.parse("https://pastebin.com/raw/APWQsmth"));
//				startActivity(i);
				final String id = "1";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Artikel.this);
							builder.setMessage(jsonResponse.getString("isi"))
									.setNegativeButton("Tutup", null)
									.create().show();
								String isi = jsonResponse.getString("isi");

								
								Intent i = new Intent(Artikel.this,
										DetailArtikel.class);
								i.putExtra("isi", isi);
								startActivity(i);
								
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				ArtikelRequest artikelRequest = new ArtikelRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Artikel.this);
				queue.add(artikelRequest);
			}
		});

		tomat.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
//				Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri
//						.parse("https://pastebin.com/raw/0n7kk28B"));
//				startActivity(i);
				final String id = "2";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Artikel.this);
							builder.setMessage(jsonResponse.getString("isi"))
									.setNegativeButton("Tutup", null)
									.create().show();
								String isi = jsonResponse.getString("isi");

								
								Intent i = new Intent(Artikel.this,
										DetailArtikel.class);
								i.putExtra("isi", isi);
								startActivity(i);
								
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				ArtikelRequest artikelRequest = new ArtikelRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Artikel.this);
				queue.add(artikelRequest);
			}
		});
		
		tomato.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
//				Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri
//						.parse("https://pastebin.com/raw/0n7kk28B"));
//				startActivity(i);
				final String id = "2";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Artikel.this);
							builder.setMessage(jsonResponse.getString("isi"))
									.setNegativeButton("Tutup", null)
									.create().show();
								String isi = jsonResponse.getString("isi");

								
								Intent i = new Intent(Artikel.this,
										DetailArtikel.class);
								i.putExtra("isi", isi);
								startActivity(i);
								
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				ArtikelRequest artikelRequest = new ArtikelRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Artikel.this);
				queue.add(artikelRequest);
			}
		});

		pola.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
//				Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri
//						.parse("https://pastebin.com/raw/EFKZjFJu"));
//				startActivity(i);
				final String id = "3";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Artikel.this);
							builder.setMessage(jsonResponse.getString("isi"))
									.setNegativeButton("Tutup", null)
									.create().show();
								String isi = jsonResponse.getString("isi");

								
								Intent i = new Intent(Artikel.this,
										DetailArtikel.class);
								i.putExtra("isi", isi);
								startActivity(i);
								
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				ArtikelRequest artikelRequest = new ArtikelRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Artikel.this);
				queue.add(artikelRequest);
			}
		});
		
		polah.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
//				Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri
//						.parse("https://pastebin.com/raw/EFKZjFJu"));
//				startActivity(i);
				final String id = "3";
				Response.Listener<String> responseListener = new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						try {
							JSONObject jsonResponse = new JSONObject(response);
							boolean success = jsonResponse
									.getBoolean("success");
							AlertDialog.Builder builder = new AlertDialog.Builder(
									Artikel.this);
							builder.setMessage(jsonResponse.getString("isi"))
									.setNegativeButton("Tutup", null)
									.create().show();
								String isi = jsonResponse.getString("isi");

								
								Intent i = new Intent(Artikel.this,
										DetailArtikel.class);
								i.putExtra("isi", isi);
								startActivity(i);
								
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				ArtikelRequest artikelRequest = new ArtikelRequest(id, responseListener);
				RequestQueue queue = Volley.newRequestQueue(Artikel.this);
				queue.add(artikelRequest);
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
