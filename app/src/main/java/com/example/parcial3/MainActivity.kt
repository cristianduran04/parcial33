package com.example.parcial3
import android.annotation.SuppressLint
import android.widget.Button
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.parcial3.R.id.buttoniniciar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val buttoniniciar =findViewById<Button>(buttoniniciar)
    buttoniniciar.setOnClickListener{
        val intent = Intent(this, segundo_activity::class.java)
        startActivity(intent)
    }
    }
}

