package com.qi.scalatest.connector_test

import java.util.Date

object TupleTest {

  def main(args: Array[String]): Unit = {

    //声明一个tuple
    val t=(1,"张三",20,"2010-02-01","accountno","123456")

    //取值
    println(t._1)
    println(t._2)
    println(t._3)

    val t1=(t._2,t._4,t._4)

    println(t1)

    val (param1,param2,param3)=("333",222,"aaa")

    println(param1)
    println(param2)
    println(param3)

  val Array(arg1,arg2,arg3)=args

    println(s"arg1=$arg1,arg2=$arg2,arg3=$arg3")


  }
}
