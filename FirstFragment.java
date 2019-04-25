package com.roop.AgriKisaan;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class FirstFragment extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_first_fragment);
//    }
//}

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements MyListener{


    WebView webView;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_first_fragment, container, false);

        webView = view.findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.videvo.net/videvo_files/converted/2016_01/preview/Seedlings_15_1_Videvo.mov77988.webm");

        return view;
    }

    @Override
    public void newsHandler(int position) {
        switch (position){
            case 0:
                webView.loadUrl("https://www.videvo.net/videvo_files/converted/2016_01/preview/Seedlings_15_1_Videvo.mov77988.webm");
                break;

            case 1:
                webView.loadUrl("https://edition.cnn.com/");
                break;

            case 2:
                webView.loadUrl("https://www.ndtv.com/");
                break;

            case 3:
                webView.loadUrl("https://www.ndtv.com/");
                break;

            case 4:
                webView.loadUrl("https://www.ptcpunjabi.co.in/");
                break;
        }
    }
}
