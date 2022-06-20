package com.example.scientificeducation.fragments

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.scientificeducation.R
import com.example.scientificeducation.database.MySharedPreferences
import com.example.scientificeducation.databinding.FragmentQuestionsBinding
import com.example.scientificeducation.utils.Constants
import com.example.scientificeducation.utils.Questions


class QuestionsFragment : Fragment(), View.OnClickListener {


    lateinit var binding: FragmentQuestionsBinding
    private var mCurrentPos: Int = 1
    private var mQuestionsList: ArrayList<Questions>? = null
    private var mSelectedop: Int = 0
    private var mCorrect: Int = 0
    private var mUsername: String? = null
    private var isOptionSelected: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentQuestionsBinding.inflate(layoutInflater)

        MySharedPreferences.init(requireContext())
        mQuestionsList = Constants.getQuestion()
        Log.i("Questions size:", "${15}")
        mUsername = arguments?.getString("name", "Bekzod")

        setQuestion()

        binding.Op1.setOnClickListener(this)
        binding.Op2.setOnClickListener(this)
        binding.Op3.setOnClickListener(this)
        binding.Op4.setOnClickListener(this)

        binding.Submit.setOnClickListener(this)



        return binding.root
    }

    private fun setQuestion() {

        optionsClickableOrNot(true) //set options clickable as new question loaded
        isOptionSelected = false //set false as new question loaded

        val question = mQuestionsList!![mCurrentPos - 1]

        defaultOp()
        if (mCurrentPos == 15) {
            binding.Submit.text = "Finish"
        } else {
            binding.Submit.text = "Submit"
        }
        binding.progressHorizontal.progress = mCurrentPos
        binding.textViewProgress.text = "$mCurrentPos " + "/" + "15"
        binding.QuestionText.text = question!!.question
        binding.Op1.text = question.op1
        binding.Op2.text = question.op2
        binding.Op3.text = question.op3
        binding.Op4.text = question.op4
    }

    private fun defaultOp() {
        val options = ArrayList<TextView>()
        options.add(0, binding.Op1)
        options.add(1, binding.Op2)
        options.add(2, binding.Op3)
        options.add(3, binding.Op4)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background =
                ContextCompat.getDrawable(requireContext(), R.drawable.option_design)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.Op1 -> {
                selectedOptionsView(binding.Op1, 1)
                isOptionSelected = true
            }
            R.id.Op2 -> {
                selectedOptionsView(binding.Op2, 2)
                isOptionSelected = true
            }
            R.id.Op3 -> {
                selectedOptionsView(binding.Op3, 3)
                isOptionSelected = true
            }
            R.id.Op4 -> {
                selectedOptionsView(binding.Op4, 4)
                isOptionSelected = true
            }
            R.id.Submit -> {
                if (isOptionSelected) {
                    if (mSelectedop == 0) {
                        mCurrentPos++

                        when {
                            mCurrentPos <= 15 -> {
                                setQuestion()
                            }
                            else -> {
                                val bundle = bundleOf("correct" to mCorrect, "name" to mUsername)
                                findNavController().popBackStack()
                                findNavController().navigate(R.id.resultFragment, bundle)
                            }
                        }
                    } else {
                        val question = mQuestionsList?.get(mCurrentPos - 1)
                        if (question!!.correct != mSelectedop) {
                            answerView(mSelectedop, R.drawable.option_wrong)
                        } else {
                            mCorrect++
                        }
                        answerView(question.correct, R.drawable.option_correct)

                        optionsClickableOrNot(false)  //set options not-clickable as user has already chosen

                        if (mCurrentPos == 15) {

                            binding.Submit.text = "Finish"
                        } else {
                            var current = MySharedPreferences.loadData("current")
                            if (MySharedPreferences.loadData("current") == 100) {
                                MySharedPreferences.save("current", 100)
                            } else {
                                current++
                                MySharedPreferences.save("current", current)
                            }
                            binding.Submit.text = "Next Question"
                        }
                        mSelectedop = 0
                    }
                } else {
                    Toast.makeText(requireContext(), "Please select option", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }

    }

    private fun answerView(answer: Int, drawableview: Int) {
        when (answer) {
            1 -> {
                binding.Op1.background = ContextCompat.getDrawable(requireContext(), drawableview)
            }
            2 -> {
                binding.Op2.background = ContextCompat.getDrawable(requireContext(), drawableview)
            }
            3 -> {
                binding.Op3.background = ContextCompat.getDrawable(requireContext(), drawableview)
            }
            4 -> {
                binding.Op4.background = ContextCompat.getDrawable(requireContext(), drawableview)
            }
        }

    }

    private fun selectedOptionsView(tv: TextView, selectedOpNum: Int) {
        defaultOp()
        mSelectedop = selectedOpNum

        tv.setTextColor(Color.parseColor("#808080"))//#363A43
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background =
            ContextCompat.getDrawable(requireContext(), R.drawable.option_design_selected)

    }


    private fun optionsClickableOrNot(boolean: Boolean) {
        binding.Op1.isEnabled = boolean
        binding.Op2.isEnabled = boolean
        binding.Op3.isEnabled = boolean
        binding.Op4.isEnabled = boolean
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