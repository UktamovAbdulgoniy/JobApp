package com.example.jobapplication.fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.jobapplication.R
import com.example.jobapplication.manager.SharedPrefManager

class SplashFragment : Fragment() {
    private lateinit var sharedPrefManager: SharedPrefManager
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }

    private fun initViews(view: View) {
        sharedPrefManager = SharedPrefManager(requireContext())
        Handler(Looper.myLooper()!!).postDelayed({
            if (sharedPrefManager.getFinish()) {
                view.findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
            } else {
                view.findNavController().navigate(R.id.action_splashFragment_to_mainFragment)
            }
        }, 2000)
    }
}