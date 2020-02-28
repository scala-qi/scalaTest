package com.qi.scalatest

import scala.util.control.Breaks

object VairiableTest {


  def testBlock() = {
    var x = 123
    var y = 456

    def sum() = {
      println(s"x=$x,y=$y,x+y=${x + y}")
    }

    println(s"sum=$sum")
  }

  def conditionTest() = {
    val a = 10
    val b = 20
    if (a > b) {
      println("a>b")
    } else {
      println("a<b")
    }
  }

  def conditionTest1(): Unit = {
    val score = 70
    val level = if (score > 60) "pass" else "fail"
    println(level)
  }

  def matchTest(): Unit = {
    val sign = 0
    val gender = sign match {
      case 0 => "mail"
      case 1 => "famale"
      case _ => "unknow"
    }

    println(gender)

  }

  def matchCaseTest() = {

    val score = 13
    val result = score match {
      case x if x > 90 => "优秀"
      case x if x > 80 => "良好"
      case _ => "差"
    }
    println(result)
  }

  def forloop() = {
    val array = 1 to 10;
    for (x <- array) {
      println(s"array is $x")
    }
    val array1=for (x<-array) yield {
      x*2
    }
    println(s"array1 is $array1")
  }

  def forFilter()={
    var array=1 to 10
    for(i<-array if i%2==0){
      println(s"i is $i")
    }
  }

  for(i<-1 until 10;j<-1 until 10 if j<=i){
    print(s"$i*$j=${i*j} ${if (i>j) "\t" else  "\n"}")
  }

  def breakTest():Unit={
    val myBreak=new Breaks
    import myBreak.breakable
    import myBreak.break
    breakable(
      for (x<-4 to 10;y<-1 to 10){
        if (y==x){
          break()
        }else{
          println(s"y=$y,x=$x")
        }

      }
    )

    for (x<-4 to 10;y<-1 to 10){
      if (y==x){
        return()
      }else{
        print(s"y=$y,x=$x")
      }
    }

  }

  def whileLoop(): Unit ={
    var i=0
    while(i<10){
      print(s"i=$i")
      i+=1
    }

    do {
      println(s"i=$i")
    }while(i<10)

  }



  def main(args: Array[String]): Unit = {


    //    for (i <- 1 to 9){
    //
    //      for (j <- 1 to 9 if j<=i){
    //
    //          print(s"$j*$i=${i*j}\t")
    //      }
    //      println()
    //
    //    }

    //    testBlock()
    //    conditionTest()
    //    conditionTest1()
    //    matchTest()
//    matchCaseTest()

//    forloop()

//    forFilter()

//    breakTest()

    whileLoop()


  }

}
