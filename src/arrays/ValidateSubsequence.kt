/**
 * Author: Carlos Perez Hermosillo
 * Description:
 *  Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of
 *  the first one.
 *
 *  sample input:
 *      array = [5, 1, 22, 25, 6, -1, 8, 10]
 *      sequence = [1, 6, -1, 10]
 *  sample output:
 *      true
 */

package arrays

fun main(){
    val inp = listOf(5, 1, 22, 25, 6, -1, 8, 10)
    val subsequence = listOf(22, 25, 6)
    print(isValidSubsequence(inp, subsequence))
}

/**
 * O(n) time | O(1) space
 */
fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
    var isValid = 0
    var pointer = 0
    for(value in array){
        if(value == sequence[pointer]){
            isValid++
            if(isValid == sequence.size)
                return true
            pointer++
        }
    }

    return false
}