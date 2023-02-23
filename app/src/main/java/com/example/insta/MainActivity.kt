package com.example.insta

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var btLgn: Button
    lateinit var etPW: EditText
    lateinit var etEmail: EditText
    lateinit var btn2: Button
    lateinit var fbTxt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btLgn = findViewById(R.id.lgn_id)
        fbTxt = findViewById(R.id.fblgn_id)
        etEmail = findViewById(R.id.lgnEmail_id)
        etPW = findViewById(R.id.lgnPasswd_id)
        btn2 = findViewById(R.id.btn2_id)

        val saveData = getSharedPreferences("loginEmain", MODE_PRIVATE)

        val saveEmails = saveData.getString("Email", " ")
        val savePassWord = saveData.getString("Password", "")
        etEmail.setText(saveEmails)
        etPW.setText(savePassWord)

        btLgn.setOnClickListener() {
            var Email = etEmail.getText().toString()

            val Password = etPW.getText().toString()

            if (Email.equals(saveEmails) && Password.equals(savePassWord)) {
//                startActivity(Intent(this, MainActivity3::class.java))
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                saveData.edit().putString("Email", Email).apply()
                saveData.edit().putString("Password", Password).apply()

            } else {
                Toast.makeText(this, "please sign up", Toast.LENGTH_SHORT).show()
            }
        }
        fbTxt.setOnClickListener() {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/")))
        }
        btn2.setOnClickListener() {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}



