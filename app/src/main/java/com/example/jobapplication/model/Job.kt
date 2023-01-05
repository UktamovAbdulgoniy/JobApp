package com.example.jobapplication.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Job(
    val image: Int,
    val backImage: Int,
    val jobTitle: String,
    val companyName: String,
    val location: String,
    val time: String,
    val aboutUs: String = ""
): Parcelable