package com.example.joanadobts.ciceroavalia

import android.annotation.TargetApi
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Build

import android.os.Bundle

import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import com.example.logintest.DebugActivity
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.oberdan.*
import java.util.*

class Oberdan : DebugActivity() {

    @TargetApi(Build.VERSION_CODES.N)
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oberdan)
        var buttonConcluir = findViewById<Button>(R.id.ratingDone)
        val nomes = arrayOf("LP", "CJD", "PI1", "PAD1", "PAD2")

        lateinit var avaliacaoText: TextInputLayout
        lateinit var ratingBar1: RatingBar
        lateinit var ratingBar2: RatingBar
        lateinit var ratingBar3: RatingBar
        lateinit var ratingBar4: RatingBar

        val calendario = Calendar.getInstance()
        val ano = calendario.get(Calendar.YEAR)
        val mes = calendario.get(Calendar.MONTH)
        val dia = calendario.get(Calendar.DAY_OF_MONTH)
        //val recuperaIntent = intent.getParcelableExtra<Professor>("nome")
        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

            dateText.setText("" + dayOfMonth + " " + monthOfYear + ", " + year)
        }, ano, mes, dia)

        dpd.show()

        val int = ratingBar.getNumStars()

        val adapter = ArrayAdapter( this, android.R.layout.simple_spinner_dropdown_item,
            nomes)

        adapter.setDropDownViewResource(android.R.layout. simple_spinner_dropdown_item)
        spinnerOberdan.adapter = adapter

        var buttonVoltar = findViewById<Button>(R.id.button4)

        buttonVoltar.setOnClickListener {

            val nextIntent = Intent(this, Professores::class.java)
            startActivity(nextIntent)
        }
        buttonConcluir.setOnClickListener {

            saveAvaliacao()
            Toast.makeText(this, "Avaliação salva com sucesso", Toast.LENGTH_LONG).show()
        }

        avaliacaoText = findViewById(R.id.textInputEditText)
        ratingBar1 = findViewById(R.id.ratingBar)
        ratingBar2 = findViewById(R.id.ratingBar2)
        ratingBar3 = findViewById(R.id.ratingBar3)
        ratingBar4 = findViewById(R.id.ratingBar4)

    }

    private fun saveAvaliacao(){

        val avaliacao = textInputEditText.text.toString().trim()

        if (avaliacao.isEmpty())
        {
            textInputEditText.error = "Por favor, insira um complemento a sua avaliação"
            return
        }
        val ref = FirebaseDatabase.getInstance().getReference("avaliacoes")
        val avaliacaoidenti: String = ref.push().key.toString()

        val ava = ProfessorAttributes(avaliacao, ratingBar.numStars, avaliacaoidenti)
        ref.child(avaliacaoidenti).setValue(ava).addOnCompleteListener{
            Toast.makeText(applicationContext, "Avaliacao salva com sucesso", Toast.LENGTH_LONG).show()
        }

    }


}



