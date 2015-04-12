package com.drc.scroll;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SlidingDrawer;

public class TempAppActivity extends Activity {
    /** Called when the activity is first created. */
//    private Button btnClick = null, btnHandler = null;
//    private SlidingDrawer mSliding = null;
//	private ListView NameList = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textview_with_scroll);
 /*       final ListView lstNews = (ListView)findViewById(R.id.lstName);
        
        Button mBtnRight = (Button)findViewById(R.id.btnRight);
        mBtnRight.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (lstNews.getVisibility() == 0) {
					lstNews.setVisibility(lstNews.GONE);
				}else{
					lstNews.setVisibility(lstNews.VISIBLE);
				}
			}
		});
        
        ArrayAdapter<String> nm = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        nm.add("hellow");	nm.add("asdf");	nm.add("asdf");	nm.add("helhgjdflow");
        nm.add("hwerellow");	nm.add("sdf");	nm.add("df");	nm.add("dfg");
        nm.add("sdf");	nm.add("heldfslow");	nm.add("fds");	nm.add("helsdflow");
        lstNews.setAdapter(nm);*/
//        setContentView(R.layout.sdown);
//        
//        
//       mSliding = (SlidingDrawer)findViewById(R.id.sDrawer);
//       mSliding.toggle();
//        
//        //btnHandler = (Button)findViewById(R.id.btnHandle);
//        
//        
////        btnClick.setOnClickListener(new View.OnClickListener() {
////			
////			public void onClick(View v) {
////				System.out.println("HEllow");
////				mSliding.setVisibility(mSliding.VISIBLE);
////				mSliding.toggle();
////			}
////		});
//        
//        NameList = (ListView)findViewById(R.id.lstName);
//        ArrayAdapter<String> nm = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
//        nm.add("abc,dkefe");	nm.add("abc,dkefe");	nm.add("abc,dkefe");	nm.add("kjhkghjk");
//        nm.add("fasdf abc,dkefe");	nm.add("abc,dkefe");	nm.add("abc,dkefe");	nm.add("aasdf");
//        NameList.setAdapter(nm);
        
        

    }
}