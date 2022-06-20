package com.example.scientificeducation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.scientificeducation.R
import com.example.scientificeducation.databinding.FragmentLectureInfoBinding
import com.example.scientificeducation.utils.Lecture


class LectureInfoFragment : Fragment() {


    lateinit var binding: FragmentLectureInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLectureInfoBinding.inflate(layoutInflater)

        val bundle: Lecture = arguments?.getSerializable("lecture") as Lecture

      //  binding.title.text = "${bundle.name}"

        val fromAsset = binding.myPdf.fromAsset("${bundle.fileName}")

        fromAsset.show()





        return binding.root
    }

}