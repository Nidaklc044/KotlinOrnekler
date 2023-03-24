package com.nidakilic.ornekler

class KelimeIçindekiHarfSayisi {
    fun KelimeSayisi(kelime:String,harf:Char){
        var sonuc=0
        for(j in kelime){
            if (j==harf){
                sonuc+=1
            }
        }
        println("harf sayısı:$sonuc")
    }
}