package com.example.insta

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.insta.R

class BlankFragment2 : Fragment() {
    lateinit var btn: Button
    lateinit var txt1: TextView
    private var tags:String="Instagram"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val k= inflater.inflate(R.layout.fragment_blank2, container, false)
//        btn=k.findViewById(R.id.img_id)
//        txt1=k.findViewById(R.id.txt)
//        var num=0
//       btn.setOnClickListener(){
//            num++
//           txt1.text=num.toString()
//       }
        return k
    }
}