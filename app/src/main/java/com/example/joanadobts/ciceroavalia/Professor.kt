package com.example.joanadobts.ciceroavalia

import android.os.Parcel
import android.os.Parcelable

data class Professor (var nome :String, var materias: String, var avatar :Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nome)
        parcel.writeString(materias)
        parcel.writeInt(avatar)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Professor> {
        override fun createFromParcel(parcel: Parcel): Professor {
            return Professor(parcel)
        }

        override fun newArray(size: Int): Array<Professor?> {
            return arrayOfNulls(size)
        }
    }
}
