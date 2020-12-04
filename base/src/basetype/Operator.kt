package basetype

/**
 * @classname Operator
 * @author magic_lz
 * @version 1.0
 * @date 2020/12/4 : 9:36
 */

fun main() {
    // 基本运算  + - * /
    val a = 1 + 2
    val b = a * a
    val c = b - a
    // 整数运算的除法总会返回整数,丢弃掉小数部分
    val d = 5L / 2
    println(a)
    println(b)
    println(c)
    println(d)

    // 位运算
    /*
    位运算列表
    shl(bits) – 有符号左移
    shr(bits) – 有符号右移
    ushr(bits) – 无符号右移
    and(bits) – 位与
    or(bits) – 位或
    xor(bits) – 位异或
    inv() – 位非
     */
    val x = (1 shr 2)
    println(x)


    // 比较运算符
    // == != < > <= >=
    // 区间实例及区间检测  a..b, x in a..b  x !in a..b
    println(1 == 2)
    println(1 < 2)
    println(1 in 1..2)

    // 字符 Char
    // Char不能直接当作数字使用
    val char: Char = '1'
    println(charToInt(char))

    // 布尔 Boolean true/false
    /*
    内置布尔运算
    &&  ||  ！
     */

}

fun charToInt(c: Char): Int {
    if(c in 'a'..'z')
        throw IllegalAccessException("NOT NUMBER")
    return c.toInt() * 2
}