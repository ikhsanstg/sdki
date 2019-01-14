package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class aktivis6Activity extends AppCompatActivity {

    WebView webviewaktivis6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktivis6);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewaktivis6 =(WebView) findViewById(R.id.webviewaktivis6);
        webviewaktivis6.getSettings().setBuiltInZoomControls(true);
        webviewaktivis6.loadUrl("file:///android_asset/aktivis6.html");

        WebSettings webSettings = webviewaktivis6.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}