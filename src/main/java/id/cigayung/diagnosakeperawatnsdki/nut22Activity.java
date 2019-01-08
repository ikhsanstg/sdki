package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class nut22Activity extends AppCompatActivity {

    WebView webviewnut22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut22);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewnut22 =(WebView) findViewById(R.id.webviewnut22);
        webviewnut22.getSettings().setBuiltInZoomControls(true);
        webviewnut22.loadUrl("file:///android_asset/nut22.html");

        WebSettings webSettings = webviewnut22.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}