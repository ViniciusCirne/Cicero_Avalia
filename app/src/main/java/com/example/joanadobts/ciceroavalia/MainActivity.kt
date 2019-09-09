package com.example.joanadobts.ciceroavalia

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.logintest.DebugActivity
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonLogin = findViewById<Button>(R.id.buttonEntrar)
        var buttonCadastro = findViewById<Button>(R.id.buttonCadastrar)
        var tLogin = findViewById<EditText>(R.id.tLog)
        var tPassword = findViewById<EditText>(R.id.tPass)

        buttonLogin.setOnClickListener {

            var login = tLogin.text.toString()
            var senha = tPassword.text.toString()

            if (login.toLowerCase() == "denilson" && senha == "nave19") {

                val intent = Intent(this, BemVindo::class.java)
                val params = Bundle()
                params.putString("usuario", login)
                intent.putExtras(params)
                startActivity(intent)
            } else {

                Toast.makeText(this, "login e/ou senha incorretos", Toast.LENGTH_LONG).show()
            }

        }
        buttonCadastro.setOnClickListener{

            val nextIntent = Intent(this, Cadastro::class.java)
            startActivity(nextIntent)
        }

        val db = FirebaseFirestore.getInstance()
        val objeto = mapOf<String, Any>("usuario" to tLogin, "senha" to tPassword)
        db.collection("usuarios").document().set(objeto).addOnSuccessListener {

            Log.d("BANCODEDADOS", "Usuário gravado com sucesso")
        }
            .addOnFailureListener{

                Log.d("BANCODEDADOS", "Houve uma falha em gravar o usuário")
            }


    }
}
