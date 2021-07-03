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

    exceptionExample1()

    f1(0.0, 0.0)
}

fun exceptionExample1(){
    val a = try {
        println(f0(10.0))
    }catch(e: Exception){
        println("${e.message}")
    }finally {
        println("Ten blok wykona się zawsze...")
    }

    println("Dalszy ciąg programu...")

    div(5.0,0.0)
}

fun f0(x: Double):Double{
    //chcielibyśmy żeby argument należał od -1 do 1
    if(x<-1||x>1){
        throw Exception("Argument funkcji powinien należeć od -1 do 1 a wprowadzono ${x}")
    }
    return x
}

fun f1(x: Double, y: Double){
    //chcielibyśmy, żeby oba parametry były dodanie i ich suma mniejsza od 10
    //proszę utworzyć trzy wyjątki
}

fun div(x: Double, y: Double):Double{
    return x/y
}
