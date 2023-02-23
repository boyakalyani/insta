package com.example.insta

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.insta.databinding.ActivityMain3Binding

//import com.example.insta.databinding.ActivityMain3Binding

class MainActivit3 : AppCompatActivity() {
    lateinit var viewjk: ActivityMain3Binding
    lateinit var btn:Button
    lateinit var txt:TextView
    private var tags:String="Instagram"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        viewjk = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(viewjk.root)
        replaceFragmentclass(BlankFragment())

        viewjk.navigationViewId.setOnItemSelectedListener() {
            when (it.itemId) {
                R.id.home_id -> replaceFragmentclass(BlankFragment())   //setItembackgroundviewcolor(R.color.)change backgroundnavigation background
                R.id.search_id -> replaceFragmentclass(BlankFragment2())
                R.id.bag_id -> replaceFragmentclass(BlankFragment3())
                R.id.camera_id -> replaceFragmentclass(BlankFragment4())
                R.id.contact_id -> replaceFragmentclass(BlankFragment5())
                else -> {

                }

            }
            true
        }
    }
    private fun replaceFragmentclass(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frme_id, fragment)
        fragmentTransaction.commit()

    }
}
