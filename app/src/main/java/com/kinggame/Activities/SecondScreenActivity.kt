package com.kinggame.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.kinggame.MainActivity
import com.kinggame.R

class SecondScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)
        var tvlevelName = findViewById<TextView>(R.id.levelName)
        var btnNext= findViewById<Button>(R.id.btnNext)

        var intent= intent
        var levelName= intent.getStringExtra("levelName")
        var levelNumber = intent.getIntExtra("levelNumber",1)
        tvlevelName.setText(levelName)

        btnNext.setOnClickListener(){
            when(levelNumber){
                1->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",100)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                2->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",200)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                3->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",300)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                4->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",400)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                5->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",500)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                6->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",600)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                7->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",700)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                8->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",800)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                9->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",900)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                10->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",1000)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                11->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",1100)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                12->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",1200)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                13->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",1300)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                14->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",1400)
                    intent1.putExtra("totalgem",0)

                    startActivity(intent1)
                }
                15->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",1500)
                    intent1.putExtra("totalgem",0)
                    startActivity(intent1)
                }
                16->{
                    var intent1= Intent(this,MainActivity::class.java)
                    intent1.putExtra("totalcash",1500)
                    intent1.putExtra("totalgem",10)
                    startActivity(intent1)
                }
            }
        }

    }
}