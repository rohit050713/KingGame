package com.kinggame.Model

class GameModel(image: Int?,levelName: String?,levelNumber : Int?, coinNumber : Int?) {

    private var image : Int
    private var levelName : String
    private var levelNumber : Int
    private var coinNumber : Int
    init {
        this.image=image!!
        this.levelName=levelName!!
        this.levelNumber= levelNumber!!
        this.coinNumber= coinNumber!!
    }

    fun getImage() : Int{
        return image
    }

    fun getLevelName() : String {
        return levelName
    }

    fun getLevelNumber() : Int {
        return levelNumber
    }
    fun getCoinNumber() : Int {
        return coinNumber
    }


    fun setImage(image : Int){
        this.image=image!!
    }

    fun setlevelName(levelName : String){
        this.levelName=levelName!!
    }

    fun setlevelNumber(levelNumber : Int){
        this.levelNumber=levelNumber!!
    }
    fun setCoinNumber(coinNumber : Int){
        this.coinNumber=coinNumber!!
    }


}