package com.example.dialogwithbuttons

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BtnsAdapter(private val btnList:ArrayList<String>, private val listenerBtn: ShowBtn): RecyclerView.Adapter<BtnsAdapter.BtnVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BtnVH {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.btnxmlk,parent,false)
        return BtnVH(itemView)
    }

    override fun onBindViewHolder(holder: BtnVH, position: Int) {
        holder.itemPosition = position
        holder.bind()
    }

    override fun getItemCount(): Int {
        return btnList.size
    }

    inner class BtnVH(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var label = itemView.findViewById<TextView>(R.id.btn_name)
        var itemPosition:Int = 0

        fun bind(){
            itemView.setOnClickListener(this)
            label.text = btnList.get(itemPosition)

        }

        override fun onClick(v: View?) {
            listenerBtn.itemClicked(btnList.get(itemPosition),itemPosition)
        }
    }
}