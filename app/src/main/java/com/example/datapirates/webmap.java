package com.example.datapirates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webmap extends AppCompatActivity {
    private WebView webView0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webmap);
        getSupportActionBar().hide();//hides actionbar

        webView0=findViewById(R.id.web0);
        webView0.setWebViewClient(new WebViewClient());
        webView0.loadUrl("https://news.google.com/covid19/map?hl=en-IN&gl=IN&ceid=IN%3Aen");

        WebSettings webSettings=webView0.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    @Override

    public void onBackPressed(){
        if(webView0.canGoBack()){
            webView0.goBack();
        }
        else {

            super.onBackPressed();
        }
    }
}