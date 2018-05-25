package com.example.dave.lists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        WebView browser = findViewById(R.id.webView);
        int data=getIntent().getIntExtra("data",0);

        if (data==0){
            browser.loadUrl("file:///android_asset/untitled/1.html");
        }
        else if (data==1){
            browser.loadUrl("file:///android_asset/untitled/2.html");
            }
        else if (data==2){
            browser.loadUrl("file:///android_asset/untitled/3.html");
        }
        else if (data==3){
            browser.loadUrl("file:///android_asset/untitled/4.html");
        }
        else if (data==4){
            browser.loadUrl("file:///android_asset/untitled/5.html");
        }

        else if (data==6){
            browser.loadUrl("file:///android_asset/untitled/7.html");
        }
        else if (data==7){
            browser.loadUrl("file:///android_asset/untitled/8.html");
        }

    }
}
