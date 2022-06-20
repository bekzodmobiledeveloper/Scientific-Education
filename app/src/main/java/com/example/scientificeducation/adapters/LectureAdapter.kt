package com.example.scientificeducation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.scientificeducation.databinding.LessonItemBinding
import com.example.scientificeducation.utils.Lecture

class LectureAdapter(var list: ArrayList<Lecture>, var onLessonMyClickListener1: OnLessonMyClickListener1) :
    RecyclerView.Adapter<LectureAdapter.Vh>() {

    inner class Vh(var binding: LessonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(lecture: Lecture) {
            binding.lessonName.text = lecture.name
            binding.number.text = lecture.number.toString()
            binding.imageView.setImageResource(lecture.image!!)
            binding.layout.setOnClickListener {
                onLessonMyClickListener1.onClick(adapterPosition, lecture)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LessonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}

interface OnLessonMyClickListener1 {
    fun onClick(position: Int, lecture: Lecture)

}