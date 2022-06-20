package com.example.scientificeducation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.scientificeducation.R
import com.example.scientificeducation.databinding.FragmentPracticaInfoBinding
import com.example.scientificeducation.utils.Info

class PracticalInfoFragment : Fragment() {

    lateinit var binding: FragmentPracticaInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPracticaInfoBinding.inflate(layoutInflater)

        val info: Info = arguments?.getSerializable("info") as Info
        val fromAsset = binding.myPdf.fromAsset("${info.pdfName}")
        fromAsset.show()

        return binding.root
    }




}