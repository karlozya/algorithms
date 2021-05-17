/**
 * Author: Carlos Perez Hermosillo
 * Description:
 *  Write a function that takes in a Binary Search Tree and a target integer value and returns the closest value to that
 *  target value contained in the BST.
 *  You can assume that there will only be one closest value.
 *
 *  sample input Tree:
 *
 *              10
 *             /  \
 *            5    15
 *           / \  /  \
 *          2  5 13  22
 *         /       \
 *        1         14
 *
 *        target = 12
 *  sample output:
 *      13
 */

package easy.BinarySearchTree

import kotlin.math.abs

fun main(){
    val tree = BST(10)
    tree.left = BST(5)
    tree.left!!.left = BST(2)
    tree.left!!.left!!.left = BST(1)
    tree.left!!.right = BST(5)
    tree.right = BST(15)
    tree.right!!.left = BST(13)
    tree.right!!.left!!.right = BST(14)
    tree.right!!.right = BST(22)

    println(findClosestValueInBst(tree, 11))
}

open class BST(value: Int) {
    var value = value
    var left: BST? = null
    var right: BST? = null
}

/**
 * O(log(n)) time | O(1) space - where n is the number of nodes in the BST
 */
fun findClosestValueInBst(tree: BST, target: Int, closest: Int? = 1): Int {

    var dif = tree.value - target
    var dif2 = closest!! - target

    if(target < tree.value && tree.left != null)
        return findClosestValueInBst(tree.left!!, target, if(abs(dif) < abs(dif2)) tree.value else closest)
    else if (tree.right != null)
        return findClosestValueInBst(tree.right!!, target, if(abs(dif) < abs(dif2)) tree.value else closest)

    return if(abs(dif) > abs(dif2)) closest else tree.value
}