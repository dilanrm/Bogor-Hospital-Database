//package  com.example.denahrumahsakit;
//
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//
//import org.json.JSONArray;
//
////import java.util.List;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//public class DBHandler extends SQLiteOpenHelper {
//
//	static String name = "hospital";
//	static int version = 1;
//	static String table = "rs";
//	static String sql;
//	  static SQLiteDatabase db;
//	
//	public DBHandler(Context context) {
//		super(context, name, null, version);
//		
//	}
//
//	@Override
//	public void onCreate(SQLiteDatabase db) {
//		sql = "CREATE TABLE " + table + " (id INT AUTO INCREMENT, nama TEXT, telp TEXT, alamat TEXT, web TEXT, lokasi TEXT, PRIMARY KEY(id))";
//		
//		db.execSQL(sql);
//	}
//
//	@Override
//	public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {
//		sql = "DROP TABLE IF EXIST " + table;
//		
//		db.execSQL(sql);
//		
//		onCreate(db);
//		
//	}
//	
//	public void openDB() {
//		db = getReadableDatabase();
//	}
//	
//	public void closeDB() {
//		close();
//	}
//	
//	public static ArrayList<String> selectAll(){
//		sql = "SELECT * FROM " + table;
//		
//		Cursor cursor = db.rawQuery(sql, null);
//		
//		ArrayList<String> list = new ArrayList<String>();
//		
//		if(cursor.moveToFirst()){
//			do{
//				list.add(cursor.getString(1));
//			} while(cursor.moveToNext());
//		}
//		
//		return list;
//	}
//
//	public void insert(String name, String phone, String website, String address, String location) {
//		ContentValues values = new ContentValues();
//		
//		values.put("name", name);
//		values.put("phone", phone);
//		values.put("website", website);
//		values.put("address", address);
//		values.put("location", location);
//		
//		db.insert(table, null, values);
//	}
//
//	public static Kontak selectItem(int v_id) {
//		Cursor cursor = db.query(table, new String[]
//				{"id", "nama", "telp", "alamat", "web", "lokasi"}, "id = ?", 
//				new String[]{String.valueOf(v_id)}, 
//				null, null, null, null);
//		
//		if(cursor!=null)
//			cursor.moveToFirst();
//		
//		Kontak kontak = new Kontak(v_id, "a", "b", "c", "d", "e");
//		
//		return kontak;
//	}
//}
