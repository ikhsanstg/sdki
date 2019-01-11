package id.cigayung.diagnosakeperawatnsdki;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class infoActivity extends AppCompatActivity {

    WebView webviewinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        webviewinfo =(WebView) findViewById(R.id.webviewinfo);
        webviewinfo.getSettings().setBuiltInZoomControls(true);
        webviewinfo.loadUrl("file:///android_asset/info.html");

        WebSettings webSettings = webviewinfo.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}