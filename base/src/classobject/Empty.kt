package classobject

/**
 * @classname Empty
 * @author magic_lz
 * @version 1.0
 * @date 2020/12/4 : 17:04
 */

class Test1 constructor(num: Int){
    init {
        println("num = $num")
    }

    // 次级构造函数
    /*
    说明：二级构造函数中的参数1(num)，是委托了主构造函数的参数num。
    可以看出，当实例化类的时候只传1个参数的时候，只会执行init代码块中的代码。
    当传2个参数的时候，除了执行了init代码块中代码外，还执行了二级构造函数中的代码。
     */
    constructor(num: Int, num2: Int) :this(num){
        println(num + num2)
    }
}

fun main() {
//    var test11 = Test1(1)
//    var test12 = Test1(1,2)


    var test = Test2()
    var test1 = Test2(1,2)
    var test2 = Test2(4,5,6)
}

//当类的主构造函数都存在默认值时的情况
class Test2(num1: Int = 10,num2 : Int= 20){
    init {
        println("num1 = $num1\t num2 = $num2")
    }
    constructor(num1 : Int = 1, num2 : Int = 2, num3 : Int = 3) : this(num1 , num2){
        println("num1 = $num1\t num2 = $num2 \t num3 = $num3")
    }
}