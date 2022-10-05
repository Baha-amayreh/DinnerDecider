package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var list= arrayListOf<String>("Hamburger","Pizza",
        "Mexican","American","Chinese")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDecide.setOnClickListener {
            var index= Random.nextInt(list.size)
            textView.text=list.get(index).toString()
        }
        btnAddFood.setOnClickListener {
            var x=editText.text.toString()
            if(!x.trim().equals("")){
                this.list.add(x)
                editText.setText("")
            }

        }

    }
}