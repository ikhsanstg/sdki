package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class nut18Activity extends AppCompatActivity {

    WebView webviewnut18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut18);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewnut18 =(WebView) findViewById(R.id.webviewnut18);
        webviewnut18.getSettings().setBuiltInZoomControls(true);
        webviewnut18.loadUrl("file:///android_asset/nut18.html");

        WebSettings webSettings = webviewnut18.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}