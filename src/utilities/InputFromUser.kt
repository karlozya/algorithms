package utilities

fun main(){
    val (n , m) = readInts()

    println("Hello $n $m")
}


private fun readInts() = readLine()!!.split(" ").map { it.toInt() }