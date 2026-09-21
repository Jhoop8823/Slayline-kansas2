package com.slayline.kansas;
import android.app.*;
import android.os.*;
import android.webkit.*;
import android.view.*;
import android.content.*;
import android.net.Uri;
import android.provider.Settings;

public class MainActivity extends Activity {
  WebView web;
  @Override public void onCreate(Bundle b){
    super.onCreate(b);
    web=new WebView(this);
    WebSettings s=web.getSettings();
    s.setJavaScriptEnabled(true);
    s.setDomStorageEnabled(true);
    s.setAllowFileAccess(true);
    s.setAllowContentAccess(true);
    web.setWebViewClient(new WebViewClient());
    web.setWebChromeClient(new WebChromeClient());
    web.loadUrl("file:///android_asset/index.html");
    setContentView(web);
  }
  @Override public void onBackPressed(){
    if(web.canGoBack()) web.goBack(); else super.onBackPressed();
  }
}
