package com.qi.scalatest

/**
  * Created by ThinkPad on 2018/3/30.
  */
package object implicittest {
  //隐式转换把Int隐式转换成RichInt类型
  //隐式转换是一个方法，方法前面用implicit作为修饰符
  //隐式转换函数的重心部分在于参数类型和返回值类型，它的作用是把参数的类型隐式转换成返回值的类型
  //从而让参数的类型具有返回值类型的功能和属性
  //隐式转换的函数的名称是什么不重要,
  //隐式转换一般被用于对已有类型的扩展上
  //当隐式转换的目标类型的方法和原类型的方法冲突时以原类型的方法为准
  //隐式转换可以把一个类型转换成多个其他类型，原类型转换后就具有其他多个类型的功能和属性
  //当多个其他类型之间有某个方法冲突时，原类型就不具有调用该方法的能力
  implicit def abc(i:Int) = {
    new RichInt(i)
  }
  implicit def ddd(i:Int) = {
//    new RichInt2(i)
  }

  implicit val i:Int = 4543
//  implicit val j:Int = 2222

}
