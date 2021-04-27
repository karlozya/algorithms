package codeForces

fun main(){
    var coins = readLine()!!.split(" ").map { it.toInt() }
    val counter = 1
    val hashT = HashMap<Int, Int>()
    println(biggest(coins, hashT, counter))
}


private fun biggest(input: List<Int>, subList: HashMap<Int, Int>, counter: Int): Int{
    var biggest = 0
    var ind = 0

    var brother = 0
    var me = 0

    for((index, value) in input.withIndex()){
        var valueFrom = subList.containsKey(index)
        if(!valueFrom){
            if(value > biggest){
                biggest = value
                ind = index
            }
        }
    }

    subList.set(ind, biggest)

    for((index, value) in input.withIndex()){
        var isInList = subList.containsKey(index)
        if(isInList){
            me += subList.get(index)!!
        }else{
            brother += value
        }
    }

    if(me > brother)
        return counter
    else
        return biggest(input, subList, counter + 1)
}