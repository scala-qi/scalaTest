package com.qi.scalatest

import scala.util.control.Breaks

/**
  * Created by ThinkPad on 2018/3/26.
  */
object CodeBlock {

  def testBlock() = {
    val x = 123
    val y = 344

    val sum = {
      println(s"x=$x,y=$y,x+y=${x+y}")
      x + y
    }
    println(s"sum的值是：$sum")
  }

  def conditionTest() = {
    val x = 10
    val y = 15
    if(x > y){
      println("x>y")
    }else if (x == y){
      println("x==y")
    }else{
      println("x<y")
    }
  }
  def conditionTest1() = {
    val score = 83
    //定义一个变量，给定一个成绩，成绩大于60 返回 及格，否则返回 不及格
    val level = if(score>=60) "及格" else "不及格"
    println(level)
    //定义一个成绩等级，如果分数大于90 返回 优秀 如果大于 80 返回 良好 大于60 返回一般 否则返回 差
    val result = if(score >90){
      "优秀"
    }else if(score >80){
      "良好"
    }else if(score > 60){
      "一般"
    }else{
      "差"
    }
    println(result)
  }
  def matchCaseTest() = {
    //根据标识符获取性别，0：女，1：男，other：不详
    val sign = 13
    val gender = sign match{
      case 0 => "女"
      case 1 => "男"
      case _ => "不详"
    }
    println(gender)

    val score = 92
    val result = score match{
      case x if x>90 => "优秀"
      case x if x>80 => "良好"
      case x if x>60 => "一般"
      case _ => "差"
    }
    println(result)
  }
  def forLoop() = {
    val array = 1 to (10,2)
    for(x <- array){
      println(x)
    }
    //定义一个集合，它的数值是array的每个集合*2的结果
    val array1 = for(x <- array) yield{
      x*2
    }
    println(array1)
  }
  def forFilterLoop() = {
    val array = 1 to 10
    for(i <- array if (i % 2 ==0 && i<=5)){
      println(i)
    }
  }
  def forLoops() = {
    for(i <- 1 until 10){
      for(j <- 1 until 10){
        println(s"i=$i,j=$j")
      }
    }
    for(i <- 1 until 10; j <- 1 until 10 if j<=i) print(s"$j*$i=${j*i}${if(i>j) " " else "\n"}")
  }
  def breakTest():Unit = {
    val myBreak = new Breaks
    import myBreak.breakable
    import myBreak.break
    breakable(
      for(x <- 4 to 10;y<- 1 to 10){
        if(y == x){
          break()
        }else{
          println(s"y=$y,x=$x")
        }
      }
    )

    for(x<- 4 to 10;y<- 1 to 10){
      if(y == x){
        return ()
      }else{
        println(s"y=$y,x=$x")
      }
    }
  }
  def whileLoop() = {
    var i = 0
    while(i<10) {
      println(s"i=$i")
      i += 1
    }

    do{
      println(s"i=$i")
    }while(i < 10)

//    while(true){
//
//    }
  }
  def main(args: Array[String]): Unit = {
    whileLoop()
  }
}
