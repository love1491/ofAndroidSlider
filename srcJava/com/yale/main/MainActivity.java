package com.yale.main;

import cc.openframeworks.androidEmptyExample.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class MainActivity extends Activity {

	
	public Button button1;
	public Button button2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1=(Button)findViewById(R.id.button1);
		button2=(Button)findViewById(R.id.button2);
		button1.setOnClickListener(new MyOnButtonClick(1));
		button2.setOnClickListener(new MyOnButtonClick(2));
		

	}
	private class MyOnButtonClick implements OnClickListener{

		private int No;
		public MyOnButtonClick(int i){
			No=i;
		}
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(No){
			case 1:
				startActivity(new Intent(getBaseContext(),cc.openframeworks.ofAndroidSlider.OFActivity.class));
				break;
			case 2:
				break;
				
			}
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		return super.onOptionsItemSelected(item);
	}



}
