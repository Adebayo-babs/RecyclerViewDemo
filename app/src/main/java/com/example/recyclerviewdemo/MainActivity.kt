package com.example.recyclerviewdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val fruits = listOf<Fruit>(
        Fruit("Mango","James"),
        Fruit("Apple","Mac"),
        Fruit("Banana","Tobs"),
        Fruit("Pear","Alex"),
        Fruit("Orange","Joe"),
        Fruit("Lemon","Pichue"),
        Fruit("Pawpaw","Frank")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setBackgroundColor(Color.BLUE)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyRecyclerViewAdapter(
            fruits
        ) { selectedItem: Fruit ->
            listItemClicked(selectedItem)
        }
    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(
            this@MainActivity,
            "Name is ${fruit.name} Supplier is ${fruit.supplier}",
            Toast.LENGTH_LONG
        ).show()
    }


}