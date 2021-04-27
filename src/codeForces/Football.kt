package codeForces

fun main(){
    println(isDanger())
}

private fun isDanger(): String{
    val input = readLine()!!.toCharArray()
    var teamA = 0
    var teamB = 0
    for(i in input){
        if(i == '0'){
            teamA++
            teamB = 0
        }else{
            teamB++
            teamA = 0
        }

        if(teamA == 7 || teamB == 7)
            return "YES"
    }
    return "NO"
}