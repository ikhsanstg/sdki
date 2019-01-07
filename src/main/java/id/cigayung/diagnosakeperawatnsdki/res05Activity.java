package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class res05Activity extends AppCompatActivity {

    WebView webviewres05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res05);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewres05 =(WebView) findViewById(R.id.webviewres05);
        webviewres05.getSettings().setBuiltInZoomControls(true);
        webviewres05.loadUrl("file:///android_asset/res5.html");

        WebSettings webSettings = webviewres05.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}