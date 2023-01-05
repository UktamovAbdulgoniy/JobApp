package com.example.jobapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.jobapplication.databinding.JobLayoutBinding
import com.example.jobapplication.model.Job

class JobAdapter: ListAdapter<Job, JobAdapter.JobViewHolder>(DiffCallBack()) {

    lateinit var onClick: (Job) -> Unit

    private class DiffCallBack: DiffUtil.ItemCallback<Job>() {
        override fun areItemsTheSame(oldItem: Job, newItem: Job): Boolean {
            return oldItem.jobTitle == newItem.jobTitle
        }

        override fun areContentsTheSame(oldItem: Job, newItem: Job): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        return JobViewHolder(
            JobLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class JobViewHolder(private val binding: JobLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(job: Job) {
            binding.apply {
                imageView.setImageResource(job.image)
                textJob.text = job.jobTitle
                textCompany.text = job.companyName
                textDate.text = job.time
                textLocation.text = job.location
            }
            itemView.setOnClickListener {
                onClick.invoke(job)
            }
        }
    }
}