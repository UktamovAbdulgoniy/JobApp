package com.example.jobapplication.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.jobapplication.fragment.FirstFragment
import com.example.jobapplication.fragment.SecondFragment
import com.example.jobapplication.fragment.ThirdFragment

class FragmentAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> Fragment()
        }
    }
}