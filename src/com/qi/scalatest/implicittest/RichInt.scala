package com.qi.scalatest.implicittest

/**
  * Created by ThinkPad on 2018/3/30.
  */
class RichInt(val i:Int) {
  def printlnMoney() = {
    println(s"￥$i")
  }
  def toFloat() = {println("Int在RichInt中转换成Float")}
}
//class RichInt2(val i:Int){
//  def methodOfRichInt2() = {
//    println("RichInt2中定义的methodOfRichInt2")
//  }
//  def printlnMoney() = {
//    println(s"€$i")
//  }
//}
object ImplicitTest{
  def main(args: Array[String]): Unit = {
    val a:Int = 123
    a.toFloat

//    22.methodOfRichInt2
  }
}