package com.example.joanadobts.ciceroavalia


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_activity.*

class ListActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var viewAdapter: RecyclerView.Adapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_activity)

        var lista = mutableListOf<ProfessoresLista>()
        var foto1 = (R.drawable.avatar_android)
        var foto2 = (R.drawable.avatar_android)
        var foto3 = (R.drawable.avatar_android)
        var foto4 = (R.drawable.avatar_android)
        var foto5 = (R.drawable.avatar_android)
        var foto6 = (R.drawable.avatar_android)
        var foto7 = (R.drawable.avatar_android)
        var foto8 = (R.drawable.avatar_android)
        var foto9 = (R.drawable.avatar_android)
        var foto10 = (R.drawable.avatar_android)
        var foto11 = (R.drawable.avatar_android)
        var foto12 = (R.drawable.avatar_android)
        var foto13 = (R.drawable.avatar_android)
        var foto14 = (R.drawable.avatar_android)
        var foto15 = (R.drawable.avatar_android)
        var foto16 = (R.drawable.avatar_android)
        var foto17 = (R.drawable.avatar_android)
        var foto18 = (R.drawable.avatar_android)
        var foto19 = (R.drawable.avatar_android)
        var foto20 = (R.drawable.avatar_android)
        var foto21 = (R.drawable.avatar_android)
        var foto22 = (R.drawable.avatar_android)


                lista.add(ProfessoresLista("Amanda", "Biologia", foto1))
                lista.add(ProfessoresLista("Amaro", "Português", foto2))
                lista.add(ProfessoresLista("Angelo", "Geografia", foto3))
                lista.add(ProfessoresLista("Bosco", "Física", foto4))
                lista.add(ProfessoresLista("Carlos Burgos", "PI3, TPIM, TPIE", foto5))
                lista.add(ProfessoresLista("Carneiro", "Educação Física", foto6))
                lista.add(ProfessoresLista("Edja", "Biologia", foto7))
                lista.add(ProfessoresLista("Erick", "TPJ", foto8))
                lista.add(ProfessoresLista("Fernando", "AJD", foto9))
                lista.add(ProfessoresLista("Gilberto", "Filosofia, Sociologia, EPCDH, Releitura, Atualidades", foto10))
                lista.add(ProfessoresLista("Hugo", "Física e Química", foto11))
                lista.add(ProfessoresLista("José Carlos", "Química", foto12))
                lista.add(ProfessoresLista("Joyce", "PI3", foto13))
                lista.add(ProfessoresLista("Nadja", "História", foto14))
                lista.add(ProfessoresLista("Oberdan", "PAD, LP", foto15))
                lista.add(ProfessoresLista("Patrícia", "Português", foto16))
                lista.add(ProfessoresLista("Paulo", "Matemática", foto17))
                lista.add(ProfessoresLista("Rosângela", "Inglês", foto18))
                lista.add(ProfessoresLista("Thamyses", "Sociologia, Projeto de Vida", foto19))
                lista.add(ProfessoresLista("Valter", "Matemática", foto20))
                lista.add(ProfessoresLista("Vivian", "Matemática", foto21))
                lista.add(ProfessoresLista("Wilson", "Artes", foto22))

        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter (lista)

        rviewLista.adapter = viewAdapter
        rviewLista.layoutManager = viewManager

    }

}
