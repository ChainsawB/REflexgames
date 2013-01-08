package com.example.reflexgames;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Game extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		

		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);
		
		Button startBtn = (Button)findViewById(R.id.startbutton1);
		startBtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Game.this, MainActivity.class);
		    	startActivity(i);
			}
		});

		Button quitBtn = (Button)findViewById(R.id.quitbutton2);
		quitBtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		Button scoreBtn = (Button)findViewById(R.id.scorebtn);
		scoreBtn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Intent i = new Intent(Game.this, score.class);
		    	startActivity(i);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
		
	public void mainActivity(View view)
    {
    	
    	Intent i = new Intent("com.example.reflexgames");
    	startActivity(i);
    	Log.d("TAG", "Clicked");
    }
		
	

}
