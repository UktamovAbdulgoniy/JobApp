package com.example.jobapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.jobapplication.R
import com.example.jobapplication.adapter.FragmentAdapter

class MainFragment : Fragment() {
    private lateinit var fragmentAdapter: FragmentAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }
    private fun initViews(view: View) {
        fragmentAdapter = FragmentAdapter(this)
        val viewPager: ViewPager2 = view.findViewById(R.id.viewPager)
        val skipText: TextView = view.findViewById(R.id.textSkip)
        viewPager.adapter = fragmentAdapter
        skipText.setOnClickListener {
            viewPager.currentItem = 2
        }
    }
}