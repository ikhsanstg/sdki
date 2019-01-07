package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Mres04Activity extends AppCompatActivity {

    WebView webviewres04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mres04);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewres04 =(WebView) findViewById(R.id.webviewres04);
        webviewres04.getSettings().setBuiltInZoomControls(true);
        webviewres04.loadUrl("file:///android_asset/res4.html");

        WebSettings webSettings = webviewres04.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}