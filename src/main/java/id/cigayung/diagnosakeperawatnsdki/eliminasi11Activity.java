package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class eliminasi11Activity extends AppCompatActivity {

    WebView webvieweliminasi11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminasi11);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webvieweliminasi11 =(WebView) findViewById(R.id.webvieweliminasi11);
        webvieweliminasi11.getSettings().setBuiltInZoomControls(true);
        webvieweliminasi11.loadUrl("file:///android_asset/eliminasi11.html");

        WebSettings webSettings = webvieweliminasi11.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}