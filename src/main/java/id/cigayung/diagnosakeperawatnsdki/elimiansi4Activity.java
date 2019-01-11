package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class elimiansi4Activity extends AppCompatActivity {

    WebView webvieweliminasi4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elimiansi4);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webvieweliminasi4 =(WebView) findViewById(R.id.webvieweliminasi4);
        webvieweliminasi4.getSettings().setBuiltInZoomControls(true);
        webvieweliminasi4.loadUrl("file:///android_asset/eliminasi4.html");

        WebSettings webSettings = webvieweliminasi4.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}