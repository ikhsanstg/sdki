package id.cigayung.diagnosakeperawatnsdki;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ketentuanActivity extends AppCompatActivity {

    WebView webviewresketentuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ketentuan);


        webviewresketentuan =(WebView) findViewById(R.id.webviewketentuan);
        webviewresketentuan.getSettings().setBuiltInZoomControls(true);
        webviewresketentuan.loadUrl("file:///android_asset/ketentuan.html");

        WebSettings webSettings = webviewresketentuan.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}