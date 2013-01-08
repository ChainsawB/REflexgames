package com.example.reflexgames;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class MyDB{  
	

	private MySQLiteHelper dbHelper;  

	private SQLiteDatabase database;  

	public final static String SCORE_TABLE="MyScores"; // name of table 

	 public static final String KEY_ID= "id"; 
	 
	 public static final String KEY_SCORE = "score";

 /* 
 * @param context 
 */  
	public MyDB(Context context){  
		dbHelper = new MySQLiteHelper(context);  
		database = dbHelper.getWritableDatabase();  
	}
	
	public MyDB open() throws SQLException 
    {
		database = dbHelper.getWritableDatabase();
        return this;
    }
	
	public void close() 
    {
        dbHelper.close();
    }
	

	public long createRecords(String score){  
		ContentValues values = new ContentValues();  
		values.put(KEY_SCORE, score);
		return database.insert(SCORE_TABLE, null, values);  
	}    

    public Cursor selectRecords() {
       String[] cols = new String[] {KEY_ID, KEY_SCORE};  
       Cursor mCursor = database.query(true, SCORE_TABLE,cols,null  
            , null, null, null, null, null);  
       if (mCursor != null) {  
        mCursor.moveToFirst();  
       }

       
     return mCursor; // iterate to get each value.
    }
    
    public ArrayList<ArrayList<String>> allScores()
    {
       ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
       Cursor cursor = database.rawQuery(KEY_ID, null);
    		   //.rawQuery(SELECT, null);
       if(cursor.moveToFirst())
       {
           do
           {
               ArrayList<String> score = new ArrayList<String>();
               score.add(cursor.getString(1));
               score.add(cursor.getString(2));
               results.add(score);
           }while(cursor.moveToNext());
           if(cursor != null && !cursor.isClosed())
              cursor.close();
       }
       return results;
    }
    

    
}
