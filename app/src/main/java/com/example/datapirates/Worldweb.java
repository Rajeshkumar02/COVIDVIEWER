package com.example.datapirates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Worldweb extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worldweb);

        getSupportActionBar().hide();//hides actionbar

        webView=findViewById(R.id.web2);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.worldometers.info/coronavirus/?utm_campaign=homeAdvegas1?");

        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override

    public void onBackPressed(){
        if(webView.canGoBack()){
            webView.goBack();
        }
        else {

            super.onBackPressed();
        }
    }
}