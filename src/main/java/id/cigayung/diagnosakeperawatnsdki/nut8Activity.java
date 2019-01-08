package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class nut8Activity extends AppCompatActivity {

    WebView webviewnut8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut8);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewnut8 =(WebView) findViewById(R.id.webviewnut8);
        webviewnut8.getSettings().setBuiltInZoomControls(true);
        webviewnut8.loadUrl("file:///android_asset/nut8.html");

        WebSettings webSettings = webviewnut8.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}