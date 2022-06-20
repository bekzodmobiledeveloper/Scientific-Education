package com.example.scientificeducation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.scientificeducation.databinding.ItemInfoBinding
import com.example.scientificeducation.utils.Info

class InfoAdapter(var list: ArrayList<Info>, var onMyClickListener1: OnMyClickListener1) :
    RecyclerView.Adapter<InfoAdapter.Vh>() {

    private var listener: ((Int) -> Unit)? = null

    inner class Vh(var binding: ItemInfoBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(info: Info) {
            binding.number.text = info.number.toString()
            binding.reading.text = info.read
            binding.text.text = info.name
            binding.imageView.setImageResource(info.image!!)
            binding.infoBtn.setOnClickListener {
                onMyClickListener1.onMyClick(adapterPosition, info)
            }

           /* binding.image.setOnClickListener {
                listener?.invoke(adapterPosition)

            }*/

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])

    }

    override fun getItemCount(): Int = list.size

   /* fun setListener(block: (Int) -> Unit) {
        listener = block

    }*/
}

interface OnMyClickListener1 {
    fun onMyClick(position: Int, info: Info)
   // fun setImage(position: Int, info: Info, imageView: Int)
}
