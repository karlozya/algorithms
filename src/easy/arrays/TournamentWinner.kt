/**
 * Author: Carlos Perez Hermosillo
 * Description:
 *  Given an array of pairs representing the teams that have competed against each other and an array containing the results
 *  of each competition, write a function that returns the winner of the tournament. The input arrays are named competitions
 *  and results, respectively. THe competitions array has elements in the form of [homeTeam, awayTeam], where each team
 *  is a string of at most 30 characters representing the name of the team. The results array contains information about
 *  the winner of each corresponding competition in the competitions array. Specially, results[i] denotes the winner of
 *  competitions[i], where a 1 in the results array means that the home team in the corresponding competiton won and a 0
 *  means that the away team won.
 *
 *  sample input:
 *      competitions = [
 *          ["HTML", "C#"],
 *          ["C#", "PYTHON"],
 *          ["PYTHON", "HTML"]
 *      ]
 *      results = [0, 0, 1]
 *
 *  sample output:
 *      "PYTHON"
 *
 */

package easy.arrays

import java.lang.StringBuilder

fun main(){
    val l = mutableListOf<List<String>>()
    l.add(listOf("HTML", "C#"))
    l.add(listOf("C#", "PYTHON"))
    l.add(listOf("PYTHON", "HTML"))

    val results = listOf(0, 0, 1)

    println(tournamentWinner(l, results))
}

/**
 * O(n) time | O(k) space - where n is the number of competitions and k is the number of teams
 */
fun tournamentWinner(competitions: List<List<String>>, results: List<Int>): String {
    val languages = mutableMapOf<String, Int>()
    for((index, i) in competitions.withIndex()){
        val point = if (results.get(index) == 1) 0 else 1
        val count = languages.get(i.get(point)) ?: 0
        languages.put(i.get(point), count + 1)
    }
    var greater = 0
    var lan = StringBuilder()
    for(j in languages){
        if(j.value > greater){
            greater = j.value
            lan.setLength(0)
            lan.append(j.key)
        }
    }
    return lan.toString()
}