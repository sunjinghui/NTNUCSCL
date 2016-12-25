package com.dsmynas.filecooperation.ntnucscl;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
public class MakeVideoActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_video);
        FragmentTabHost tabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(), R.id.container);
        //1
        tabHost.addTab(tabHost.newTabSpec("Tab1")
                        .setIndicator("Tab1"),
                Tab1.class,
                null);
        //2
        tabHost.addTab(tabHost.newTabSpec("Tab2")
                        .setIndicator("Tab2"),
                Tab2.class,
                null);
        //3
        tabHost.addTab(tabHost.newTabSpec("Tab3")
                        .setIndicator("Tab3"),
                Tab3.class,
                null);
    }
    /**************************
     *
     * 給子頁籤呼叫用
     *
     **************************/
    public String getTab1(){
        return "Apple 123";
    }
    public String getTab2(){
        return "Google 456";
    }
    public String getTab3(){
        return "Facebook 789";
    }
}