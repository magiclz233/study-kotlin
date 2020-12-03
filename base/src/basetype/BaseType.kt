package basetype

/**
 *@author magic_lz
 *@date 2020/12/3 22:55
 *@version 1.0
 */

fun main() {
    // 数字
    val a = 1  // Int -2^31 - 2^31-1
    val l = 1L // Long -2^63 - 2^63-1
    val b : Byte = 1 // Byte -128 - 127
    val s : Short = 32767 // Short -32768 - 32767

    // var 定义变量  val 定义常量

    // 浮点数
    val pi = 3.14116 // Double
    val e = 2.7182818284 // Double
    val eFloat = 2.7182818284f // float

    //请注意，与一些其他语言不同，Kotlin 中的数字没有隐式拓宽转换。 例如，具有 Double 参数的函数只能对 Double 值调用，而不能对 Float、 Int 或者其他数字值调用。
    fun printDouble(d : Double){
        print(d)}

//    printDouble(a) // 错误：类型不匹配
    printDouble(pi)
//    printDouble(eFloat) // 错误：类型不匹配

    // 数字下划线

    val oneMillion = 1_000_000
    val phone = 150_2131_3333
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010


}