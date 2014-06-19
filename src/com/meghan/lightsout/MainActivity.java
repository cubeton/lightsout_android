package com.meghan.lightsout;

import java.util.Random;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.app.Notification.Builder;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Vibrator;
import android.support.v4.view.MotionEventCompat;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	public Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
	public boolean button1_on, button2_on, button3_on, button4_on, button5_on, button6_on, button7_on, button8_on, button9_on;
	public TextView click_text;
	public Chronometer time_text; 
	public Vibrator haptic;

	public int click_count = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.buttons);		
		
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);
		button8 = (Button) findViewById(R.id.button8);
		button9 = (Button) findViewById(R.id.button9);
		click_text = (TextView) findViewById(R.id.click_text_number_id);
		time_text = (Chronometer) findViewById(R.id.time_id_number);
		time_text.start();
	    haptic = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);		
		
	
		initializeButtonColors();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.mainmenu, menu);
		return true;
	}
	
	@Override 
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
		case (R.id.action_help) :
			Intent myIntent = new Intent(this, HelpActivity.class);
			startActivityForResult(myIntent, 1);
			/*Intent myIntent = new Intent(MainActivity.this, HelpActivity.class);
			MainActivity.this.startActivity(myIntent);	*/
			break;
		case (R.id.action_refresh) :
			Toast.makeText(getApplicationContext(), "Game reset",
					   Toast.LENGTH_SHORT).show();
			resetGame();
			break;
		case (android.R.id.home) :
			Intent returnIntent = new Intent();
			setResult(RESULT_OK, returnIntent);
			finish();
			break;
		}
		return true;
	}
	

	@SuppressLint("NewApi")
	public void onClick(View v) {
		Vibrator hap = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
		hap.vibrate(20);
		if(v.getId() == R.id.button1) {
			if(button1_on) { 
				button1.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button1_on = false; }
			else {button1.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button1_on = true;
			}

			if(button2_on) { 
				button2.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button2_on = false; }
			else {button2.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button2_on = true;
			}
			if(button4_on) { 
				button4.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button4_on = false; }
			else {button4.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button4_on = true;
			}
			if(button5_on) { 
				button5.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button5_on = false; }
			else {button5.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button5_on = true;
			}
		}
		
		if(v.getId() == R.id.button2) {
			if(button1_on) { 
				button1.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button1_on = false; }
			else {button1.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button1_on = true;
			}
			if(button2_on) { 
				button2.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button2_on = false; }
			else {button2.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button2_on = true;
			}
			if(button3_on) { 
				button3.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button3_on = false; }
			else {button3.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button3_on = true;
			}
		}
		
		if(v.getId() == R.id.button3) {
			if(button2_on) { 
				button2.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button2_on = false; }
			else {button2.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button2_on = true;
			}
			if(button3_on) { 
				button3.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button3_on = false; }
			else {button3.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button3_on = true;
			}
			if(button5_on) { 
				button5.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button5_on = false; }
			else {button5.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button5_on = true;
			}			
			if(button6_on) { 
				button6.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button6_on = false; }
			else {button6.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button6_on = true;
			}
		}
		
		if(v.getId() == R.id.button4) {
			if(button1_on) { 
				button1.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button1_on = false; }
			else {button1.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button1_on = true;
			}
			if(button4_on) { 
				button4.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button4_on = false; }
			else {button4.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button4_on = true;
			}
			if(button7_on) { 
				button7.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button7_on = false; }
			else {button7.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button7_on = true;
			}
		}
		
		if(v.getId() == R.id.button5) {

			if(button5_on) { 
				button5.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button5_on = false; }
			else {button5.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button5_on = true;
			}
			if(button2_on) { 
				button2.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button2_on = false; }
			else {button2.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button2_on = true;
			}	
			if(button4_on) { 
				button4.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button4_on = false; }
			else {button4.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button4_on = true;
			}
			if(button6_on) { 
				button6.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button6_on = false; }
			else {button6.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button6_on = true;
			}
			if(button8_on) { 
				button8.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button8_on = false; }
			else {button8.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button8_on = true;
			}
		}
		
		if(v.getId() == R.id.button6) {

			if(button6_on) { 
				button6.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button6_on = false; }
			else {button6.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button6_on = true;
			}
			if(button3_on) { 
				button3.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button3_on = false; }
			else {button3.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button3_on = true;
			}
			if(button9_on) { 
				button9.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button9_on = false; }
			else {button9.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button9_on = true;
			}
		}
		
		if(v.getId() == R.id.button7) {

			if(button7_on) { 
				button7.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button7_on = false; }
			else {button7.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button7_on = true;
			}
			if(button4_on) { 
				button4.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button4_on = false; }
			else {button4.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button4_on = true;
			}
			if(button5_on) { 
				button5.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button5_on = false; }
			else {button5.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button5_on = true;
			}	
			if(button8_on) { 
				button8.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button8_on = false; }
			else {button8.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button8_on = true;
			}
		}
		
		if(v.getId() == R.id.button8) {
			if(button7_on) { 
				button7.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button7_on = false; }
			else {button7.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button7_on = true;
			}
			if(button8_on) { 
				button8.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button8_on = false; }
			else {button8.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button8_on = true;
			}
			if(button9_on) { 
				button9.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button9_on = false; }
			else {button9.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button9_on = true;
			}
		}
		if(v.getId() == R.id.button9) {
			if(button5_on) { 
				button5.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button5_on = false; }
			else {button5.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button5_on = true;
			}	
			if(button9_on) { 
				button9.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button9_on = false; }
			else {button9.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button9_on = true;
			}
			if(button8_on) { 
				button8.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button8_on = false; }
			else {button8.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button8_on = true;
			}
			if(button6_on) { 
				button6.setBackground(getResources().getDrawable(R.drawable.shape_off));	 button6_on = false; }
			else {button6.setBackground(getResources().getDrawable(R.drawable.shape_on));	 button6_on = true;
			}
		}
		click_count +=1;

		click_text.setText(String.valueOf(click_count));
		checkForWin();
	}

	
	private void checkForWin() {
		if (!(button1_on || button2_on || button3_on || button4_on || button5_on || button6_on || button7_on || button8_on || button9_on)) {
			time_text.stop();
			AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
					this);
	 
				// set title
				alertDialogBuilder.setTitle("YOU WON!");
	 
				// set dialog message
				alertDialogBuilder
					.setMessage("Play again?")
					.setCancelable(false)
					.setPositiveButton("Yes yes yes RIGHT NOW!",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							resetGame();
						}
					  })
					.setNegativeButton("no I don't like fun",new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int id) {
							// if this button is clicked, just close
							// the dialog box and do nothing
							dialog.cancel();
						}
					});
	 
					// create alert dialog
					AlertDialog alertDialog = alertDialogBuilder.create();
	 
					// show it
					alertDialog.show();
				}				
	}
	
	private void resetGame() {
		click_count = 0;
		click_text.setText(String.valueOf(click_count));
		initializeButtonColors();
		time_text.setBase(SystemClock.elapsedRealtime());
		time_text.start();
	}
	
	@SuppressLint("NewApi")
	private void initializeButtonColors() {
		Random random = new Random();
		button1_on = random.nextBoolean();
		if(button1_on) {
			button1.setBackground(getResources().getDrawable(R.drawable.shape_on));	
		} else {
			button1.setBackground(getResources().getDrawable(R.drawable.shape_off));					
		}

		button2_on = random.nextBoolean();
		if(button2_on) {
			button2.setBackground(getResources().getDrawable(R.drawable.shape_on));					
		} else {
			button2.setBackground(getResources().getDrawable(R.drawable.shape_off));					
		}

		
		button3_on = random.nextBoolean();
		if(button3_on) {
			button3.setBackground(getResources().getDrawable(R.drawable.shape_on));					
		} else {
			button3.setBackground(getResources().getDrawable(R.drawable.shape_off));					
		}

		
		button4_on = random.nextBoolean();
		if(button4_on) {
			button4.setBackground(getResources().getDrawable(R.drawable.shape_on));					
		} else {
			button4.setBackground(getResources().getDrawable(R.drawable.shape_off));					
		}

		
		button5_on = random.nextBoolean();
		if(button5_on) {
			button5.setBackground(getResources().getDrawable(R.drawable.shape_on));					
		}  else {
			button5.setBackground(getResources().getDrawable(R.drawable.shape_off));					
		}

		
		button6_on = random.nextBoolean();
		if(button6_on) {
			button6.setBackground(getResources().getDrawable(R.drawable.shape_on));					
		} else {
			button6.setBackground(getResources().getDrawable(R.drawable.shape_off));					
		}

		
		button7_on = random.nextBoolean();
		if(button7_on) {
			button7.setBackground(getResources().getDrawable(R.drawable.shape_on));					
		} else {
			button7.setBackground(getResources().getDrawable(R.drawable.shape_off));					
		}

		button8_on = random.nextBoolean();
		if(button8_on) {
			button8.setBackground(getResources().getDrawable(R.drawable.shape_on));					
		} else {
			button8.setBackground(getResources().getDrawable(R.drawable.shape_off));					
		}

		
		button9_on = random.nextBoolean();
		if(button9_on) {
			button9.setBackground(getResources().getDrawable(R.drawable.shape_on));					
		} else {
			button9.setBackground(getResources().getDrawable(R.drawable.shape_off));					
		}
		

	}
	
}
