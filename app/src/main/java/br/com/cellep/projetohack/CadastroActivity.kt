package br.com.tatiana.estacaohack

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_cadastro.view.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        //Criando o SharedPreferences
        val minhaPreferencia = getSharedPreferences("cadastro", Context.MODE_PRIVATE)
        //Criando o editor do SharedPreferences
        val meuEditor = minhaPreferencia.edit()

        //Criando a lista de sexo
        val listaSexo = arrayListOf("Selecione o sexo", "Feminino", "Masculino")

        //Criando o adapter
        val sexoAdapter = ArrayAdapter(
            this@CadastroActivity,
            android.R.layout.simple_spinner_dropdown_item,
            listaSexo
        )

        //Adicionar o adapter no Spinner
        spnSexo.adapter = sexoAdapter

        btnCadastrar.setOnClickListener {
            val nome = edtNome.text.toString().trim()
            val sobrenome = edtSobrenome.text.toString().trim()
            val email = edtEmail.text.toString().trim().toLowerCase()
            val senha = edtSenha.text.toString().trim()

            if(nome.isEmpty() || sobrenome.isEmpty() || email.isEmpty() || senha.isEmpty()){
                Toast.makeText(this@CadastroActivity, "Preencha todos os campos!", Toast.LENGTH_LONG).show()
            }else if(spnSexo.selectedItem == "Selecione o sexo"){
                Toast.makeText(this@CadastroActivity, "Sexo não selecionado!", Toast.LENGTH_LONG).show()
            }else{
                meuEditor.putString("nome", nome).apply()
                meuEditor.putString("sobrenome", sobrenome).apply()
                meuEditor.putString("email", email).apply()
                meuEditor.putString("senha", senha).apply()
                meuEditor.putString("sexo", spnSexo.selectedItem.toString()).apply()

                AlertDialog.Builder(this@CadastroActivity)
                    .setTitle("Sucesso!")
                    .setMessage("Usuário cadastrado!")
                    .setPositiveButton("Ok"){_,_ ->
                        startActivity(Intent(this@CadastroActivity, MainActivity::class.java))
                    }
                    .setCancelable(false)
                    .create()
                    .show()
            }

        }

    }
}
