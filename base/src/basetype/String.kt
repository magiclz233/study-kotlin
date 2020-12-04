package basetype

/**
 * @classname String
 * @author magic_lz
 * @version 1.0
 * @date 2020/12/4 : 11:31
 */
class String {

}

fun main() {
    val s = "Hello World!"

    // 原始字符串 使用三个引号（"""）分界符括起来，内部没有转义并且可以包含换行以及任何其他字符
    val html = """
        <h1>Hello Kotlin!</h1>
    """
    val str = """
        for (c in "foo")
        print(c)
    """.trimIndent() // 去空格
    println(s)
    println(html)
    println(str)

    // 字符串模板
    val i = 10
    println("i = $i")
    val doc = "doc"
    println("doc.length is ${doc.length}")
    val str1 = """
        i = $i 
        doc.length is ${doc.length}
    """

    println(str1)
}