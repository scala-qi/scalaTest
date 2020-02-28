package com.qi.scalatest

object HomeWork {

  def BMI(hight: Double, weight: Double): Unit = {

    var bmi = (weight / (hight * hight)).formatted("%.1f").toDouble

    var result = bmi match {
      case x if x < 18.5 => "过轻"
      case x if x >= 18.5 && x < 23.9 => "正常"
      case x if x >= 24 && x <= 27 => "过重"
      case x if x >= 28 && x < 32 => "肥胖"
      case x if x > 28 => "非常肥胖"
    }
    println(s"您的BMI为$bmi,$result")
  }

  def triangle(a: Int, b: Int, c: Int): Unit = {

    var result = if ((a + b > c) && (a + c > b) && (b + c > a)) {
      true
    } else {
      false
    }
    println(result)
  }


  def getDayOfYear(year: Int, month: Int, day: Int): Unit = {
    var day1Array = Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    var day2Array = Array(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    var sum = 0;
    var result = if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
      for (n <- 0 until day2Array.length if n < month - 1) {
        sum += day2Array(n)
      }
      sum += day
    } else {
      for (n <- 0 until day2Array.length if n < month - 1) {
        sum += day2Array(n)
      }
      sum += day
    }

    println(sum)

  }


  def getCountNum(num: Int): Unit = {
    var strNum = num.toString

    println(strNum.length)
  }

  def getSum(): Unit ={

    var sum=0
    var i=1
    while (i<=200){
      if (i%3==0){
        sum+=i
      }
      i+=1
    }

    println(sum)
  }


  def main(args: Array[String]): Unit = {

    //    BMI(1.81,85)

    //    triangle(3,4,5)

    //    getDayOfYear(2018,3,26)

//    getCountNum(423534)

    getSum()
  }


}
