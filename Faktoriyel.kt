package com.nidakilic.ornekler

class Faktoriyel {
    fun faktoriyelHesabı(sayi1:Int):Int{
        var sonuc=1
        for(i in 1..sayi1){
            sonuc=sonuc*i
        }
        return sonuc
    }
}