/**
 * Author: Carlos Perez Hermosillo
 * Description:
 *  Write a function that takes in a non-empty array of integers that are sorted in ascending order and returns a new array
 *  of the same length with the squares of the original integers also sorted in ascending order.
 *
 *  sample input:
 *      array = [1, 2, 3, 5, 6, 8, 9]
 *  sample output:
 *      [1, 4, 9, 25, 36, 64, 81]
 */

package easy.arrays

import kotlin.math.abs

fun main(){
    val arr = listOf(-10, -5, 0, 5, 10)
    println(sortedSquaredArrayN(arr))
}


/**
 * O(n) time | O(n) space
 */
fun sortedSquaredArrayN(array: List<Int>): List<Int>{
    var result = mutableListOf<Int>()
    var left = 0
    var right = array.size -1
    while(left < right + 1){
        var l = array[left]
        var r = array[right]
        if(abs(l) >= abs(r)){
            var increase = l * l
            result.add(0, increase)
            left++
        }else{
            var increase = r * r
            result.add(0, increase)
            right--
        }
    }
    return result
}

/**
 * O(n log n) time | O(n) space
 */
fun sortedSquaredArray(array: List<Int>): List<Int>{
    var result = mutableListOf<Int>()
    for(value in array){
        val square = value * value
        result.add(square)

    }
    return result.sorted()
}

