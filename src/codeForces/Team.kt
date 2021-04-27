package codeForces

fun main(){
    println(contests())
}

private fun contests():Int{
    val iterations = readLine()!!.toInt()
    var count = 0
    for(i in 0 until iterations){
        val (x , y , z) = readInts()
        if(x == 1 && y == 1 || x == 1 && z == 1 || y == 1 && z == 1)
            count++
    }

    return count
}

private fun readInts() = readLine()!!.split(" ").map { it.toInt() }