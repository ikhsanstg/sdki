package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class res06Activity extends AppCompatActivity {

    WebView webviewres06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res06);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewres06 =(WebView) findViewById(R.id.webviewres06);
        webviewres06.getSettings().setBuiltInZoomControls(true);
        webviewres06.loadUrl("file:///android_asset/res6.html");

        WebSettings webSettings = webviewres06.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}