package com.movil.loginyourself;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Finish extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		if (savedInstanceState==null){
			setContentView(R.layout.layout_finish);
		}
		TextView tx = (TextView)findViewById(R.id.Txstate);
		Bundle bd = getIntent().getExtras();
		boolean okay = bd.getBoolean("OKAY");
		if (okay) {
			tx.setText(R.string.strSuccess);
		} else {
			tx.setText(R.string.strfail);
		}
	}
}
