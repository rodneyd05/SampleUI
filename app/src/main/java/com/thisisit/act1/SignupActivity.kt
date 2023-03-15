package com.thisisit.act1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignupActivity : AppCompatActivity() {

    private lateinit var loginText: TextView
    private lateinit var signupPageButton: Button
    private lateinit var emailInfo: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        loginText = findViewById(R.id.loginText)
        signupPageButton = findViewById(R.id.signupPageButton)
        emailInfo = findViewById(R.id.email_info)

        loginText.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }

        signupPageButton.setOnClickListener {

            val emailInfo = emailInfo.text.toString()

            val intent = Intent(this,FinalStageActivity::class.java)

            intent.putExtra("info", emailInfo)
            startActivity(intent)
        }
    }
}