package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ego0Activity extends AppCompatActivity {

    WebView webviewego0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ego0);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewego0 =(WebView) findViewById(R.id.webviewego0);
        webviewego0.getSettings().setBuiltInZoomControls(true);
        webviewego0.loadUrl("file:///android_asset/ego0.html");

        WebSettings webSettings = webviewego0.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}