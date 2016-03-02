package com.android.android_app1;

import android.app.Application;
import android.os.Bundle;

public class MyApp extends Application {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void onCreate() {
		// TODO 自动生成的方法存根
		super.onCreate();
		setName("张三");
	}
	
	
	

}
