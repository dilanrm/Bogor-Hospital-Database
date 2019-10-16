package com.example.denahrumahsakit;

import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.*;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.android.*;
import android.*;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends Activity {
//	DBHandler db;
//	public static final String JSON_ARRAY = "result";
//    private JSONArray data = null;
//    private String json;
//    String url = "http://127.0.0.1:8080/userapi/connectdb.php";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		/*db = new DBHandler(this);
		Intent i = getIntent();
		int v_id = i.getIntExtra("id", 0);
		
		final Kontak k;
		
		db.openDB();
		
		k = DBHandler.selectItem(v_id);
		db.closeDB();*/
		
		TextView txtnama = (TextView) findViewById(R.id.nama);
		TextView txtalamat = (TextView) findViewById(R.id.alamat);
		TextView txtweb = (TextView) findViewById(R.id.btnweb);
		Button btntelp = (Button) findViewById(R.id.btntelp);
		Button btndir = (Button) findViewById(R.id.dir);
		
		/*txtnama.setText(k.getNama());
		txtphone.setText(k.getPhone());
		txtalamat.setText(k.getAddress());
		btnweb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent web = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(k.getWebsite()));
				startActivity(web);
			}
		});
		btndir.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent lokasi = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(k.getLocation()));
				startActivity(lokasi);
			}
		});*/
		
		
		//Kontak s = new Kontak();
		
		final Intent intent = getIntent();
		txtnama.setText(intent.getStringExtra("nama"));
		final String web = intent.getStringExtra("web");
		txtweb.setText(web);
		txtalamat.setText(intent.getStringExtra("alamat"));
		final String telp = intent.getStringExtra("telp");
		final String lokasi = intent.getStringExtra("lokasi");
		txtweb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent link = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(web));
				startActivity(link);
			}
		});
		btntelp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + telp));
				startActivity(intent);
			}
		});
		btndir.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent lokashi = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(lokasi));
				startActivity(lokashi);
			}
		});
		
		
	}
    
  
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.detail, menu);
		return true;
	}


}
