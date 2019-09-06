package com.example.joanadobts.ciceroavalia
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_activity.view.*
import kotlinx.android.synthetic.main.list_professores.view.*

class MyAdapter(var lista : MutableList<ProfessoresLista>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyViewHolder {

        var view = LayoutInflater.from(parent.context).inflate(R.layout.list_professores, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.nome.text = lista[position].nome
        holder.materia.text = lista[position].materia
        holder.avatar.setImageResource(lista[position].avatar)
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var nome = itemView.txtNome
        var materia = itemView.txtMateria
        var avatar = itemView.fotoProf
        var listaView = itemView.rviewLista
    }
}