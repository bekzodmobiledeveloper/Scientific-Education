package com.example.scientificeducation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.scientificeducation.R
import com.example.scientificeducation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(layoutInflater)

        binding.leksiya.setOnClickListener {
            findNavController().navigate(R.id.lecturesFragment)
        }
        binding.videoLesson.setOnClickListener {
            findNavController().navigate(R.id.videoLessonsFragment)
        }
        binding.test.setOnClickListener {
            findNavController().navigate(R.id.testFragment)
        }

        binding.practical.setOnClickListener {
            findNavController().navigate(R.id.practicalFragment)
        }





        return binding.root
    }


}