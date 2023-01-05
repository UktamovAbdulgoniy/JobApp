package com.example.jobapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.jobapplication.R
import com.google.android.material.button.MaterialButton

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNext: MaterialButton = view.findViewById(R.id.btnNext)
        val viewPager: ViewPager2 = activity?.findViewById(R.id.viewPager)!!
        btnNext.setOnClickListener {
            viewPager.currentItem = 2
        }
    }
}