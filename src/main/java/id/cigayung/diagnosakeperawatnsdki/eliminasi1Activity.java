package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class eliminasi1Activity extends AppCompatActivity {

    WebView webviewelimiasi1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminasi1);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webviewelimiasi1 =(WebView) findViewById(R.id.webviewelimiansi1);
        webviewelimiasi1.getSettings().setBuiltInZoomControls(true);
        webviewelimiasi1.loadUrl("file:///android_asset/eliminasi1.html");

        WebSettings webSettings = webviewelimiasi1.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}