package com.example.recyclerview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.recyclerview.Informacion
import com.example.recyclerview.R

class InformacionViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val nombreper =  view.findViewById<TextView>(R.id.tvNombre)
    val estaturabreper =  view.findViewById<TextView>(R.id.tvEstatura)
    val posicionper =  view.findViewById<TextView>(R.id.tvPosicion)
    val nacionalidadper = view.findViewById<TextView>(R.id.tvNacionalidad)
    val dorsalbreper = view.findViewById<TextView>(R.id.tvDorsal)
    val imagen = view.findViewById<ImageView>(R.id.ivImagen)

    fun render(infoModel: Informacion){
        nombreper.text = infoModel.Nombre
        estaturabreper.text = infoModel.Estatura.toString()
        posicionper.text = infoModel.Posicion
        nacionalidadper.text = infoModel.Nacionalidad
        dorsalbreper.text = infoModel.Dorsal.toString()
        Glide.with(imagen.context).load(infoModel.imagen).into(imagen)


    }
}