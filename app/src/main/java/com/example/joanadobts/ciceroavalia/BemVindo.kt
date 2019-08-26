package com.example.joanadobts.ciceroavalia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.logintest.DebugActivity

class BemVindo : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bemvindo)

        var buttonProf = findViewById<Button>(R.id.buttonProf)
        var buttonGestao = findViewById<Button>(R.id.buttonGestao)

        buttonProf.setOnClickListener {

            val nextIntent = Intent(this, Professores::class.java)
            startActivity(nextIntent)
        }
        buttonGestao.setOnClickListener {

            val nextIntent = Intent(this, Gestao::class.java)
            startActivity(nextIntent)
        }

    }

    val args:Bundle? = intent?.extras
    val nome:String? = args?.getString("usuario")
}



