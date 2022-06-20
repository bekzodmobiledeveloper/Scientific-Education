package com.example.scientificeducation.ui.slideshow

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.scientificeducation.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    lateinit var binding: FragmentSlideshowBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSlideshowBinding.inflate(layoutInflater)

        binding.telegramBtn.setOnClickListener {
            val telegram = Intent(Intent.ACTION_VIEW, Uri.parse("https://telegram.me/Muborak_TUIT"))
            startActivity(telegram)

        }

     /*   binding.instagramBtn.setOnClickListener {
            val instagram = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/invites/contact/?i=18j1tm1hot25j&utm_content=g0vbb3p"))
            startActivity(instagram)
        }*/

        return binding.root
    }


}