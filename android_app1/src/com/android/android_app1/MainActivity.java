package com.android.android_app1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button button;
	private MyApp myApp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button=(Button)this.findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				myApp=(MyApp)getApplication();
				myApp.setName("jack");//修改之后的appname
				Intent intent=new Intent(MainActivity.this,OtherActivity.class);
				startActivity(intent);
			}
			
		});
	}

	
}
