package ru.poopitcorp.tutorialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val obj = CObject("ViGO", "12345")

        val editText = findViewById<TextView>(R.id.editText)
        val listView = findViewById<ListView>(R.id.listView)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {


            obj.comments.add(editText.text.toString())
            //listView.addFooterView(View(editText.text.toString()))

            Toast.makeText(applicationContext, "Size: ${obj.comments.size} "
                        , Toast.LENGTH_SHORT).show()

            Log.i("TAG", "ADDED: ${editText.text.toString()}")
        }

        Log.i("TAG", ">>> onCreate finished.")
    }
}