package br.com.fiap.desafio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Base64
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*


class Main3Activity : AppCompatActivity() {


        private lateinit var webView: WebView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main3)



            webView = findViewById(R.id.webView)
            webView.webViewClient = object : WebViewClient() {
                override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                    view?.loadUrl(url)
                    return true
                }
            }
            webView.getSettings().javaScriptEnabled = true
            webView.getSettings().setAppCacheEnabled(true)
            webView.getSettings().javaScriptCanOpenWindowsAutomatically = true
            webView.getSettings().setAppCachePath(this.cacheDir.path)
            webView.getSettings().cacheMode = WebSettings.LOAD_DEFAULT

            webView.loadUrl("https://www.magazineluiza.com.br/")
        }
    }
