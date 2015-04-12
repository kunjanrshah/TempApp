package com.drc.scroll;

import android.R.layout;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView.LayoutParams;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DynamicControll_Activity extends Activity implements OnClickListener{
	Button bnt = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		//setContentView(R.layout.dynamic);
		
//		LinearLayout lnrMain = (LinearLayout)findViewById(R.id.lnMain);
//		lnrMain.setOrientation(lnrMain.HORIZONTAL);
//		for(int i =0; i < 5; i++){
//			bnt = new Button(this);
//			bnt.setText("Hello  "+i);
//			bnt.setId(i);
//			bnt.setOnClickListener(this);
//			lnrMain.addView(bnt);
//		}
		getData();
		
		getGrestestnumber();
		
		HorizontalScrollView hView = new HorizontalScrollView(this);
		
		LinearLayout line = new LinearLayout(this);
		hView.addView(line);
		line.setOrientation(line.HORIZONTAL);
		for(int i = 0; i<5; i++){
			LinearLayout linetext = new LinearLayout(this);
			linetext.setOrientation(linetext.VERTICAL);
			Button btn = new Button(this);
			btn.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					System.out.println("Random Number :-- "+(5 + (int)(Math.random() * ((25 - 5) + 1))));
				}
			});
			TextView tv = new TextView(this);
			btn.setText("HI");
			tv.setText("Howaeru");
			tv.setGravity(1);
			btn.setWidth(200);
			btn.setBackgroundResource(R.drawable.icon);
			linetext.addView(btn);
			linetext.addView(tv);
			line.addView(linetext);
		}
		
		setContentView(hView);
	}
	public void onClick(View v) {
		switch (v.getId()) {
		case 1:
			System.out.println("First");
			break;

		default:
			break;
		}
	}
	private CommonClass mClass = new CommonClass();
	public void getData(){
		if(mClass.CheckNetwork(this)){
//			String temp = mClass.PostConnection("http://192.168.0.129/php-projects/pool/client/test?hitesh|music", null);
			String temp = mClass.PostConnection("http://192.168.0.129/php-projects/pool/client/test?hitesh%7Cmusic",null);
			System.out.println("Hitesh :"+temp);
		}
	}
	
	private void getGrestestnumber(){
		float reminder=-1;
		int mValue = 4;
		System.out.println("4Case 1 ="+43%mValue);
		System.out.println("4Case 2 ="+91%mValue);
		System.out.println("4Case 3 ="+183%mValue);
		
		mValue = 7;
		System.out.println("7Case 1 ="+43%mValue);
		System.out.println("7Case 2 ="+91%mValue);
		System.out.println("7Case 3 ="+183%mValue);
		
		mValue = 9;
		System.out.println("9Case 1 ="+43%mValue);
		System.out.println("9Case 2 ="+91%mValue);
		System.out.println("9Case 3 ="+183%mValue);
		
		mValue = 13;
		System.out.println("13Case 1 ="+43%mValue);
		System.out.println("13Case 2 ="+91%mValue);
		System.out.println("13Case 3 ="+183%mValue);
	}
}