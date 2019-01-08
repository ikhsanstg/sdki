package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class nut20Activity extends AppCompatActivity {

    WebView webviewnut20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut20);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewnut20 =(WebView) findViewById(R.id.webviewnut20);
        webviewnut20.getSettings().setBuiltInZoomControls(true);
        webviewnut20.loadUrl("file:///android_asset/nut20.html");

        WebSettings webSettings = webviewnut20.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}