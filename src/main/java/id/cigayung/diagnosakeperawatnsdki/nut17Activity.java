package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class nut17Activity extends AppCompatActivity {

    WebView webviewnut17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut17);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewnut17 =(WebView) findViewById(R.id.webviewnut17);
        webviewnut17.getSettings().setBuiltInZoomControls(true);
        webviewnut17.loadUrl("file:///android_asset/nut17.html");

        WebSettings webSettings = webviewnut17.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}