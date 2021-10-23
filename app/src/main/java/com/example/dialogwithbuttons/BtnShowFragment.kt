package com.example.dialogwithbuttons

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class BtnShowFragment() : DialogFragment() {

    private lateinit var rv: RecyclerView;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Objects.requireNonNull(dialog)?.window!!.requestFeature(Window.FEATURE_NO_TITLE)
        return inflater.inflate(R.layout.fragment_btn_show, null, false);
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))



        view.findViewById<Button>(R.id.btn1).setOnClickListener {
            view.findViewById<Button>(R.id.btn1)
                .setBackgroundColor(resources.getColor(R.color.black))
        }
        view.findViewById<Button>(R.id.btn2).setOnClickListener {
            view.findViewById<Button>(R.id.btn2)
                .setBackgroundColor(resources.getColor(R.color.black))
        }
        view.findViewById<Button>(R.id.button3).setOnClickListener {
            view.findViewById<Button>(R.id.button3)
                .setBackgroundColor(resources.getColor(R.color.black))
        }
        view.findViewById<Button>(R.id.btn4).setOnClickListener {
            view.findViewById<Button>(R.id.btn4)
                .setBackgroundColor(resources.getColor(R.color.black))
        }


//        rv = view.findViewById(R.id.rv)
//        rv.setHasFixedSize(true)
//        rv.setItemViewCacheSize(4)
//        rv.layoutManager = LinearLayoutManager(requireActivity(), RecyclerView.VERTICAL, false)
//
//        val fruits: ArrayList<String> = ArrayList()
//        fruits.add("Я на работе"); fruits.add("Я отдыхаю"); fruits.add("Я на обеде")
//        fruits.add("Я занят");
//
//        val listener: Any = object : ShowBtn {
//            override fun itemClicked(btn: String, position: Int) {
//                showSelectedFruit(btn)
//            }
//        }
//
//        val adapter: BtnsAdapter = BtnsAdapter(fruits, listener as ShowBtn)
//        rv.adapter = adapter
//    }
//
//    private fun showSelectedFruit(btn: String) {
//        val builder = AlertDialog.Builder(requireActivity())
//        builder.setMessage("you chose $btn")
//            .setCancelable(false)
//            .setPositiveButton("ok") { dialog, id -> dismiss() }
//        val alert = builder.create()
//        alert.show()
//    }
    }
}