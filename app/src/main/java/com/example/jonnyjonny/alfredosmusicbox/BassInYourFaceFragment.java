package com.example.jonnyjonny.alfredosmusicbox;


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
public class BassInYourFaceFragment extends Fragment {
    private WebView webView;


    public BassInYourFaceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_bass_in_your_face, container, false);
       webView=(WebView)view.findViewById(R.id.webView);
       webView.getSettings().setJavaScriptEnabled(true);
       webView.setWebViewClient(new WebViewClient());
       webView.loadUrl("https://youtu.be/eKzjvIs1cv8");
       return view;

    }


}
