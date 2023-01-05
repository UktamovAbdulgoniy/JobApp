package com.example.jobapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.jobapplication.databinding.ImageLayoutBinding
import com.example.jobapplication.model.Image

class ImageAdapter: ListAdapter<Image, ImageAdapter.ImageViewHolder>(DiffCallBack()) {
    private class DiffCallBack : DiffUtil.ItemCallback<Image>() {
        override fun areItemsTheSame(oldItem: Image, newItem: Image): Boolean {
            return oldItem.image == newItem.image
        }

        override fun areContentsTheSame(oldItem: Image, newItem: Image): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            ImageLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ImageViewHolder(private val binding: ImageLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(image: Image) {
            binding.imageView.setImageResource(image.image)
        }
    }
}