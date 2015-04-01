package com.example.treasurehunt;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Question3 extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question3);
		
		//Toast.makeText(getApplicationContext(), Integer.toString(MainActivity.teamID), Toast.LENGTH_LONG).show();
		TextView textView1 = (TextView) findViewById(R.id.textView1);
		textView1.append( MainActivity.answer[MainActivity.teamID][3][1] );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.question3, menu);
		return true;
	}
	
	public void clicked(View view)
	{
		Intent intent = new Intent(this, Question4.class);
		EditText editText = (EditText) findViewById(R.id.editText1);
		String message = editText.getText().toString().trim();
		
		if( MainActivity.checkString(message, MainActivity.answer[MainActivity.teamID][3][0]) )
			startActivity(intent);
		else
		{
			TextView textView2 = (TextView) findViewById(R.id.textView2);
			textView2.setVisibility(1);
		}
	}
}
