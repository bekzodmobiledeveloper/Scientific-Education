package com.example.scientificeducation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.scientificeducation.R
import com.example.scientificeducation.databinding.FragmentTestBinding


class TestFragment : Fragment() {

    lateinit var binding: FragmentTestBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentTestBinding.inflate(layoutInflater)
        binding.button.setOnClickListener {
            if (binding.editTextTextPersonName.text.toString().trim().isEmpty()) {
                Toast.makeText(requireContext(), "Please enter the name", Toast.LENGTH_LONG).show()
            } else {
                val bundle = bundleOf("name" to binding.editTextTextPersonName.text.toString())
                findNavController().popBackStack()
                findNavController().navigate(R.id.questionsFragment, bundle)

            }
        }

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
    }

}