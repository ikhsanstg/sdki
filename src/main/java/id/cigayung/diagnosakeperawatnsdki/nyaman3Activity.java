package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class nyaman3Activity extends AppCompatActivity {

    WebView webviewnyaman3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nyaman3);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewnyaman3 =(WebView) findViewById(R.id.webviewnyaman3);
        webviewnyaman3.getSettings().setBuiltInZoomControls(true);
        webviewnyaman3.loadUrl("file:///android_asset/nyaman3.html");

        WebSettings webSettings = webviewnyaman3.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}