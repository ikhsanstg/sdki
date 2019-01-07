package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class sir11Activity extends AppCompatActivity {

    WebView webviewsir11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sir11);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewsir11 =(WebView) findViewById(R.id.webviewsir11);
        webviewsir11.getSettings().setBuiltInZoomControls(true);
        webviewsir11.loadUrl("file:///android_asset/sir9.html");

        WebSettings webSettings = webviewsir11.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}