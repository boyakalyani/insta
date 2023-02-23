package com.example.insta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.regex.Matcher
import java.util.regex.Pattern

class MainActivity2 : AppCompatActivity() {
    lateinit var etUserName:TextView
    lateinit var etPhoneNum:TextView
    lateinit var etEmail:TextView
    lateinit var etPassword:TextView
    lateinit var btn2:Button

    var Num=6
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        etUserName=findViewById(R.id.user_id)
        etPhoneNum=findViewById(R.id.PhoneNum_id)
        etEmail=findViewById(R.id.Email_id)
        etPassword=findViewById(R.id.passWord_id)
        btn2=findViewById(R.id.signIn_id)

        var saveData=getSharedPreferences("loginEmain", MODE_PRIVATE)

        btn2.setOnClickListener(){
            if (etEmail.text.isNotEmpty() && etPassword.text.isNotEmpty()){
                if(emailValid(etEmail.text.toString().trim()) && etPassword.text.length==Num){
                    startActivity(Intent(applicationContext,MainActivit3::class.java))
                    Toast.makeText(this, "sign up is succuss", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(applicationContext, "please check your email and password", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                etEmail.error="please enter your email"
                etPassword.error="please enter your password"
                etPhoneNum.error="please enter your email"
                etUserName.error="please enter your password"
            }
        }
    }
    private fun emailValid(Email:String?):Boolean{
        val expressionSymbols="^[a-z0-9A-Z._%+-]+@[a-z0-9A-Z.-]+\\.[a-zA-Z]{2,3}$"
        val pattern:Pattern=Pattern.compile(expressionSymbols,Pattern.CASE_INSENSITIVE)
        val matcher:Matcher=pattern.matcher(Email.toString())
        return matcher.matches()
    }
}
