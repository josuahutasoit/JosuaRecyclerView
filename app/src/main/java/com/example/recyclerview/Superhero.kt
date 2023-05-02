package com.example.recyclerview

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize

@VersionedParcelize
data class Superhero(
    val imgSuperhero : Int,
    val nameSuperhero : String,
    val desSuperhero : String
) :Parcelable

