package com.example.jobapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.jobapplication.R
import com.example.jobapplication.manager.SharedPrefManager
import com.google.android.material.button.MaterialButton

class ThirdFragment: Fragment() {
    private lateinit var sharedPrefManager: SharedPrefManager
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       return inflater.inflate(R.layout.fragment_third, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnFinish: MaterialButton = view.findViewById(R.id.btnFinish)
        sharedPrefManager = SharedPrefManager(requireContext())
        btnFinish.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_homeFragment)
            sharedPrefManager.saveFinish(true)
        }
    }
}