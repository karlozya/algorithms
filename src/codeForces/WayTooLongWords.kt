package codeForces

fun main(){
    testMultipleLines().forEach(
        System.out::println
    )
}

private fun testMultipleLines(): List<String>{
    val input = readLine()!!.toInt()
    var result = mutableListOf<String>()
    for(i in 0 until input){
        val current = readLine()
        val charA = current!!.toCharArray()
        val len = charA.size
        if(len > 10)
            result.add(current[0]+ "" + (len-2) + ""+ current[len -1])
        else
            result.add(current)
    }
    return result
}