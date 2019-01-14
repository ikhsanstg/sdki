package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class aktivis4Activity extends AppCompatActivity {

    WebView webviewaktivis4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivis4);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewaktivis4 =(WebView) findViewById(R.id.webviewaktivis4);
        webviewaktivis4.getSettings().setBuiltInZoomControls(true);
        webviewaktivis4.loadUrl("file:///android_asset/aktivis4.html");

        WebSettings webSettings = webviewaktivis4.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}