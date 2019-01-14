package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class neuro8Activity extends AppCompatActivity {

    WebView webviewneuro8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neuro8);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewneuro8 =(WebView) findViewById(R.id.webviewneuro8);
        webviewneuro8.getSettings().setBuiltInZoomControls(true);
        webviewneuro8.loadUrl("file:///android_asset/neuro8.html");

        WebSettings webSettings = webviewneuro8.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}