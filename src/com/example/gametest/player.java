package com.example.gametest;

import android.app.Activity;

public class player extends Activity
{
	int pID;
	String PlayerName;
	
	public player()
	{
	
	}
	
	public void setpID( int ID)
	{
		pID = ID;
	}
	public int getpID (int ID)
	{
		return pID;
	}
	public void setPlayerName( String Name)
	{
		PlayerName = Name;
	}
	public String getPlayerName (int ID)
	{
		return PlayerName;
	}

}
