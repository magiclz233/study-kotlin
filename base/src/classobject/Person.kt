package classobject

import javafx.scene.Parent
import java.lang.RuntimeException

/**
 * @classname Person
 * @author magic_lz
 * @version 1.0
 * @date 2020/12/4 : 16:09
 */
class Invoice {}

class Empty

class Person1 constructor(firstName: String) {

}

class Person(private var firstName: String) {
    val firstProperty = "First property: $firstName".also(::println)

    // 初始化
    init {
        if (firstName == "") firstName = "magic"
        println("First initializer block that prints $firstName")
    }

    init {
        println("firstName.length = ${firstName.length}")
    }
}

// 声明类以及主构造函数初始化属性 简单方法
class User(
        val firstName: String,
        val lastName: String,
        val age: Int
){
    init {
        println("User init!")
    }

    var children:MutableList<User> = mutableListOf()
    // 次构造函数
    constructor(
            firstName: String,
            lastName: String,
            age: Int,
            parent: User):this(firstName, lastName, age){
        parent.children.add(this)
    }
}



