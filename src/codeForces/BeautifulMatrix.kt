package codeForces

var result = ""

fun main(){
    beautiful()
}

private fun beautiful(){
    calculate(readFromUser(), 1)
    calculate(readFromUser(), 2)
    calculate(readFromUser(), 3)
    calculate(readFromUser(), 4)
    calculate(readFromUser(), 5)
    println(result)
}

private fun calculate(input: List<Int>, row: Int){
    for((index, value) in input.withIndex()){
        if(value == 1){
            var column = index + 1
            beat(column, row)
        }
    }
}

private fun beat(column: Int, row: Int){
    var sum = 0
    if(column > 3){
        sum += column - 3
    }else if(column < 3){
        sum += 3 - column
    }

    if(row > 3){
        sum += row - 3
    }else if(row < 3){
        sum += 3 - row
    }

    result = sum.toString()
}


private fun readFromUser() = readLine()!!.split(" ").map { it.toInt() }