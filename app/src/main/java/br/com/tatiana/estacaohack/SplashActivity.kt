package br.com.tatiana.estacaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Criando a Intenção de ir para LoginActivity
        val intentTelaLogin = Intent(this@SplashActivity, LoginActivity::class.java)


        Handler().postDelayed({
            //Iniciando a LoginActivity (executando intentTelaLogin)
            startActivity (intentTelaLogin)
            //Finalizando esta activity
            finish()

        },3000)




    }
}
