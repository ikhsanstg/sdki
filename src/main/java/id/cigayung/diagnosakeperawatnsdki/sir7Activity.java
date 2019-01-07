package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class sir7Activity extends AppCompatActivity {

    WebView webviewsir7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sir7);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewsir7 =(WebView) findViewById(R.id.webviewsir7);
        webviewsir7.getSettings().setBuiltInZoomControls(true);
        webviewsir7.loadUrl("file:///android_asset/sir6.html");

        WebSettings webSettings = webviewsir7.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}