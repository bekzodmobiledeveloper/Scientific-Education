package com.example.scientificeducation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.scientificeducation.R
import com.example.scientificeducation.databinding.FragmentVideoLessonsBinding


class VideoLessonsFragment : Fragment() {


    lateinit var binding: FragmentVideoLessonsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVideoLessonsBinding.inflate(layoutInflater)


        binding.book.setOnClickListener {
            findNavController().navigate(R.id.videoInfoFragment)
        }




        return binding.root
    }

}