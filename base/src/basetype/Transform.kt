package basetype

/**
 * @classname BaseType2
 * @author magic_lz
 * @version 1.0
 * @date 2020/12/4 : 9:28
 */

fun main() {
    // 显式转换
    val b: Byte = 1 // 正确,字面值是静态检测
//    val c : Int = b // 错误
    // 较小的类型不能隐式的转换为较大的类型 但是可以显式转换
    val c: Int = b.toInt()
    println(c)

    /*
    每个数字类型都支持以下显式转换
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
     */

    val l = 1L + 2 // Long + Int = Long
}


