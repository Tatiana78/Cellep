package br.com.tatiana.estacaohack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web.*

class WebActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)


        wbvWeb.settings.javaScriptEnabled = true
        wbvWeb.loadUrl("http://br.cellep.com")
    }
}
