package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class sir8Activity extends AppCompatActivity {

    WebView webviewsir8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sir8);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewsir8 =(WebView) findViewById(R.id.webviewsir8);
        webviewsir8.getSettings().setBuiltInZoomControls(true);
        webviewsir8.loadUrl("file:///android_asset/sir7.html");

        WebSettings webSettings = webviewsir8.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}