package com.thisisit.act1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinalStageActivity : AppCompatActivity() {

    private lateinit var registrationLogin: TextView
    private lateinit var emailText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_stage)

        registrationLogin = findViewById(R.id.registrationLogin)

        emailText = findViewById(R.id.emailText)

        val emailInfo = intent.getStringExtra("info")
        emailText.text = emailInfo

        registrationLogin.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}