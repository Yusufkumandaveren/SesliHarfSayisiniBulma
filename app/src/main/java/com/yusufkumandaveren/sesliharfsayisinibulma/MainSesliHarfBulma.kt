package com.yusufkumandaveren.sesliharfsayisinibulma

fun sesliHarfSayisi (metin:String):Int {

    var sesliHarfler = setOf('a', 'e', 'ı', 'i','o', 'ö', 'u', 'ü')
    var sesliHarfSayisi = 0
    for(harf in metin){
        if(harf.lowercaseChar() in sesliHarfler){ //lowecaseChar() ifadesi harfleri küçük harf olarak kabul eder.
            sesliHarfSayisi++
        }
    }
    return sesliHarfSayisi
}


fun main() {
    var toplamSesliHarf = sesliHarfSayisi("Fenerbahçe Spor Kulübü")
    println(toplamSesliHarf)
}