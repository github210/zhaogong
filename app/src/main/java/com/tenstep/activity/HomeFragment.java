package com.tenstep.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.tenstep.R;

/**
 * Created by Administrator on 2016-1-11 0011.
 */
public class HomeFragment extends Fragment  {
   // private WebView webView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.home,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
/*        super.onViewCreated(view, savedInstanceState);
        webView=(WebView)view.findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://zhaogongshenqi.com:8081/tenstepserver/araise/Rule.jsp");*/

    }
}
