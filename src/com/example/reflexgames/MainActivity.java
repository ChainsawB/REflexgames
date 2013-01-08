package com.example.reflexgames;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

import java.util.Arrays;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button btn1 ;
	private Button btn2 ;
	private Button btn3;
	private Button btn4 ;
	private Button btn5;
	private Button btn6 ;
	private Button btn7 ;
	private Button btn8 ;
	private Button btn9 ;
	private Button btn10 ;
	private Button btn11;
	private Button btn12;
	private Button closeBtn;
	private EditText timeLbl;
	
	private int count = 1;
	timer time = new timer();
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
			

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		randomize();
		
		startGame();
        
				
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void startGame(){
		
		time.start();
		timeLbl = (EditText)(findViewById(R.id.timer));
		//timeLbl.setText("Puga");
       
		System.out.print("outside If\n");
		
		btn1 = (Button)findViewById(R.id.Btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(btn1.getText().toString() == Integer.toString(count))
				{
					btn1.setVisibility(View.GONE);
					count++;
					hasFed();
				}
			}
		});
        
        btn2 = (Button)findViewById(R.id.Button02);
        btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(btn2.getText().toString() == Integer.toString(count))
				{
					btn2.setVisibility(View.GONE);
					count++;
					hasFed();
				}
			}
		});
        
        btn3 = (Button)findViewById(R.id.Button03);
        btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(btn3.getText().toString() == Integer.toString(count))
				{
					btn3.setVisibility(View.GONE);
					count++;
					hasFed();

				}
			}
		});
        
        btn4 = (Button)findViewById(R.id.Button04);
        btn4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(btn4.getText().toString() == Integer.toString(count))
				{
					btn4.setVisibility(View.GONE);
					count++;
					hasFed();

				}
			}
		});
        
        btn5 = (Button)findViewById(R.id.Button05);
        btn5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(btn5.getText().toString() == Integer.toString(count))
				{
					btn5.setVisibility(View.GONE);
					count++;
					hasFed();

				}
			}
		});
        
        btn6 = (Button)findViewById(R.id.Button06);
        btn6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(btn6.getText().toString() == Integer.toString(count))
				{
					btn6.setVisibility(View.GONE);
					count++;
					hasFed();

				}
			}
		});
        
        btn7 = (Button)findViewById(R.id.Button07);
        btn7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(btn7.getText().toString() == Integer.toString(count))
				{
					btn7.setVisibility(View.GONE);
					count++;
					hasFed();

				}
			}
		});
        
        btn8 = (Button)findViewById(R.id.Button08);
        btn8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(btn8.getText().toString() == Integer.toString(count))
				{
					btn8.setVisibility(View.GONE);
					count++;
					hasFed();

				}
			}
		});
        
        btn9 = (Button)findViewById(R.id.Button09);
        btn9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(btn9.getText().toString() == Integer.toString(count))
				{
					btn9.setVisibility(View.GONE);
					count++;
					hasFed();

				}
			}
		});
        
        btn10 = (Button)findViewById(R.id.Button10);
        btn10.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(btn10.getText().toString() == Integer.toString(count))
				{
					btn10.setVisibility(View.GONE);
					count++;
					hasFed();

				}
			}
		});
        
        btn11 = (Button)findViewById(R.id.Button11);
        btn11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(btn11.getText().toString() == Integer.toString(count))
				{
					btn11.setVisibility(View.GONE);
					count++;
					hasFed();

				}
			}
		});
        
        btn12 = (Button)findViewById(R.id.Button12);
        btn12.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(btn12.getText().toString() == Integer.toString(count))
				{
					btn12.setVisibility(View.GONE);
					count++;
					hasFed();

				}
			}
		});
        //timeLbl.setText("Puga");
		
	}
	
	public void hasFed() {
		
		MyDB db = new MyDB(this);
		String a = "Kevin";
		
		  if ( count == 13)
	        {
	        	time.stop();
	        	//timeLbl.setText("Puga");
	        	//System.out.print(time.getElapsedTimeMilli());
	        	
	        	timeLbl.setText(Long.toString(time.getElapsedTimeMilli()));
	        	timeLbl.postInvalidate();
	        	
	        	if(time.getElapsedTimeMilli() >= 10000)
	        		Toast.makeText(this, time.getElapsedTimeMilli()+" is pretty BAD", Toast.LENGTH_LONG).show();
	        	else if (time.getElapsedTimeMilli() >= 8000)
	        		Toast.makeText(this, time.getElapsedTimeMilli()+" is better but still bad", Toast.LENGTH_LONG).show();
	        	else if (time.getElapsedTimeMilli() >= 6000)
	        		Toast.makeText(this, time.getElapsedTimeMilli()+" is good", Toast.LENGTH_LONG).show();
	        	else
	        		Toast.makeText(this, time.getElapsedTimeMilli()+" is REALLY good", Toast.LENGTH_LONG).show();
	        	
	        	db.open();
	        	db.createRecords(Long.toString(time.getElapsedTimeMilli()));
	        	db.close();		
	        	
	        	closeBtn = (Button)findViewById(R.id.closeBtn);
	        	closeBtn.setVisibility(View.VISIBLE);
	        	closeBtn.setOnClickListener(new View.OnClickListener() {
	    		
	    			@Override
	    			public void onClick(View v) {
	    				
	    				finish(); 					

	    			}
	    		});
	        	
	        }
	}

	public void randomize() {

		btn1 = (Button) findViewById(R.id.Btn1);
		btn2 = (Button) findViewById(R.id.Button02);
		btn3 = (Button) findViewById(R.id.Button03);
		btn4 = (Button) findViewById(R.id.Button04);
		btn5 = (Button) findViewById(R.id.Button05);
		btn6 = (Button) findViewById(R.id.Button06);
		btn7 = (Button) findViewById(R.id.Button07);
		btn8 = (Button) findViewById(R.id.Button08);
		btn9 = (Button) findViewById(R.id.Button09);
		btn10 = (Button) findViewById(R.id.Button10);
		btn11 = (Button) findViewById(R.id.Button11);
		btn12 = (Button) findViewById(R.id.Button12);

		
		String[] str1;
		str1 = new String[12];
		int temp = 0;
		int num[];
		num = new int[12];
		boolean unique = false;

		Random rand = new Random();

		for (int b = 0; b < 12; b++) {
			num[b] = 0;
		}

		for (int i = 0; i < 12; i++) {

			while (!unique) {
				temp = rand.nextInt(12) + 1;

				unique = true;
				for (int a = 0; a < 12; a++) {
					if (temp == num[a]) {
						unique = false;
					}
				}
			}

			num[i] = temp;
			unique = false;
		}

		for(int i = 0; i<12; i++) {
			str1[i] = Integer.toString(num[i]);
			
		}
		
		btn1.setText(str1[0]);
		btn2.setText(str1[1]);
		btn3.setText(str1[2]);
		btn4.setText(str1[3]);
		btn5.setText(str1[4]);
		btn6.setText(str1[5]);
		btn7.setText(str1[6]);
		btn8.setText(str1[7]);
		btn9.setText(str1[8]);
		btn10.setText(str1[9]);
		btn11.setText(str1[10]);
		btn12.setText(str1[11]);
		
		
		/*
		str1 = Integer.toString(num[0]);
		str1 += Integer.toString(num[1]);
		
		btn1.setText(str1);
		btn2.setText(str1);
		*/

	}

}