package com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.SearchView
import android.widget.Toast
import com.example.widgetofsearchviewonhomescreen.R

class SearchableActivity : AppCompatActivity(), SearchView.OnQueryTextListener
{
    lateinit var searchView: SearchView
    lateinit var webView:WebView
            override fun onCreate(savedInstanceState: Bundle?)
            {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.new_app_widget)
                // set up your search view widget here
                searchView=findViewById(R.id.searchview)
                webView=findViewById(R.id.webview)
            }

            override fun onQueryTextSubmit(query: String?): Boolean
            {
                // handle the search query here
                webView.loadUrl("https://www.google.com/search?q="+searchView.getQuery())
//                searchView.clearFocus()
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean
            {
                // handle changes to the search query here
                return false
            }
}
