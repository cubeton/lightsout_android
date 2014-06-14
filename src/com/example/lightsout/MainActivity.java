package com.example.lightsout;

import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.app.Notification.Builder;
import android.content.Context;
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
		
		//Now the buttons are set, add them to the screen
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
		
		initializeButtonColors();
	}
	
	public void onClick(View v) {
		if(v.getId() == R.id.button1) {
			if(button1_on) { 
				button1.setBackgroundColor(getResources().getColor(R.color.off)); button1_on = false; }
			else {button1.setBackgroundColor(getResources().getColor(R.color.on)); button1_on = true;
			}

			if(button2_on) { 
				button2.setBackgroundColor(getResources().getColor(R.color.off)); button2_on = false; }
			else {button2.setBackgroundColor(getResources().getColor(R.color.on)); button2_on = true;
			}
			if(button4_on) { 
				button4.setBackgroundColor(getResources().getColor(R.color.off)); button4_on = false; }
			else {button4.setBackgroundColor(getResources().getColor(R.color.on)); button4_on = true;
			}
			if(button5_on) { 
				button5.setBackgroundColor(getResources().getColor(R.color.off)); button5_on = false; }
			else {button5.setBackgroundColor(getResources().getColor(R.color.on)); button5_on = true;
			}
		}
		if(v.getId() == R.id.button2) {
			if(button1_on) { 
				button1.setBackgroundColor(getResources().getColor(R.color.off)); button1_on = false; }
			else {button1.setBackgroundColor(getResources().getColor(R.color.on)); button1_on = true;
			}
			if(button2_on) { 
				button2.setBackgroundColor(getResources().getColor(R.color.off)); button2_on = false; }
			else {button2.setBackgroundColor(getResources().getColor(R.color.on)); button2_on = true;
			}
			if(button3_on) { 
				button3.setBackgroundColor(getResources().getColor(R.color.off)); button3_on = false; }
			else {button3.setBackgroundColor(getResources().getColor(R.color.on)); button3_on = true;
			}
		}
		
		if(v.getId() == R.id.button3) {
			if(button2_on) { 
				button2.setBackgroundColor(getResources().getColor(R.color.off)); button2_on = false; }
			else {button2.setBackgroundColor(getResources().getColor(R.color.on)); button2_on = true;
			}
			if(button3_on) { 
				button3.setBackgroundColor(getResources().getColor(R.color.off)); button3_on = false; }
			else {button3.setBackgroundColor(getResources().getColor(R.color.on)); button3_on = true;
			}
			if(button5_on) { 
				button5.setBackgroundColor(getResources().getColor(R.color.off)); button5_on = false; }
			else {button5.setBackgroundColor(getResources().getColor(R.color.on)); button5_on = true;
			}			
			if(button6_on) { 
				button6.setBackgroundColor(getResources().getColor(R.color.off)); button6_on = false; }
			else {button6.setBackgroundColor(getResources().getColor(R.color.on)); button6_on = true;
			}
		}
		if(v.getId() == R.id.button4) {
			if(button1_on) { 
				button1.setBackgroundColor(getResources().getColor(R.color.off)); button1_on = false; }
			else {button1.setBackgroundColor(getResources().getColor(R.color.on)); button1_on = true;
			}
			if(button4_on) { 
				button4.setBackgroundColor(getResources().getColor(R.color.off)); button4_on = false; }
			else {button4.setBackgroundColor(getResources().getColor(R.color.on)); button4_on = true;
			}
			if(button7_on) { 
				button7.setBackgroundColor(getResources().getColor(R.color.off)); button7_on = false; }
			else {button7.setBackgroundColor(getResources().getColor(R.color.on)); button7_on = true;
			}
		}
		if(v.getId() == R.id.button5) {

			if(button5_on) { 
				button5.setBackgroundColor(getResources().getColor(R.color.off)); button5_on = false; }
			else {button5.setBackgroundColor(getResources().getColor(R.color.on)); button5_on = true;
			}
			if(button2_on) { 
				button2.setBackgroundColor(getResources().getColor(R.color.off)); button2_on = false; }
			else {button2.setBackgroundColor(getResources().getColor(R.color.on)); button2_on = true;
			}	
			if(button4_on) { 
				button4.setBackgroundColor(getResources().getColor(R.color.off)); button4_on = false; }
			else {button4.setBackgroundColor(getResources().getColor(R.color.on)); button4_on = true;
			}
			if(button6_on) { 
				button6.setBackgroundColor(getResources().getColor(R.color.off)); button6_on = false; }
			else {button6.setBackgroundColor(getResources().getColor(R.color.on)); button6_on = true;
			}
			if(button8_on) { 
				button8.setBackgroundColor(getResources().getColor(R.color.off)); button8_on = false; }
			else {button8.setBackgroundColor(getResources().getColor(R.color.on)); button8_on = true;
			}
		}
		if(v.getId() == R.id.button6) {

			if(button6_on) { 
				button6.setBackgroundColor(getResources().getColor(R.color.off)); button6_on = false; }
			else {button6.setBackgroundColor(getResources().getColor(R.color.on)); button6_on = true;
			}
			if(button3_on) { 
				button3.setBackgroundColor(getResources().getColor(R.color.off)); button3_on = false; }
			else {button3.setBackgroundColor(getResources().getColor(R.color.on)); button3_on = true;
			}
			if(button9_on) { 
				button9.setBackgroundColor(getResources().getColor(R.color.off)); button9_on = false; }
			else {button9.setBackgroundColor(getResources().getColor(R.color.on)); button9_on = true;
			}
		}
		if(v.getId() == R.id.button7) {

			if(button7_on) { 
				button7.setBackgroundColor(getResources().getColor(R.color.off)); button7_on = false; }
			else {button7.setBackgroundColor(getResources().getColor(R.color.on)); button7_on = true;
			}
			if(button4_on) { 
				button4.setBackgroundColor(getResources().getColor(R.color.off)); button4_on = false; }
			else {button4.setBackgroundColor(getResources().getColor(R.color.on)); button4_on = true;
			}
			if(button5_on) { 
				button5.setBackgroundColor(getResources().getColor(R.color.off)); button5_on = false; }
			else {button5.setBackgroundColor(getResources().getColor(R.color.on)); button5_on = true;
			}	
			if(button8_on) { 
				button8.setBackgroundColor(getResources().getColor(R.color.off)); button8_on = false; }
			else {button8.setBackgroundColor(getResources().getColor(R.color.on)); button8_on = true;
			}
		}
		if(v.getId() == R.id.button8) {
			if(button7_on) { 
				button7.setBackgroundColor(getResources().getColor(R.color.off)); button7_on = false; }
			else {button7.setBackgroundColor(getResources().getColor(R.color.on)); button7_on = true;
			}
			if(button8_on) { 
				button8.setBackgroundColor(getResources().getColor(R.color.off)); button8_on = false; }
			else {button8.setBackgroundColor(getResources().getColor(R.color.on)); button8_on = true;
			}
			if(button9_on) { 
				button9.setBackgroundColor(getResources().getColor(R.color.off)); button9_on = false; }
			else {button9.setBackgroundColor(getResources().getColor(R.color.on)); button9_on = true;
			}
		}
		if(v.getId() == R.id.button9) {
			if(button5_on) { 
				button5.setBackgroundColor(getResources().getColor(R.color.off)); button5_on = false; }
			else {button5.setBackgroundColor(getResources().getColor(R.color.on)); button5_on = true;
			}	
			if(button9_on) { 
				button9.setBackgroundColor(getResources().getColor(R.color.off)); button9_on = false; }
			else {button9.setBackgroundColor(getResources().getColor(R.color.on)); button9_on = true;
			}
			if(button8_on) { 
				button8.setBackgroundColor(getResources().getColor(R.color.off)); button8_on = false; }
			else {button8.setBackgroundColor(getResources().getColor(R.color.on)); button8_on = true;
			}
			if(button6_on) { 
				button6.setBackgroundColor(getResources().getColor(R.color.off)); button6_on = false; }
			else {button6.setBackgroundColor(getResources().getColor(R.color.on)); button6_on = true;
			}
		}
		checkForWin();
	}
