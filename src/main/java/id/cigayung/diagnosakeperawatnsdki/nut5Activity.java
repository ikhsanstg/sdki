package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class nut5Activity extends AppCompatActivity {

    WebView webviewnut5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut5);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewnut5 =(WebView) findViewById(R.id.webviewnut5);
        webviewnut5.getSettings().setBuiltInZoomControls(true);
        webviewnut5.loadUrl("file:///android_asset/nut5.html");

        WebSettings webSettings = webviewnut5.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}