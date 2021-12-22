package com.example.companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

  var change = Changingbackground()

        btnChange.setOnClickListener{
            if(etText.text.isNotEmpty()){

              if(  Changingbackground.changeBackgrond(notification_background,etText.text.toString())){}
                else {
                  Toast.makeText(this@MainActivity,"Enter Day or Night", Toast.LENGTH_LONG).show()

              }

            }else{
                Toast.makeText(this@MainActivity,"Enter Day or Night", Toast.LENGTH_LONG).show()


            }

        }

    }
}