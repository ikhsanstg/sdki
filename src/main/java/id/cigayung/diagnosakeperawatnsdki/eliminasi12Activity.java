package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class eliminasi12Activity extends AppCompatActivity {

    WebView webvieweliminasi12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminasi12);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webvieweliminasi12 =(WebView) findViewById(R.id.webvieweliminasi12);
        webvieweliminasi12.getSettings().setBuiltInZoomControls(true);
        webvieweliminasi12.loadUrl("file:///android_asset/eliminasi12.html");

        WebSettings webSettings = webvieweliminasi12.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}