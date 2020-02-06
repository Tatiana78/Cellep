package br.com.tatiana.estacaohack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Criando o clique do botão entrar
        btnEntrar.setOnClickListener {
            //Recuperando os valores digitados
            val usuario = edtUsuario.text.toString().trim()
            val senha = edtSenha.text.toString().trim()

            //Condição para verificar se usuário ou senha estão corrreta do valor
            if(usuario.isEmpty()){
                txvResultado.text = "Usuário vazio"
            }else if(senha.isEmpty()){
                txvResultado.text = "Senha vazia"
            }else if (usuario == "Tatiana"){
                if (senha == "1234"){
                    txvResultado.text = "Usuáriio logado"
                }else{
                    txvResultado.text = "Senha Incorreto"
                }
                }else{
                txvResultado.text = "Usuário Incorreto"
            }



        }
    }
}
