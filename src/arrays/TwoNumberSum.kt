/**
 * Author: Carlos Perez Hermosillo
 * Description:
 *  Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. If
 *  any two numbers in the input array sum up to the target sum, the function should return them in an array, in any order.
 *  If no two numbers sum up to the target sum, the function should return an empty array.
 *
 *  sample input:
 *      array = [3, 5, -4, 8, 11, 1, -1, 6]
 *  sample output:
 *      [-1, 11]
 */

package arrays

fun main(){
    val inp = listOf(3,5,-4,8,11,1,-1,6)
    println(twoNumberSum2(inp, 10))
}

/**
 * O(n^2) time | O(1) space
 */
fun twoNumberSum(array: List<Int>, targetSum: Int): List<Int> {
    var result = mutableListOf<Int>()
    for((index, value) in array.withIndex()){
        for(num2 in array.subList( index + 1, array.size-1)){
            if(value + num2 == targetSum){
                result.add(value)
                result.add(num2)
                return result
            }
        }
    }
    return listOf()
}

/**
 * O(n) time | O(n) space
 */
fun twoNumberSum2(array: List<Int>, targetSum: Int): List<Int>{
    var table = HashMap<Int, Boolean>()
    for(value in array){
        val num = targetSum - value
        if(table.containsKey(num)){
            return listOf(value, num)
        }else{
            table.set(value, true)
        }
    }
    return emptyList()
}