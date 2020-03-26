package br.com.tatiana.estacaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

            /**
             * Criar uma variável de aopio para a mensagem
             */
            var mensagem:String = ""

            //Condição para verificar se usuario ou senha estão corretos
            if (usuario.isEmpty()){
               //Usuario vazio
//                txvResultado.text = "Usuário vazio!"
                /**
                 *Adicionar a mensagem do TextView para a variável de apoio
                 * e apagar ou comentar o TextView
                 */
                mensagem = "Usuário vazio!"
            }else if(senha.isEmpty()){
                //Senha vazia
//                txvResultado.text = "Senha vazia!"
                /**
                 *Adicionar a mensagem do TextView para a variável de apoio
                 * e apagar ou comentar o TextView
                 */
                mensagem = "Senha vazia!"
            }else if(usuario == "Adm"){
                if(senha == "1234"){
                    startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                }else{
                    //Senha incorreta
//                    txvResultado.text = "Senha incorreta!"
                    /**
                     *Adicionar a mensagem do TextView para a variável de apoio
                     * e apagar ou comentar o TextView
                     */
                    mensagem = "Senha incorreta!"
                }
            }else{
                //Usuario incorreto
//                txvResultado.text = "Usuario incorreto!"
                /**
                 *Adicionar a mensagem do TextView para a variável de apoio
                 * e apagar ou comentar o TextView
                 */
                mensagem = "Usuario incorreto!"
            }

            /**
            *Criando o Toast para apresentar as mensagens no lugar do TextView
            *Obs: Criar um único Toast para otimizar o código
             */
            Toast.makeText(this@LoginActivity, mensagem, Toast.LENGTH_LONG).show()
        }
        //Criando o clique do botão cadastrar
        btnCadastrar.setOnClickListener {
            //Abrindo a tela de cadastro
            startActivity(Intent(this@LoginActivity, CadastroActivity::class.java))
        }

    }
}
