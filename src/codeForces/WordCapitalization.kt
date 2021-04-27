package codeForces

import java.lang.StringBuilder

fun main(){
    println(capitalization())
}

private fun capitalization(): String{
    var res = StringBuilder()
    val input = readLine()!!.toCharArray()
    for((index, value) in input.withIndex()){
        if(index == 0)
            res!!.append(value.toUpperCase())
        else
            res!!.append(value)
    }
    return res.toString()
}

