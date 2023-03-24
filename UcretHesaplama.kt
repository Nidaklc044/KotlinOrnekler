package com.nidakilic.ornekler

class UcretHesaplama {
    fun UcretHesapla(GB:Int):Int{
        var ucret=0
        if(GB>50){
           val kotaFazlası=GB-50
            ucret=100+kotaFazlası*4
        }
        else{
            ucret=100

        }
        return ucret
    }
}