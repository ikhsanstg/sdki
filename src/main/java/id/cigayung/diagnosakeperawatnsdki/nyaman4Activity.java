package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class nyaman4Activity extends AppCompatActivity {

    WebView webviewnyaman4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nyaman4);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewnyaman4 =(WebView) findViewById(R.id.webviewnyaman4);
        webviewnyaman4.getSettings().setBuiltInZoomControls(true);
        webviewnyaman4.loadUrl("file:///android_asset/nyaman4.html");

        WebSettings webSettings = webviewnyaman4.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}