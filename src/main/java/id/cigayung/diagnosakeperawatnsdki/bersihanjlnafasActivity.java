package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class bersihanjlnafasActivity extends AppCompatActivity {

    WebView webviewres01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bersihanjlnafas);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewres01 =(WebView) findViewById(R.id.webviewres01);
        webviewres01.getSettings().setBuiltInZoomControls(true);
        webviewres01.loadUrl("file:///android_asset/bersihanjalannafas.html");

        WebSettings webSettings = webviewres01.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}