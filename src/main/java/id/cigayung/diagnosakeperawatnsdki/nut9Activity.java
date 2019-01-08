package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class nut9Activity extends AppCompatActivity {

    WebView webviewnut9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut9);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewnut9 =(WebView) findViewById(R.id.webviewnut9);
        webviewnut9.getSettings().setBuiltInZoomControls(true);
        webviewnut9.loadUrl("file:///android_asset/nut9.html");

        WebSettings webSettings = webviewnut9.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}