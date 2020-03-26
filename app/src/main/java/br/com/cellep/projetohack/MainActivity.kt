package br.com.tatiana.estacaohack

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Abrindo o SharedPreferences
        val minhaPreferencia = getSharedPreferences("cadastro", Context.MODE_PRIVATE)

        val nome = minhaPreferencia.getString("nome","Erro Preference")
        val email = minhaPreferencia.getString("email","Erro Preference")
        val sobrenome = minhaPreferencia.getString("sobrenome","Erro Preference")
        val sexo = minhaPreferencia.getString("sexo","Erro Preference")


        txvNome.text = "$nome $sobrenome"
        txvEmail.text = email
        txvSexo.text = sexo

        btnSair.setOnClickListener {
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            finishAffinity()
        }

        btnWeb.setOnClickListener {
            startActivity(Intent(this@MainActivity, WebActivity::class.java))
        }

    }
}
