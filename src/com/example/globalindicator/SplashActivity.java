package com.example.globalindicator;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		Thread time=new Thread(){
			public void run(){
				try{
					sleep(5000);
				}catch(InterruptedException e){
					
				}finally{
					Intent a=new Intent(SplashActivity.this,Menu1.class);
					startActivity(a);
				}
			}
		};
		time.start();
	}

	
}
