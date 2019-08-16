package com.example.joanadobts.ciceroavalia

import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.logintest.DebugActivity
import kotlinx.android.synthetic.main.gestao.*
import kotlinx.android.synthetic.main.oberdan.*

class Gestao : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gestao)

        val nomes = arrayOf("Aldineide", "Clarissa", "Marilia", "Vilma")


        val adapter = ArrayAdapter(
            this, android.R.layout.simple_spinner_dropdown_item,
            nomes
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerGestao.adapter = adapter
    }
}