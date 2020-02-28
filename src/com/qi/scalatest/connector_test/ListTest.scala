package com.qi.scalatest.connector_test

import scala.collection.mutable.ListBuffer

object ListTest {

  def main(args: Array[String]): Unit = {
    //list初始化
    val l1 = List(1, 2, 3, 4)
    val l2 = List("a", "b", "c", "d")
    //list的取值
    println(l1(0))
    println(l2(2))

    //赋值,元素不可变
    //    l1(0)=3
    //    println(l1(0))

    //list的遍历
    for (i <- l1) {
      println(i)
    }


    val nullList = Nil
    println(nullList)


    //:: 方法的调用,调用对象在符号后边

    val added = 555 :: l1
    println(added)

    val l3 = 22 :: 33 :: 44 :: 55 :: Nil
    println(l3)

    val lb=ListBuffer(1,2,3,4)
    val lb1=ListBuffer[String]()
    //取值
    println(lb(0))
    lb1(0)="ccc"
    //赋值
    lb1.append("a","b","v")
    println(lb1)

















  }

}
