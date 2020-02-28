package com.qi.scalatest.objectest

class Father {
  var fAttr1=""
  var fAttr2=""

  def fMethod1()=println("父类的fMethod1")
  def fMethod2()=println("父类的fMethod2")
}
class  Son(p1:String,p2:String) extends Father{
  val sAttr=""
  def sMethod()=println("子类的sMethod")

  override def fMethod2() = println("在son中重写父类的方法")
}
object extendsTest{
  def main(args: Array[String]): Unit = {
    val son = new Son("s","3")
    son.fMethod1()
    son.sMethod()
    println(son.fAttr1)
    println(son.fAttr2)
    son.fMethod2()

  }
}

