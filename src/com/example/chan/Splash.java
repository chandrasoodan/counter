package com.example.chan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle chanmass) {
	super.onCreate(chanmass);
	setContentView(R.layout.splash);
	Thread timer = new Thread(){
		 public void run(){
			 
			 try{
				 sleep(5000);
				 
			 }catch(InterruptedException e){
				 
				 e.printStackTrace();
			 }finally{
				 Intent openStartingPoint= new Intent("com.example.chan.MainActivity");
				 startActivity(openStartingPoint);
				 
			 }
			 
			 
		 } 
		
		
		
		
	};

timer.start();
}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	finish();
	}
}