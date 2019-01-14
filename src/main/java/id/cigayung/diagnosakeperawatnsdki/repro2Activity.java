package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class repro2Activity extends AppCompatActivity {

    WebView webviewrepro2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repro2);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewrepro2 =(WebView) findViewById(R.id.webviewrepro2);
        webviewrepro2.getSettings().setBuiltInZoomControls(true);
        webviewrepro2.loadUrl("file:///android_asset/repro2.html");

        WebSettings webSettings = webviewrepro2.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}