package com.example.scientificeducation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.scientificeducation.R
import com.example.scientificeducation.adapters.LectureAdapter
import com.example.scientificeducation.adapters.OnLessonMyClickListener1
import com.example.scientificeducation.database.MySharedPreferences
import com.example.scientificeducation.databinding.FragmentLecturesBinding
import com.example.scientificeducation.utils.Count
import com.example.scientificeducation.utils.Lecture

class LecturesFragment : Fragment(), OnLessonMyClickListener1 {

    lateinit var lectureAdapter: LectureAdapter
    lateinit var list: ArrayList<Lecture>
    lateinit var binding: FragmentLecturesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLecturesBinding.inflate(layoutInflater)
        loadData()
        lectureAdapter = LectureAdapter(list, this)
        binding.rv.adapter = lectureAdapter



        return binding.root
    }

    private fun loadData() {
        list = ArrayList()
        list.add(Lecture("Ilmiy ta'lim fanining maqsadi va vazifalari ", 1, R.drawable.image_lesson, "1_mavzu.pdf"))
        list.add(Lecture("Ilmiy-tadqiqot faolyatining tuzilmasi va tarkibi", 2, R.drawable.image_lesson, "2_mavzu.pdf"))
        list.add(Lecture("Nashir qilish uchun ilmiy tezislar ahamyati", 3, R.drawable.image_lesson, "3_mavzu.pdf"))
        list.add(Lecture("Ilmiy tadqiqot turlari va uni olib borish", 4, R.drawable.image_lesson, "4_mavzu.pdf"))
        list.add(Lecture("Ilmiy tezislarni yozish qoidalari", 5, R.drawable.image_lesson, "5_mavzu.pdf"))
        list.add(Lecture("Tezislarni tayyorlashda tavsiyalar", 6, R.drawable.image_lesson, "6_mavzu.pdf"))
        list.add(Lecture("Ilmiy maqola va tezislarni qabul qilish bo'yicha", 7, R.drawable.image_lesson, "7_mavzu.pdf"))
        list.add(Lecture("O'zbekiston Respublikasi adliya vazirligi xuzuridagi ", 8, R.drawable.image_lesson, "8_mavzu.pdf"))
        list.add(Lecture("EHM uchun dasturlar va ma'lumotlar bazasi xizmati", 9, R.drawable.image_lesson, "9_mavzu.pdf"))
        list.add(Lecture("Asosiy hujjatlar ", 10, R.drawable.image_lesson, "10_mavzu.pdf"))
    }

    override fun onClick(position: Int, lecture: Lecture) {
        /*  var count = MySharedPreferences.loadData("lecture1")
          val list = MySharedPreferences.loadData1("lecture")
          var a = false*/
        /*  if (list.size == 14) {
              count = 100
              MySharedPreferences.save("lecture1", count)
          } else
              if (list.size == 0) {
                  count += 9
                  MySharedPreferences.save("lecture1", count)
                  list.add(Count(position))
                  MySharedPreferences.save1("lecture", list)
              } else {
                  for (i in 0 until list.size) {
                      a = position == list[i].count
                      if (a) {
                          break
                      } else {
                          continue
                      }
                  }
                  if (a) {
                      count += 0
                  } else {
                      count += 7
                      MySharedPreferences.save("lecture1", count)
                      list.add(Count(position))
                      MySharedPreferences.save1("lecture", list)
                  }
              }*/


        val bundle = bundleOf("lecture" to lecture)
        findNavController().navigate(R.id.lectureInfoFragment, bundle)
    }


}