package com.example.scientificeducation.fragments

import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.scientificeducation.R
import com.example.scientificeducation.adapters.InfoAdapter
import com.example.scientificeducation.adapters.OnMyClickListener1
import com.example.scientificeducation.database.MyDbHelper
import com.example.scientificeducation.database.MySharedPreferences
import com.example.scientificeducation.databinding.FragmentPracticalBinding
import com.example.scientificeducation.utils.Count
import com.example.scientificeducation.utils.Info


class PracticalFragment : Fragment(), OnMyClickListener1 {

    lateinit var binding: FragmentPracticalBinding
    lateinit var infoAdapter: InfoAdapter
    lateinit var list: ArrayList<Info>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentPracticalBinding.inflate(layoutInflater)

        loadData()

        infoAdapter = InfoAdapter(list, this)
        binding.rvLectures.adapter = infoAdapter



        return binding.root
    }

    private fun loadData() {
        list = ArrayList()
        list.add(
            Info(
                "Amaliy mashg'ulot",
                1,
                "2 soatga mo'ljallangan",
                R.drawable.practica, "praktika_1.pdf", 0
            )
        )
        list.add(
            Info(
                "Amaliy mashg'ulot",
                2,
                "2 soatga mo'ljallangan",
                R.drawable.practica,
                "praktika_2.pdf", 0
            )
        )

        list.add(
            Info(
                "Amaliy mashg'ulot",
                3,
                "1 soatga mo'ljallangan",
                R.drawable.practica,
                "praktika_3.pdf", 0
            )
        )
        list.add(
            Info(
                "Amaliy mashg'ulot",
                4,
                "1 soatga mo'ljallangan",
                R.drawable.practica,
                "praktika_4.pdf", 0
            )
        )
        list.add(
            Info(
                "Amaliy mashg'ulot",
                5,
                "2 soatga mo'ljallangan",
                R.drawable.practica, "praktika_5.pdf",
                0
            )
        )
        list.add(
            Info(
                "Amaliy mashg'ulot",
                6,
                "1 soatga mo'ljallangan",
                R.drawable.practica, "praktika_6.pdf", 0
            )
        )
        list.add(
            Info(
                "Amaliy mashg'ulot",
                7,
                "1 soatga mo'ljallangan",
                R.drawable.practica,
                "praktika_7.pdf", 0
            )
        )
        list.add(
            Info(
                "Amaliy mashg'ulot",
                8,
                "2 soatga mo'ljallangan",
                R.drawable.practica, "praktika_8.pdf", 0
            )
        )
        list.add(
            Info(
                "Amaliy mashg'ulot",
                9,
                "1 soatga mo'ljallangan",
                R.drawable.practica,
                "praktika_9.pdf", 0
            )
        )
        list.add(
            Info(
                "Amaliy mashg'ulot",
                10,
                "2 soatga mo'ljallangan",
                R.drawable.practica, "praktika_10.pdf", 0
            )
        )
        list.add(
            Info(
                "Amaliy mashg'ulot",
                11,
                "1 soatga mo'ljallangan",
                R.drawable.practica, "praktika_11.pdf", 0
            )
        )
        list.add(
            Info(
                "Amaliy mashg'ulot",
                12,
                "1 soatga mo'ljallangan",
                R.drawable.practica,
                "praktika_12.pdf", 0
            )
        )
        list.add(
            Info(
                "Amaliy mashg'ulot",
                13,
                "2 soatga mo'ljallangan",
                R.drawable.practica, "praktika_13.pdf", 0
            )
        )
        list.add(
            Info(
                "Amaliy mashg'ulot",
                14,
                "2 soatga mo'ljallangan",
                R.drawable.practica, "praktika_14.pdf", 0
            )
        )
        list.add(
            Info(
                "Amaliy mashg'ulot",
                15,
                "1 soatga mo'ljallangan",
                R.drawable.practica, "praktika_15.pdf", 0
            )
        )

    }

    override fun onMyClick(position: Int, info: Info) {
        val bundle = bundleOf("info" to info)
        findNavController().navigate(R.id.practicalInfoFragment, bundle)
    }


}