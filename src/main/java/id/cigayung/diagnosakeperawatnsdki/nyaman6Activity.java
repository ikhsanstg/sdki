package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class nyaman6Activity extends AppCompatActivity {

    WebView webviewnyaman6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nyaman6);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewnyaman6 =(WebView) findViewById(R.id.webviewnyaman6);
        webviewnyaman6.getSettings().setBuiltInZoomControls(true);
        webviewnyaman6.loadUrl("file:///android_asset/nyaman6.html");

        WebSettings webSettings = webviewnyaman6.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}