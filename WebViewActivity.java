package com.roop.AgriKisaan;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class WebViewActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_web_view);
//    }
//}
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {


    WebView webView;

    void initViews(){

        Intent rcv = getIntent();
//        News news = (News)rcv.getSerializableExtra("keyNews");
Experts experts = (Experts)rcv.getSerializableExtra("keyExperts");


        //getSupportActionBar().setTitle("Amazon");
        //getSupportActionBar().hide();
//        getSupportActionBar().setTitle(news.title);
        getSupportActionBar().setTitle(experts.name);

        webView = findViewById(R.id.webView);

        //WebViewClient client = new WebViewClient();
        //webView.setWebViewClient(client);
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);

        //webView.loadUrl("https://www.google.co.in");
        //webView.loadUrl("https://www.amazon.in/");
        //webView.loadUrl("https://www.ndtv.com/");
//        webView.loadUrl(news.url);
        webView.loadUrl(experts.branch);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        initViews();
    }
}