package br.edu.up.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var txt1: EditText
    lateinit var txt2: EditText
    lateinit var txtConsole: TextView
    lateinit var btnProcessar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txt1 = findViewById(R.id.txt1)
        txt2 = findViewById(R.id.txt2)
        btnProcessar = findViewById(R.id.button)
        txtConsole = findViewById(R.id.console)
        btnProcessar.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        var txtFull = txt1.text.toString() + txt2.text.toString()
        txtConsole.text = txtFull
    }
}