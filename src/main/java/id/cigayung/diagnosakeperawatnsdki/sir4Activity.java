package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class sir4Activity extends AppCompatActivity {

    WebView webviewsir4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sir4);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewsir4 =(WebView) findViewById(R.id.webviewsir4);
        webviewsir4.getSettings().setBuiltInZoomControls(true);
        webviewsir4.loadUrl("file:///android_asset/sir3.html");

        WebSettings webSettings = webviewsir4.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}