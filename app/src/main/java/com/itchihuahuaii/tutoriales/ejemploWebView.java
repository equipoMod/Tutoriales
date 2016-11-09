package com.itchihuahuaii.tutoriales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ejemploWebView extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_web_view);
        webView = (WebView)findViewById(R.id.web_webview);

        webView.loadUrl("http:///facebook.com.mx");
        webView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view ,String url){
                return false;
            }
        }

        );

    }
}
