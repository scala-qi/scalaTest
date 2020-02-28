package com.qi.scalatest.connector_test

import scala.collection.mutable.ArrayBuffer

object ArrayBufferTest {


  def main(args: Array[String]): Unit = {
    //声明
    val ab=ArrayBuffer[String]()
    val ab1=ArrayBuffer(1,2,3)
    //添加元素
    ab.append("one","two","three")
    ab1.append(333)
    println(ab.mkString(","))
    println(ab1.mkString(","))
    //获取元素
    println(ab(1))
    //修改元素
    ab(0)="zero"
    println(ab.mkString(","))

    //删除元素
    ab.remove(1)
    println(ab.mkString(","))

    //转换为Array
    val arr= ab.toArray
    println(s"$arr:${arr.mkString(",")}")

//把一个集合中的元素添加到ArrayBuffer中
    ab++=arr
    println(ab.mkString(","))

    //删除ab中的"s"元素
    ab-="s"
    println(ab.mkString(","))

  val arrayBuffer1=ArrayBuffer("a","b","c","f")
  val arrayBuffer2=ArrayBuffer("d","c","f","g")
    println(arrayBuffer1.union(arrayBuffer2))
    println(arrayBuffer1.intersect(arrayBuffer2))


















  }

}
