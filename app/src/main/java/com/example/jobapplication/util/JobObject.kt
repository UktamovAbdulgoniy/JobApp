package com.example.jobapplication.util

import com.example.jobapplication.R
import com.example.jobapplication.model.Image
import com.example.jobapplication.model.Job

object JobObject {
    fun jobList(): List<Job> {
        return listOf(
            Job(
                image = R.drawable.amazon_icon,
                backImage = R.drawable.amazon,
                jobTitle = "UX Designer",
                companyName = "Amazon",
                location = "Seattle USA (remote)",
                time = "9h ago",
                aboutUs = "Amazon and iRobot sign an agreement for Amazon to acquire iRobot\n" +
                        "Since introducing the Roomba vacuum in 2002, iRobot has continued to delight customers with every product generation, saving customers valuable time previously spent on household chores."
            ),
            Job(
                image = R.drawable.coinbase,
                backImage = R.drawable.coin_com,
                jobTitle = "Product Designer",
                companyName = "CoinBase",
                location = "San Fransisco (remote)",
                time = "9h ago",
                aboutUs = "Coinbase is a cryptocurrency trading and investing platform that offers users the ability to buy, sell, and exchange over 100 tradable cryptocurrencies such as Bitcoin, Ethereum, and Dogecoin. Coinbase is a large company with over 98 million users and \$256 billion in assets on the platform."
            ),
            Job(
                image = R.drawable.figma_icon,
                backImage = R.drawable.figma,
                jobTitle = "Lead UX/UI Designer",
                companyName = "Figma",
                location = "London UK (remote)",
                time = "9h ago",
                aboutUs = "In 2015, the first design tool that combined the accessibility of the web with the functionality of a native app was born."
            ),
            Job(
                image = R.drawable.meta_icon,
                backImage = R.drawable.meta,
                jobTitle = "VR Designer",
                companyName = "Meta",
                location = "London UK (remote)",
                time = "9h ago",
                aboutUs = "Meta Platforms Inc. is an American multinational holding company that owns a technology conglomerate and is located in Menlo Park, California. It is the parent organization of Facebook, Instagram, WhatsApp and Oculus"
            ),
            Job(
                image = R.drawable.glovo_icon,
                backImage = R.drawable.glovo,
                jobTitle = "UX UI Designer",
                companyName = "Glovo",
                location = "Barcelona,Spain(remote)",
                time = "9h ago",
                aboutUs = "Glovo is a Spanish fast commerce startup founded in Barcelona in 2015. It is an on-demand courier service that buys, picks up and delivers items ordered through a mobile app. It offers several services, the most popular of which is food delivery."
            ),
            Job(
                image = R.drawable.amazon_icon,
                backImage = R.drawable.amazon,
                jobTitle = "UX Designer",
                companyName = "Amazon",
                location = "Seattle USA (remote)",
                time = "9h ago"
            ),
            Job(
                image = R.drawable.amazon_icon,
                backImage = R.drawable.amazon,
                jobTitle = "UX Designer",
                companyName = "Amazon",
                location = "Seattle USA (remote)",
                time = "9h ago"
            ),
            Job(
                image = R.drawable.amazon_icon,
                backImage = R.drawable.amazon,
                jobTitle = "UX Designer",
                companyName = "Amazon",
                location = "Seattle USA (remote)",
                time = "9h ago"
            ),
            Job(
                image = R.drawable.amazon_icon,
                backImage = R.drawable.amazon,
                jobTitle = "UX Designer",
                companyName = "Amazon",
                location = "Seattle USA (remote)",
                time = "9h ago"
            ),
        )
    }
    fun imageList(): MutableList<Image> {
        return mutableListOf(
            Image(
                image = R.drawable.img1
            ),
            Image(
                image = R.drawable.img2
            ),
            Image(
                image = R.drawable.img3
            ),
            Image(
                image = R.drawable.img4
            ),
        )
    }
}