package com.example.lightsout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	public Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
	public boolean button1_on, button2_on, button3_on, button4_on, button5_on, button6_on, button7_on, button8_on, button9_on;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buttons);
		
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);
	}
	
	public void onClick(View v) {
		if(v.getId() == R.id.button1) {
			//Light is on, time to turn it off
			if(button1_on) {
				button1.setBackgroundColor(getResources().getColor(R.color.off));		
				button1_on = false;
			} else {
			//Light is off, time to turn it on
				button1.setBackgroundColor(getResources().getColor(R.color.on));	
				button1_on = true;
			}

		}
	}
	

	
}
