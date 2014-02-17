package com.example.gametest;


import java.io.FileNotFoundException;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class options extends Activity{
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.optionpage);
		Intent intent = getIntent();
		
		String name = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		TextView editText1 = (TextView) findViewById(R.id.editText1);
		editText1.setText(name);
		//Intent ActivityTwo = new Intent();
	}
	
	public void backMain(View view)
	{
		setResult(RESULT_CANCELED);
		finish();
	}

	public void saveOptions(View view) throws FileNotFoundException
	{
		TextView editText1 = (TextView) findViewById(R.id.editText1);
		Intent returnIntent = new Intent();
		 returnIntent.putExtra("result" , editText1.getText().toString());
		 setResult(RESULT_OK,returnIntent);     
		 finish();
	}
}
