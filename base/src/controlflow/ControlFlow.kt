package controlflow

/**
 * @classname ControlFlow
 * @author magic_lz
 * @version 1.0
 * @date 2020/12/4 : 14:25
 */

/*
 控制流  if when for while
 */
fun main() {
    ifControl()
    whenControl(5)
    forControl(intArrayOf(1,2,3,4,5,6))
    whileControl(2)
}

fun whileControl(x: Int){
    while (x > 0){
        println("x > 0")
        break
    }

    do {
        print(x + 1)
    } while ( x > 2)
}

fun forControl(array: IntArray){
    for (arr in array) println(arr)

    for (i in 1..3){
        println(i)
    }

    for (i in 6 downTo 0 step 2){
        println(i)
    }

    for (i in array.indices) println(array[i])

    for ((index,value) in array.withIndex()) println("the array at $index is $value")

    array.forEach { println(it) }
}

fun whenControl(x: Int){
    when(x){
        1 -> println("x == 1")
        2-> println("x == 2")
        else -> {
            println("x is not 1 and 2")
        }
    }

    when(x){
        1,2 -> println("x == 1 or 2")
        else -> println("not 1 or 2")
    }

    // 使用表达式当分支条件
    when(x){
        parseInt(x) -> println("x == s")
        else -> println("otherwise")
    }

    val valueNums = 10..20
    when(x){
        in 1..10 -> println("x in 1-10")
        in valueNums -> println("x in 10-20")
        else -> println("not in 1-20")
    }

    // 当作函数返回值使用
    fun hasPrefix(x : Any) = when(x){
        is String -> x.startsWith("PREFIX")
        else -> false
    }
    println(hasPrefix(x))

    // 替代if - else if 使用
    val c = 10
    val d = 11
    when {
        c%2 == 1 -> print("x is odd") // odd 奇数 even 偶数
        d%2 == 0 -> print("y is even")
        else -> print("x+y is odd.")
    }
}

fun parseInt(x : Int): Int{
    return x
}
fun ifControl(){
    val a = 6
    val b = 7
    var max = a
    if (a < b) max = b
    println(max)

    val m = if (a< b) a else b

    val ms = if(a < b){
        print("Choose a")
        a
    }else{
        print("Choose b")
        b
    }
    println(" = $ms")
}