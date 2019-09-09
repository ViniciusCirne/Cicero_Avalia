package com.example.joanadobts.ciceroavalia

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Professor (var nome :String = "", var materias: String = "", var avatar :Int = 0) : Parcelable {}

