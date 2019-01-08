package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class nut7Activity extends AppCompatActivity {

    WebView webviewnut7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut7);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewnut7 =(WebView) findViewById(R.id.webviewnut7);
        webviewnut7.getSettings().setBuiltInZoomControls(true);
        webviewnut7.loadUrl("file:///android_asset/nut7.html");

        WebSettings webSettings = webviewnut7.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}