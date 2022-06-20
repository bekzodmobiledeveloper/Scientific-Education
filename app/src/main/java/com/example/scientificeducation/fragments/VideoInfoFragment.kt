package com.example.scientificeducation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.scientificeducation.R
import com.example.scientificeducation.databinding.FragmentVideoInfoBinding


class VideoInfoFragment : Fragment() {


    lateinit var binding: FragmentVideoInfoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVideoInfoBinding.inflate(layoutInflater)

        val fromAsset = binding.myPdf.fromAsset("kitob.pdf")
        fromAsset.show()

        return binding.root
    }

}