/*	
	private void toggleButton(Button button, boolean light_status) {
		if(light_status) { button.setBackgroundColor(getResources().getColor(R.color.off)); light_status = false; } else {	button1.setBackgroundColor(getResources().getColor(R.color.on)); light_status = true;
		}	
	}
	*/
	
	private void checkForWin() {
		if (!(button1_on || button2_on || button3_on || button4_on || button5_on || button6_on || button7_on || button8_on || button9_on)) {
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
							// if this button is clicked, close
							// current activity
							initializeButtonColors();
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
	private void initializeButtonColors() {
		Random random = new Random();
		button1_on = random.nextBoolean();
		if(button1_on) {
			button1.setBackgroundColor(getResources().getColor(R.color.on));	
		} else {
			button1.setBackgroundColor(getResources().getColor(R.color.off));				
		}

		button2_on = random.nextBoolean();
		if(button2_on) {
			button2.setBackgroundColor(getResources().getColor(R.color.on));				
		} else {
			button2.setBackgroundColor(getResources().getColor(R.color.off));				
		}

		
		button3_on = random.nextBoolean();
		if(button3_on) {
			button3.setBackgroundColor(getResources().getColor(R.color.on));				
		} else {
			button3.setBackgroundColor(getResources().getColor(R.color.off));				
		}

		
		button4_on = random.nextBoolean();
		if(button4_on) {
			button4.setBackgroundColor(getResources().getColor(R.color.on));				
		} else {
			button4.setBackgroundColor(getResources().getColor(R.color.off));				
		}

		
		button5_on = random.nextBoolean();
		if(button5_on) {
			button5.setBackgroundColor(getResources().getColor(R.color.on));				
		}  else {
			button5.setBackgroundColor(getResources().getColor(R.color.off));				
		}

		
		button6_on = random.nextBoolean();
		if(button6_on) {
			button6.setBackgroundColor(getResources().getColor(R.color.on));				
		} else {
			button6.setBackgroundColor(getResources().getColor(R.color.on));				
		}

		
		button7_on = random.nextBoolean();
		if(button7_on) {
			button7.setBackgroundColor(getResources().getColor(R.color.on));				
		} else {
			button7.setBackgroundColor(getResources().getColor(R.color.off));				
		}

		button8_on = random.nextBoolean();
		if(button8_on) {
			button8.setBackgroundColor(getResources().getColor(R.color.on));				
		} else {
			button8.setBackgroundColor(getResources().getColor(R.color.off));				
		}

		
		button9_on = random.nextBoolean();
		if(button9_on) {
			button9.setBackgroundColor(getResources().getColor(R.color.on));				
		} else {
			button9.setBackgroundColor(getResources().getColor(R.color.off));				
		}
		

	}
	
}
