package utilities

fun main(){
    println(fib(4))
}

private fun fib(n: Int): Int{
    when(n){
        0 -> return 0
        1 -> return 1
        else -> {
            return fib(n - 1) + fib(n - 2)
        }
    }
}