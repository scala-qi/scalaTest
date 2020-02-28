package com.qi.scalatest.implicittest

/**
  * Created by ThinkPad on 2018/3/30.
  */
object ImplicitParam {
  def printMoney(implicit x:Int) = {
    println(s"€$x")
  }

  def sum(implicit x:Int,y:Int) = {
    x+y
  }

  def sum1(x:Int,y:Int) = x+y
  def sum2(x:Int)(y:Int) = x+y

  def sum3(x:Int)(implicit y:Int,z:Int) = x+y+z

  def sum4(x:Int, y:Int=123 ) = x+y

  def sum5(x:Int=20, y:Int) = x+y
  def printxyz(x:Int,y:Int,z:Int) = {
    println(s"x:$x,y:$y,z:$z")
  }
  def main(args: Array[String]): Unit = {
    printMoney
    printMoney(332)

    println(sum2(5)(10))
    val k1 = sum2(10)(_)
    println(k1(8))
    printMoney
    println(sum3(10))

    println(sum4(6))
    println(sum4(7,9))

    println(sum5(y=22))

    printxyz(z=19,x=3,y=12)

    try{
      val a = Array(1,2,3,4,5)
      throw new NullPointerException()
      println(a(5))

    }catch{
      case e:ArrayIndexOutOfBoundsException => println("抛出了数组越界异常")
      case e:Exception => println("抛出了异常")
    }
  }


}
