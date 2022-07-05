package com.example.jdoffice;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class Activity6 extends AppCompatActivity {
    private WebView webView;

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        this.webView = (WebView) findViewById(R.id.webview);
        this.webView.setWebViewClient(new WebViewClient());
        this.webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScIzpniiMj6-kKNabdNNmi1SMdn3eapIF4twgJKOX7VsBJ3qg/viewform");
        this.webView.getSettings().setJavaScriptEnabled(true);
    }
}
