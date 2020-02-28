package com.qi.scalatest.matchcase

/**
  * Created by ThinkPad on 2018/3/30.
  */
sealed abstract class Person1
case class Man() extends Person1
case class Woman() extends Person1

case class Unknown() extends Person1

object SealedTest {
  def main(args: Array[String]): Unit = {
    val m:Person1 = Man()
    m match{
      case Man() => println("对象是个男人")
      case Woman() => println("对象是个女人")
    }
  }
}
