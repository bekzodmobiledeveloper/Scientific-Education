package com.example.scientificeducation.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.scientificeducation.R
import com.example.scientificeducation.databinding.FragmentResultBinding


class ResultFragment : Fragment() {

    lateinit var binding: FragmentResultBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultBinding.inflate(layoutInflater)

        val count = arguments?.getInt("correct", 0)
        binding.count.text = count.toString()
        binding.text.text =
            "You attempt 15 questions and from that ${count.toString()} answer in correct."
        binding.name.text=arguments?.getString("name")

        binding.image.setOnClickListener {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(
                Intent.EXTRA_TEXT,
                "You attempt 15 questions and from that ${count.toString()} answer in correct."
            )
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }

        binding.backItem.setOnClickListener {
            findNavController().popBackStack()
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