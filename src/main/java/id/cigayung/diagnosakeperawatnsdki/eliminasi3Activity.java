package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class eliminasi3Activity extends AppCompatActivity {

    WebView webvieweliminasi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminasi3);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webvieweliminasi3 =(WebView) findViewById(R.id.webvieweliminasi3);
        webvieweliminasi3.getSettings().setBuiltInZoomControls(true);
        webvieweliminasi3.loadUrl("file:///android_asset/eliminasi3.html");

        WebSettings webSettings = webvieweliminasi3.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}