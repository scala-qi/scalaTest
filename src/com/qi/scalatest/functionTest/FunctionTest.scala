package com.qi.scalatest.functionTest

object FunctionTest {

  //无等号为执行过程,无返回值
  //  def preceduce(){
  //    println("执行过程: ")
  //    1234
  //  }

  def functionSimple(): Unit = {
    var arr = Array(1, 2, 3, 4, 5)
    val result1 = arr.map((x: Int) => x + 1)
    println(arr.mkString(","))

    //使用花括号调用函数
    val result2 = arr.map {
      val y = 1
      (x: Int) => x + y
    }
    //函数调用时可以省略点,如果只有一个参数,还课题省略小括号
    val result3 = arr map ((x: Int) => x + 1)

    val result4 = arr foreach println

    val result5 = arr update(1, 2)

    //函数类型推断写法
    //当一个函数的参数是一个函数的时候,参数函数的类型是可以推断的

    //正常
    //    val result6=arr.dropWhile((x:Int)=>x%2==0)
    //推断
    val result7 = arr.dropWhile(x => x % 2 == 0)

    //当可推断的参数函数,在函数体被使用一次的时候,参数名称可以使用_来代替
    //同时省略=>
    val result8 = arr.dropWhile(_ % 2 == 0)

    //如果可推断的参数函数有多个参数.并且在函数体内对这个参数的使用是按顺序来使用的话,
    // 可以省略参数名称和=>
    val result9 = arr.reduce((x1, x2) => x1 + x2)
    val result10 = arr.reduce(_ + _)
    println("=======================================================")
    val ints = List(1, 2, 3, 4, 5)
    val result = ints.aggregate("")(
      (c, v) => if (c == "") s"$v" else s"$c=>$v"
      ,
      (v1, v2) => s"$v1=>$v2"
    )

    println(result)
  }

  //声明两个函数来计算两个int的累加值
  //法一
  def sum(x: Int, y: Int): Int = x + y

  //法二
  val valSum: (Int, Int) => Int = (x: Int, y: Int) => x + y

  //当函数字面量可以被推断时,字面量函数的参数类型可以被省略
  val valSum1:(Int,Int) =>Int=(x,y)=>x+y

  val valSum3=(_:Int) + (_:Int)
  val valSum2:(Int,Int) =>Int=_+_
  val valSum4=(x:Int,y:Int)=>x+y


  val sayHello: (String) => Unit = (x) => println(s"hello $x")

  def sayHelloDef(x: String) = {
    println(s"hello $x")
  }

  def sayHelloNoParam() = {
    println(s"hello")
  }

  def main(args: Array[String]): Unit = {


    //    val a=preceduce()
    //    println(a)

    //    functionSimple()


    //    sayHello("you")
    //
    //    println(sayHello)
    //
    //    println(sayHello("me"))

    //    sayHelloDef("aaa")
    //  println(sayHelloDef)
    //    println(sayHelloDef("cc"))

    sayHelloNoParam
    println("-------------------------")
    sayHelloNoParam()
    println("-------------------------")

    println(sayHelloNoParam())
    println("-------------------------")

    println(sayHelloNoParam)
  }


}
