package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class neuro3Activity extends AppCompatActivity {

    WebView webviewneuro3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neuro3);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewneuro3 =(WebView) findViewById(R.id.webviewneuro3);
        webviewneuro3.getSettings().setBuiltInZoomControls(true);
        webviewneuro3.loadUrl("file:///android_asset/neuro3.html");

        WebSettings webSettings = webviewneuro3.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}