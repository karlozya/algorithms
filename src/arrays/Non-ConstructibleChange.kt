/**
 * Author: Carlos Perez Hermosillo
 * Description:
 *  Given an array of positive integers representing the values of coins in your possession, write a function that
 *  returns the minimum amount of change (the minimum sum of money) that you cannot create. The given coins can have
 *  any positive integer value and aren't necessarily unique (i.e., you have multiple coins of the same value).
 *
 *  For example, if you're given coins = [1, 2, 5], the minimum amount of change that you can't create is 4.
 *  If you're given no coins, the minimum amount of change that you can't create is 1.
 *
 *  sample input:
 *      coins = [1, 5, 1, 1, 1, 10, 15, 20, 100]
 *  sample output:
 *      55
 */

package arrays

fun main(){
    val input = mutableListOf(1, 5, 1, 1, 1, 10, 15, 20, 100)
    println(nonConstructibleChange(input))
}

/**
 * O(n log n) time | O(1) space
 */
fun nonConstructibleChange(coins: MutableList<Int>): Int {
    coins.sort()

    var currentChangeCreated = 0

    for(coin in coins){
        if(coin > currentChangeCreated + 1) return currentChangeCreated + 1
        currentChangeCreated += coin
    }
    return currentChangeCreated + 1
}

