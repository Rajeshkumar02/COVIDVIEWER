package com.example.datapirates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Indiaweb extends AppCompatActivity {
private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indiaweb);
        getSupportActionBar().hide();//hides actionbar

        webView=findViewById(R.id.web1);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.covid19india.org/");

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