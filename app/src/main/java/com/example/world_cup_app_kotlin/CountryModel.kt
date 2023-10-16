package com.example.world_cup_app_kotlin

class CountryModel {
    var name : String = ""
    var cupWins : String = ""
    var flag_img : Int = 0

    constructor(name: String, cupWins: String, flag_img: Int) {
        this.name = name
        this.cupWins = cupWins
        this.flag_img = flag_img
    }
}