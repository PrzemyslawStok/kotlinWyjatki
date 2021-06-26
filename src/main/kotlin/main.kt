fun main(){
    var array = arrayOf(1,2,3,4,5,6,7,8,9,10)

    try {
        println(array[9])
    }catch(e: ArrayIndexOutOfBoundsException){
        println("Został przechwycony wyjątek...")
    }

    println("Dalszy ciąg programu...")
}
