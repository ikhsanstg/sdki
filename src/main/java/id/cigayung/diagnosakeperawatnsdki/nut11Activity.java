package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class nut11Activity extends AppCompatActivity {

    WebView webviewnut11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut11);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewnut11 =(WebView) findViewById(R.id.webviewnut11);
        webviewnut11.getSettings().setBuiltInZoomControls(true);
        webviewnut11.loadUrl("file:///android_asset/nut11.html");

        WebSettings webSettings = webviewnut11.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}