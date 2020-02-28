package com.qi.scalatest

/**
  * Created by ThinkPad on 2018/3/30.
  */
object PackageObject1 {
  import com.qi.scalatest.importtest._

  def main(args: Array[String]): Unit = {
    println(PI)
    println(calcArea(5.5))
  }
}
