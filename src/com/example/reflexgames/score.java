package com.example.reflexgames;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class score extends Activity  {
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		MyDB db;
		ArrayAdapter<String> adapter = null;
		
		ListView list = (ListView) findViewById(R.id.listView1);
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item);
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.highscore);
		
		
		//list.setAdapter(adapter);
		
		
		//list.setAdapter(this, db.allScores());
		
		Button menuBtn = (Button)findViewById(R.id.menubtn);
		menuBtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Intent i = new Intent(score.this, Game.class);
		    	startActivity(i);
		    	finish();
			}
		});
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
		
	public void scores(View view)
    {
    	
    	Intent i = new Intent("com.example.reflexgames");
    	startActivity(i);
    	Log.d("TAG", "Clicked");
    }
	
	public void displayScores() {
		
		MyDB db = null;
		
		db.allScores();
		
		
		
	}
	

}
