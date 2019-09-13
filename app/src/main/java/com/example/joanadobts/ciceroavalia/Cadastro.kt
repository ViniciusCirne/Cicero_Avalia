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
import kotlinx.android.synthetic.main.cadastroo.*

class Cadastro : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cadastroo)

        var buttonSign = findViewById<Button>(R.id.button5)
        var voltarMenu = findViewById<Button>(R.id.button6)
        var login = editText.text.toString()
        var senha = editText2.text.toString()

        buttonSign.setOnClickListener {

            val db = FirebaseFirestore.getInstance()
            val objeto = mapOf<String, Any>("usuario" to login, "senha" to senha)
            db.collection("usuarios").document().set(objeto).addOnSuccessListener {

                Log.d("BANCODEDADOS", "Usuário gravado com sucesso")
            }
                .addOnFailureListener{

                    Log.d("BANCODEDADOS", "Houve uma falha em gravar o usuário")
                }

        }
        voltarMenu.setOnClickListener {

            val nextIntent = Intent(this, MainActivity::class.java)
            startActivity(nextIntent)
        }

    }
}



