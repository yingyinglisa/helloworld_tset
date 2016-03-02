package com.android.android_app1;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends Activity {
	
	private MyApp myApp;
	private TextView textView;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		textView=(TextView)this.findViewById(R.id.msg);
		myApp=(MyApp)getApplication();
		textView.setText("appname-->"+myApp.getName());
		
	}
}
