package com.example.insta

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.insta.R
class BlankFragment4 : Fragment() {
lateinit var im:ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var a=inflater.inflate(R.layout.fragment_blank4, container, false)
        return a
    }
}