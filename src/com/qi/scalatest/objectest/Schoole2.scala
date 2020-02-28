package com.qi.scalatest.objectest

/**
  * Created by ThinkPad on 2018/3/28.
  */
class Schoole2 {
  var schooleName = ""
  var address = ""
}
object Schoole2 {
  def apply():Schoole2 = new Schoole2
  def apply(name:String, address:String) = {
    val result = new Schoole2
    result.schooleName = name
    result.address = address
    result
  }
}
object SchooleTest2{
  def main(args: Array[String]): Unit = {
    //实例化一个schoole的对象
    val sobj = Schoole2()
    sobj.address = "sssss"
    sobj.schooleName = "ffff"
    println(s"${sobj.address}----${sobj.schooleName}")
    val sobj1 = Schoole2()
    println(sobj.hashCode())
    println(sobj1.hashCode())
    val sobj2 = Schoole2("智游","第五大街")
    println(s"${sobj2.address}---${sobj2.schooleName}")
  }
}
