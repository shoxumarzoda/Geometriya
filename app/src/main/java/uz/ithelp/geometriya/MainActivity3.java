package uz.ithelp.geometriya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity3 extends AppCompatActivity {

    WebView webView1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        webView1 = findViewById(R.id.webView1);
        WebSettings webSettings = webView1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        Intent intent  = getIntent();
        if (intent.getExtras() != null) {

            webView1.loadUrl(intent.getStringExtra("data"));

        }

    }
}