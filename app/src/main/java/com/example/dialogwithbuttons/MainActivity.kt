package com.example.dialogwithbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import android.content.DialogInterface
import android.widget.Button
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    findViewById<Button>(R.id.show).setOnClickListener {
//        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
//        builder.setItems(arrayOf<CharSequence>("button 1", "button 2", "button 3", "button 4")) { dialog, btn ->
//            when (btn) {
//                0 ->
//                1 -> Toast.makeText(this, "clicked 2", Toast.LENGTH_SHORT).show()
//                2 -> Toast.makeText(this, "clicked 3", Toast.LENGTH_SHORT).show()
//                3 -> Toast.makeText(this, "clicked 4", Toast.LENGTH_SHORT).show()
//            }
//        }
//        builder.create().show()

        val showDialogFragment = BtnShowFragment()
        showDialogFragment.show(supportFragmentManager, "show")

    }
    }

//    data class showButtons(
//        var label: String = "",
//        var startInterval: Int = 0,
//        var endInterval: Int = 0
//    )


}