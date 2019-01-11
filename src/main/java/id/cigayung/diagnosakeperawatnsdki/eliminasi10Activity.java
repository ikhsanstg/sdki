package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class eliminasi10Activity extends AppCompatActivity {

    WebView webvieweliminasi10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminasi10);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webvieweliminasi10 =(WebView) findViewById(R.id.webvieweliminasi10);
        webvieweliminasi10.getSettings().setBuiltInZoomControls(true);
        webvieweliminasi10.loadUrl("file:///android_asset/eliminasi10.html");

        WebSettings webSettings = webvieweliminasi10.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}