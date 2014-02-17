package com.example.gametest;

import java.io.FileNotFoundException;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	player player1 = new player();
	public final static String EXTRA_MESSAGE = "com.example.gametest.MESSAGE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		player1.pID = 1;
		player1.PlayerName = "NoName";
		setContentView(R.layout.activity_main);
		TextView textbox1 = (TextView) findViewById(R.id.textView1);
		textbox1.setText("Hello " + player1.PlayerName);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void new_game(View view) throws FileNotFoundException 
	{
		
	}
	
	public void optionsGame(View view) throws FileNotFoundException 
	{
	    // Do something in response to button
	    Intent intent = new Intent(this, options.class);
	    Intent i = new Intent(this, options.class);
	    startActivityForResult(i, 1);
	    String message = player1.PlayerName;
	    intent.putExtra(EXTRA_MESSAGE, message);  
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) 
	{

		  if (requestCode == 1) 
		  {
			 
		     if(resultCode == RESULT_OK)
		     {      
		         String result=data.getStringExtra("result");  
		         player1.PlayerName = result;
		         TextView textbox1 = (TextView) findViewById(R.id.textView1);
		         textbox1.setText("Hello " + player1.PlayerName);
		     }
		     if (resultCode == RESULT_CANCELED) 
		     {    
		         //Write your code if there's no result
		     }
		  }
		}//onActivityResult

	
	public void quitGame(View view) throws FileNotFoundException 
	{
	    // Do something in response to button
        // TODO Auto-generated method stub
        finish();
        System.exit(0);
	}

}
