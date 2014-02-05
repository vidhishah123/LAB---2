package com.example.assignmnt;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends Activity {
	
	private final LatLng LOCATION_BURNABY=new LatLng(49.27645,-122.917587);
	
	private final LatLng LOCATION_SURREY=new LatLng(49.27645,-122.917587);
	
	
	private GoogleMap map;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		map=((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
      public void onClick_City(View v){
	map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
	CameraUpdate update=CameraUpdateFactory.newLatLng(LOCATION_BURNABY);
	map.animateCamera(update);
	
	
         }
     public void onClick_Burnaby(View v){
	
	map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
	CameraUpdate update=CameraUpdateFactory.newLatLng(LOCATION_BURNABY);
	map.animateCamera(update);
	
	
}
      public void onClick_Surrey(View v){
	
	map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
	CameraUpdate update=CameraUpdateFactory.newLatLng(LOCATION_SURREY);
	map.animateCamera(update);
	
	
}
}

