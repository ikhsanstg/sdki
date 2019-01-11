package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class eliminasi8Activity extends AppCompatActivity {

    WebView webvieweliminasi8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminasi8);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webvieweliminasi8 =(WebView) findViewById(R.id.webvieweliminasi8);
        webvieweliminasi8.getSettings().setBuiltInZoomControls(true);
        webvieweliminasi8.loadUrl("file:///android_asset/eliminasi8.html");

        WebSettings webSettings = webvieweliminasi8.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}