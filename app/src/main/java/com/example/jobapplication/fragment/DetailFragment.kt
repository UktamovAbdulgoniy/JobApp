package com.example.jobapplication.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.jobapplication.R
import com.example.jobapplication.adapter.ImageAdapter
import com.example.jobapplication.model.Job
import com.example.jobapplication.util.JobObject
import de.hdodenhof.circleimageview.CircleImageView

class DetailFragment : Fragment() {

    private lateinit var imageAdapter: ImageAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
    }

    private fun initViews(view: View) {
        val job = arguments?.getParcelable<Job>("job")!!
        val backImage: AppCompatImageView = view.findViewById(R.id.imageBack)
        val roundImage: CircleImageView = view.findViewById(R.id.imageRound)
        val textJob: TextView = view.findViewById(R.id.textJob)
        val textCompany: TextView = view.findViewById(R.id.textCompany)
        val aboutText: TextView = view.findViewById(R.id.textAbout)
        val textLocation: TextView = view.findViewById(R.id.textLocation)
        val textDate: TextView = view.findViewById(R.id.textDate)
        val btnBack: AppCompatImageView = view.findViewById(R.id.backBtn)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        imageAdapter = ImageAdapter()
        val pagerSnapHelper = PagerSnapHelper()
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = imageAdapter
        pagerSnapHelper.attachToRecyclerView(recyclerView)
        imageAdapter.submitList(JobObject.imageList())

        backImage.setImageResource(job.backImage)
        roundImage.setImageResource(job.image)
        textJob.text = job.jobTitle
        textCompany.text = job.companyName
        aboutText.text = job.aboutUs
        textLocation.text = job.location
        textDate.text = job.time

        btnBack.setOnClickListener {
            view.findNavController().popBackStack()
        }
    }
}