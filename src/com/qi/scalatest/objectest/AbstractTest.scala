package com.qi.scalatest.objectest

abstract class AbstractTest {
  var attr1=""
  var attr2=""
  var attr3:Int

  def method1()=println("调用普通方法1")
  def method2()=println("调用普通方法2")
  def method3():Int

}


class ChildClass extends AbstractTest{
  override var attr3: Int = 32
  override def method3(): Int = {
    println("ChildClass实现的AbstractTest得method3的方法")
    33
  }
}

object  AbstractTestMain{
  def main(args: Array[String]): Unit = {
    val ee = new ChildClass
    println(ee.attr3)
    ee.method3()
    ee.method1()

    //匿名类
    val obj=new AbstractTest {
      override var attr3: Int = 11
      override def method3(): Int = {
        println("在匿名类中实现的AbstractTest得method3的方法")
        22
      }

    }

  }
}