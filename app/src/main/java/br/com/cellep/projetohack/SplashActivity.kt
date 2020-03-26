package br.com.tatiana.estacaohack


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Função que pausa a execução
        Handler().postDelayed({

            //Criando uma intent
            val intent = Intent(this@SplashActivity, LoginActivity::class.java)

            //Executando a intent
            startActivity(intent)

        },5000)
    }
}
