package com.example.denahrumahsakit;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
	Context context;
	LayoutInflater layoutInflater;
	List<String> list;
	
	public CustomAdapter(Context context, List<String> list) {
		this.context=context;
		this.list=list;
		layoutInflater=LayoutInflater.from(context);
	}

	public CustomAdapter(Listrs listrs, String[] nama, String[] telp,
			String[] alamat, String[] lokasi, String[] id, String[] web) {
		
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int position, View view, ViewGroup root) {
		view = layoutInflater.inflate(R.layout.activity_custome_adapter, root, false);
		
		TextView txt = (TextView) view.findViewById(R.id.tvWelcomeMsg);
		
		txt.setText(list.get(position));
		
		return view;
	}

}
