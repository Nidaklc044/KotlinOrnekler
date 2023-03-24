package com.nidakilic.ornekler

class MaasHesaplama {
    fun maasHesapla(gunSayısı:Int):Int{
        val calismaSaati=gunSayısı*8
        println("Calisma Saati:$calismaSaati")
        var maas=0
        if (calismaSaati>160){
            val ekstramesai=calismaSaati-160
        maas=160*10+ekstramesai*20}
        else{
            maas=calismaSaati*10

        }
        return maas
    }
}