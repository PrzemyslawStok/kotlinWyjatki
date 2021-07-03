import java.lang.Exception
import java.lang.IllegalArgumentException
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

    try {
        f1(2.0, 12.0)
    }catch(e: IllegalArgumentException){
        println("Funkcja nie działa: ${e.message}")
    }
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

class FunctionArgumentException(message: String): Exception(message)

fun f1(x: Double, y: Double){
    //chcielibyśmy, żeby oba parametry były dodanie i ich suma mniejsza od 10
    //proszę utworzyć trzy wyjątki

    if(x==0.0)
        throw IllegalArgumentException("x nie może wynosić 0")

    if(y==0.0)
        throw IllegalArgumentException("y nie może wynosić 0")

    if(x+y>=10)
        throw FunctionArgumentException("Suma parametrów powinna być mniejsza od 10 a wynosi ${x+y}")
}

fun div(x: Double, y: Double):Double{
    return x/y
}
