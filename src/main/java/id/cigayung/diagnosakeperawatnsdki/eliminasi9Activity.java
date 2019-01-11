package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class eliminasi9Activity extends AppCompatActivity {

    WebView webvieweliminasi9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eliminasi9);
        ActionBar actionBar = getSupportActionBar();


        //get data from previous activity when item of listview is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
        actionBar.setTitle(mActionBarTitle);
        //set text in textview

        webvieweliminasi9 =(WebView) findViewById(R.id.webvieweliminasi9);
        webvieweliminasi9.getSettings().setBuiltInZoomControls(true);
        webvieweliminasi9.loadUrl("file:///android_asset/eliminasi9.html");

        WebSettings webSettings = webvieweliminasi9.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}