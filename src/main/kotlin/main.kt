import java.lang.Exception
import java.lang.RuntimeException

fun main(){
    var array = arrayOf(1,2,3,4,5,6,7,8,9,10)

    try {
        println(array[10])
    }catch(e: ArrayIndexOutOfBoundsException){
        println("Macierz nie zawiera elemntu o indeksie ${e.message}")
    }

    println("Dalszy ciąg programu...")

    println(f0(110.5))
}

fun f0(x: Double):Double{
    //chcielibyśmy żeby argument należał od -1 do 1
    if(x<-1||x>1){
        throw Exception("Wiadomość...")
    }
    return x
}
