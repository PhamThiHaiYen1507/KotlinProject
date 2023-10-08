package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.button);
        var text = findViewById<TextView>(R.id.text);

        btn.setOnClickListener(
            View.OnClickListener {
                text.text = Random.nextInt(1,6).toString();
            }
        )
    }
}