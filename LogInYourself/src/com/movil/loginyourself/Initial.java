package com.movil.loginyourself;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Initial extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		if (savedInstanceState==null) {
			setContentView(R.layout.layout_initial);
			TextView tx = (TextView)findViewById(R.id.TxFacebook);
			tx.setPaintFlags(tx.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
		}
	}
	
	public void login(View view)
	{
		EditText user, pass;
		user = (EditText) findViewById(R.id.EtUser);
		pass = (EditText) findViewById(R.id.EtPass);
		String struser, strpass;
		struser = user.getText().toString();
		strpass = pass.getText().toString();
		
		if (struser.equals(USER) && strpass.equals(PASS)) {
			//Something to do
			Intent inte = new Intent(this, Finish.class);
			inte.putExtra("OKAY", true);
			startActivity(inte);
		} else {
			
			Intent inte = new Intent(this, Finish.class);
			inte.putExtra("OKAY", false);
			startActivity(inte);
		}
	}
	
	public void loginFacebook(View view)
	{
		Intent inte = new Intent(this, FaceLogin.class);
		startActivity(inte);
	}
	
	private static final String USER = "oscar";
	private static final String PASS = "12345";
}
