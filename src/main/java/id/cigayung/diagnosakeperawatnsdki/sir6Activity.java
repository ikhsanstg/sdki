package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class sir6Activity extends AppCompatActivity {

    WebView webviewsir6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sir6);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewsir6 =(WebView) findViewById(R.id.webviewsir6);
        webviewsir6.getSettings().setBuiltInZoomControls(true);
        webviewsir6.loadUrl("file:///android_asset/sir5.html");

        WebSettings webSettings = webviewsir6.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}