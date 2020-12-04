package basetype

/**
 * @classname Array
 * @author magic_lz
 * @version 1.0
 * @date 2020/12/4 : 11:12
 */
fun main() {
    val arr = Array(5) { i -> (i * i).toString() }
    arr.forEach { println(it) }

    val x = intArrayOf(1, 2, 3)
    val b = byteArrayOf(1, 2, 3)
    // 大小为 5、值为 [0, 0, 0, 0, 0] 的整型数组
    val arr1 = IntArray(5)
    // 例如：用常量初始化数组中的值
    // 大小为 5、值为 [42, 42, 42, 42, 42] 的整型数组
    val arr2 = IntArray(5) { 42 }
    // 例如：使用 lambda 表达式初始化数组中的值
    // 大小为 5、值为 [0, 1, 2, 3, 4] 的整型数组（值初始化为其索引值）
    var arr3 = IntArray(5) { it * 1 }


    // 无符号整型
    val ua: UByte = 23u // 0-255
    val us: UShort = 23u //0-65535
    val ui: UInt = 100u // 0-2^32-1
    val ul: ULong = 10000000u // 0-2^64-1

    val a1 = 42u // UInt：未提供预期类型，常量适于 UInt
    val a2 = 0xFFFF_FFFF_FFFFu // ULong：未提供预期类型，常量不适于 UInt
    val a3 = 1UL //后缀 uL 与 UL 显式将字面值标记为无符号长整型

    // 无符号 特化类
    /*
    kotlin.UByteArray: 无符号字节数组
    kotlin.UShortArray: 无符号短整型数组
    kotlin.UIntArray: 无符号整型数组
    kotlin.ULongArray: 无符号长整型数组
     */
    val arr4 = uintArrayOf(1u,2u,3u,4u)


}