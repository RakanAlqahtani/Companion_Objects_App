package com.example.companionobjectsapp

import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class Changingbackground {



    companion object con{

        fun changeBackgrond(layout: View, text : String) : Boolean{


            if(text == "Day" || text == "Day"){

                layout.setBackgroundResource(R.drawable.day)
                return true

            } else if(text == "Night" || text == "Night"){
                layout.setBackgroundResource(R.drawable.night)

                return true

            } else{
         return false
            }


        }



    }

}