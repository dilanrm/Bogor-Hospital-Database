//package com.example.denahrumahsakit;
//
//import android.os.Bundle;
//import android.app.Activity;
//import android.content.Intent;
//import android.view.Menu;
//import android.widget.ListAdapter;
//import android.widget.ListView;
//import android.widget.SimpleAdapter;
//import android.view.View.OnClickListener;
//
//import org.json.JSONObject;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONStringer;
//import org.json.JSONTokener;
//
//import com.google.gson.JsonParser;
//import com.google.gson.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//public class List extends Activity {
//	
//	private static String link_url = "http://kuunibyou.esy.es/projek/Data.php";
//    
//    private static final String AR_ID = "id";
//    private static final String AR_JUDUL = "nama";
//     
// 
//    JSONArray wisata = null;
//    ArrayList<HashMap<String, String>> daftar_wisata = new ArrayList<HashMap<String, String>>();
//
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_list);
//		
//		JsonParser jParser = new JsonParser();
//		 
//        JSONObject json = jParser.AmbilJson(link_url);
// 
//        try {
//            wisata = json.getJSONArray("wisata");
//             
//            for(int i = 0; i < wisata.length(); i++){
//                JSONObject ar = wisata.getJSONObject(i);
//                 
//                String id = ar.getString(AR_ID);
//                String nama = ar.getString(AR_JUDUL);
//                                 
//                HashMap<String, String> map = new HashMap<String, String>();
// 
//                map.put(AR_ID, id);
//                map.put(AR_JUDUL, nama);
//                 
//                daftar_wisata.add(map);
//            }
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//        this.adapter_listview();
//    }
//     
//    public ListView adapter_listview() {
// 
//        ListAdapter adapter = new SimpleAdapter(this, daftar_wisata,
//                R.layout.list_row,
//                new String[] { AR_JUDUL, AR_ID}, new int[] {
//                        R.id.nama, R.id.kode});
// 
//        setListAdapter(adapter);
//        ListView lv = adapter_listview();
//        lv.setOnItemClickListener(new OnItemClickListener() {
// 
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
//                String kode = ((TextView) view.findViewById(R.id.kode)).getText().toString();
//                 
//                Intent in = new Intent(List.this, DetailActivity.class);
//                in.putExtra(AR_ID, kode);
//                startActivity(in);
// 
//            }
//        });        
//    
//	}
//
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.list, menu);
//		return true;
//	}
//
//}
