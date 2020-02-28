package com.qi.scalatest.objectest

trait TraitTest {

  var attr1 = ""
  var attr2: String

  def method1() = println("执行TrainTest实现方法method1")

  def method2()
}

trait TraitTest1 {
  def method1() = println("执行TrainTest1实现的方法method1")

  def method3()
}

class TraintTestImpl extends TraitTest with TraitTest1 {
  override var attr2: String = "ccc"

  override def method2(): Unit = println("执行实现类中的实现方法method2")

  override def method3(): Unit = println("执行实现类中的实现方法method3")

  override def method1(): Unit = println("执行实现类中的method1")

}

object TraitTestMain {
  def main(args: Array[String]): Unit = {

    val ti = new TraintTestImpl
    println(ti.attr1)
    println(ti.attr2)
    ti.method1()
    ti.method2()
  }
}