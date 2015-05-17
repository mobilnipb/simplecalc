package com.example.simplecalc;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;


public class MainActivity extends Activity {
	private EditText num; 
	private TextView wyn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 num = (EditText) findViewById(R.id.L2) ;
		 wyn = (TextView) findViewById(R.id.txWynik);
		
	}

	public void  Podaj_wynik(View v)
	{
		Log.w("simplecalc", "kliknieto");
		//Toast.makeText(getApplicationContext(), "kliknales mnie", Toast.LENGTH_SHORT).show();
		int val = Integer.parseInt( num.getText().toString() );
		val=val+5;
		wyn.setText(String.valueOf(val));
		
		
	}

}
