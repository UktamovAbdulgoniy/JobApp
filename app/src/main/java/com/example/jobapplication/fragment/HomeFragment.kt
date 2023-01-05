package com.example.jobapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jobapplication.R
import com.example.jobapplication.adapter.JobAdapter
import com.example.jobapplication.util.JobObject

class HomeFragment : Fragment() {

    private lateinit var jobAdapter: JobAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }
    private fun initViews(view: View) {
        jobAdapter = JobAdapter()
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.adapter = jobAdapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        jobAdapter.submitList(JobObject.jobList())

        jobAdapter.onClick = {
            val bundle = bundleOf("job" to it)
            view.findNavController().navigate(R.id.action_homeFragment_to_detailFragment, bundle)
        }
    }
}