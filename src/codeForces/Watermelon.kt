package codeForces

fun main(){
    calc(readLine()!!.toInt())
}

fun calc(watermelon: Int){
    if(watermelon == 1 || watermelon == 2)
        println("NO")
    else if((watermelon - 2) % 2 == 0)
        println("YES")
    else
        println("NO")
}