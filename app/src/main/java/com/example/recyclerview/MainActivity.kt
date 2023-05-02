package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.adamwarlock,
                nameSuperhero = "Adam Warlock ",
                desSuperhero = "Superhero misterius/jenderal kosmik."

            ),
            Superhero(
                R.drawable.Blackwidow,
                nameSuperhero = "Black Widow",
                desSuperhero = "Black Widow adalah sebutan untuk laba-laba Amerika yang bewarna hitam dengan tanda merah."
            ),
            Superhero(
                R.drawable.Hawkeye,
                nameSuperhero = "Hawkeye",
                desSuperhero = "Hawkeye adalah salah satu anggota Avengers di Marvel Cinematic Universe (MCU) yang tidak memiliki kekuatan super.\n"

            ),
            Superhero(
                R.drawable.doctorstrange,
                nameSuperhero = "Doctorstrange",
                desSuperhero = "Doctor Strange adalah sebuah film pahlawan super Amerika yang menampilkan karakter Marvel Comics dengan nama yang sama"
            ),
            Superhero(
                R.drawable.hulk,
                nameSuperhero = "Hulk",
                desSuperhero = " Hulk, adalah tokoh pahlawan super fiksi yang ada pada Marvel Comics. "
            ),
            Superhero(
                R.drawable.ironman,
                nameSuperhero = "Ironman",
                desSuperhero = "Ironman adalah film pahlawan super rilisan tahun 2008 yang berdasarkan pada tokoh Marvel Comics"
            ),

            Superhero(
                R.drawable.spaiderman,
                nameSuperhero = "Spiderman",
                desSuperhero = "Spiderman adalah pahlawan super fiktif dari Marvel Comics "
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

        }
    }
}

