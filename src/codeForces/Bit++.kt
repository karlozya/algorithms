package codeForces

/**
 * author: amigoDeConejo
 * created: 04.04.2021
 */

fun main(){
    println(bit())
}

private fun bit(): Int{
    val numberLines = readLine()!!.toInt()
    var result = 0
    for(i in 0 until numberLines){
        val xValue = readLine()
        if(xValue!!.contains("++"))
            result++
        else
            result--
    }
    return result
}