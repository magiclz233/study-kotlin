package basetype

import kotlin.String

/**
 * @classname NotNull
 * @author magic_lz
 * @version 1.0
 * @date 2020/12/4 : 17:30
 */
fun main() {
    var str: String? = "123456"
    str = null

    // ？.
    // 传统写法
    if (str != null) {
        println(str.length)
    }
    println(str?.length)
    fullNullMethod()

    // let 操作符的作用：当时用符号?.验证的时候忽略掉null
    val att :Array<Int?> = arrayOf(1,null,3,null,5,null,7)
    // 传统写法
    for (index in att) {
        if (index == null){
            continue
        }
        println("index => $index")
    }
    for (index in att){
        index?.let { println("index => $it") }
    }

    // Evils操作符
    /*
    Evils其实不是一个操作符，而是evil的复数，而evil的意思在这里可以理解为屏蔽、安全的操作符，这样的操作符有三种：

    ?: 这个操作符表示在判断一个可空类型时，会返回一个我们自己设定好的默认值.
    !! 这个操作符表示在判断一个可空类型时，会显示的抛出空引用异常（NullPointException）.
    as? 这个操作符表示为安全的类型转换
     */

    var testStr : String? = null
    var length = 0

    // ?:
    // 例： 当testStr不为空时，输出其长度，反之输出-1
    // 传统写法
    length = if (testStr != null) testStr.length else -1
    // ?: 写法
    length = testStr?.length ?: -1
    println(length)

    // !!
    val testStr1 :String? = null
    println(testStr1!!.length) // NullPointException

    // as
    // 会抛出ClassCastException异常
    val num1 : Int? = "Koltin" as Int
    println("num1 = $num1")

    // as?
    val num2 : Int? = "Kotlin" as? Int
    println("num2 = $num2")  // null
}



fun fullNullMethod() :Int?{
    var str :String? = "123456"
    return str?.length
}