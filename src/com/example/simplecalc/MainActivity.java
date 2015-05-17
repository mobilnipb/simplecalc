package com.example.simplecalc;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.app.Activity;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void  Podaj_wynik(View v)
	{
		Log.w("simplecalc", "kliknieto");
		Toast.makeText(getApplicationContext(), "kliknales mnie", Toast.LENGTH_SHORT).show();
	}

}
