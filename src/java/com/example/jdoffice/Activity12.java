package com.example.jdoffice;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class Activity12 extends AppCompatActivity {
    private WebView webView;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12);
        this.webView = (WebView) findViewById(R.id.webview);
        this.webView.setWebViewClient(new WebViewClient());
        this.webView.loadUrl("https://sites.google.com/view/contactus3");
        this.webView.getSettings().setJavaScriptEnabled(true);
    }
}
