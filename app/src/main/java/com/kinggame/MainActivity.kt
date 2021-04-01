package com.kinggame

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kinggame.Adapter.GameAdapter
import com.kinggame.Model.GameModel

class MainActivity : AppCompatActivity() {
    private var levelList= ArrayList<GameModel>()
    private lateinit var adapter: GameAdapter

    var levelName = arrayOf<String>("Level 1","Level 2","Level 3","Level 4","Level 5","Level 6","Level 7","Level 8","Level 9","Level 10","Level 11","Level 12","Level 13","Level 14","Level 15","Boss Level")
    var levelNumber= arrayOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)
    var image= arrayOf<Int>(R.drawable.level,R.drawable.level,R.drawable.level,R.drawable.level,R.drawable.level,R.drawable.level,R.drawable.level,R.drawable.level,R.drawable.level,R.drawable.level
        ,R.drawable.level,R.drawable.level,R.drawable.level,R.drawable.level,R.drawable.level,R.drawable.level)

    var c : Int=0
    lateinit var totalCoins : TextView
    lateinit var totalGems : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var intent1= intent
        var totalcash= intent1.getIntExtra("totalcash",0)
        var totalgem= intent1.getIntExtra("totalgem",0)

        totalCoins = findViewById<TextView>(R.id.tvTotalCoins)
        totalGems= findViewById<TextView>(R.id.tvTotalGems)
        totalCoins.setText(totalcash.toString())
        totalGems.setText(totalgem.toString())



        val recyclerView : RecyclerView= findViewById(R.id.rvGame)
        val layoutManager= LinearLayoutManager(applicationContext)
        layoutManager.reverseLayout=true
        recyclerView.layoutManager= layoutManager

        for ((item, value) in levelName.withIndex()){
           var model= GameModel(image[item],levelName[item],levelNumber[item],c)
            levelList.add(model)
        }

        Log.e("pageup",levelList.toString())

        adapter= GameAdapter(applicationContext,levelList)
        recyclerView.adapter= adapter

        recyclerView.setHasFixedSize(true)
        recyclerView.scrollToPosition(0)


    }

    fun getNumber() : Int{
        var a= Integer.parseInt(totalCoins.text.toString())
        var b= Integer.parseInt(totalGems.text.toString())

        when(a){
            0->{
                c=0
            }
            100->{
                c=1
            }
            200->{
                c=2
            }
            300->{
                c=3
            }
            400->{
                c=4
            }
            500->{
                c=5
            }
            600->{
                c=6
            }
            700->{
                c=7
            }
            800->{
                c=8
            }
            900->{
                c=9
            }
            1000->{
                c=10
            }
            1100->{
                c=11
            }
            1200->{
                c=12
            }
            1300->{
                c=13
            }
            1400->{
                c=14
            }
            1500->{
                when(b){
                    0->{
                        c=15
                    }
                    10->{
                        c=16
                    }

                }

            }

        }
        return c
    }
}