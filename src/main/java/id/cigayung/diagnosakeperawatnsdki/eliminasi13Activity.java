package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class eliminasi13Activity extends AppCompatActivity {

    WebView webvieweliminasi13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminasi13);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webvieweliminasi13 =(WebView) findViewById(R.id.webvieweliminasi13);
        webvieweliminasi13.getSettings().setBuiltInZoomControls(true);
        webvieweliminasi13.loadUrl("file:///android_asset/eliminasi13.html");

        WebSettings webSettings = webvieweliminasi13.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}