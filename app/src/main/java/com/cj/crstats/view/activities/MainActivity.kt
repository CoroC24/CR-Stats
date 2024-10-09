package com.cj.crstats.view.activities

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cj.crstats.R
import com.cj.crstats.viewmodel.CRViewModel

class MainActivity : AppCompatActivity() {

    private val crViewModel: CRViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val textView: TextView = findViewById(R.id.textView)

        crViewModel.playerInf.observe(this){ playerInf ->
            textView.text = playerInf.tag + " - " + playerInf.name
        }

        crViewModel.fetchPlayerInfo(applicationContext, "8PY0YJ0YG")
    }
}