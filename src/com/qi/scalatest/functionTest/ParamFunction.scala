package com.qi.scalatest.functionTest

/**
  * Created by ThinkPad on 2018/3/29.
  */
object ParamFunction {
  //定义一个函数，这个函数接受的参数是一个函数类型
  //定义一个函数打印数字的计算结果，接受三个参数，x,y被计算的数值，第三个参数用来定义x和y的运算过程
  def printCalc(x:Int, y:Int, f:(Int,Int)=>Int) = {
    val calcResult = f(x,y)
    println(s"${x}和${y}经过函数${f}的计算，结果为：${calcResult}")
  }

  val subtract = (x:Int, y:Int) => x-y

  def main(args: Array[String]): Unit = {
    //两数相加并打印
    printCalc(10, 4, _+_)
    //两数相乘并打印
    printCalc(10, 4, _*_)
    //传递函数的引用 两数相减并打印
    printCalc(10, 4, subtract)

    moneyConvert(43, x=>s"€$x")
    moneyConvert(43, x=>s"${"$"}$x")

    val mt2 = multiplyTimes(2)
    println(mt2(5))
    println(mt2(6))
    val mt3 = multiplyTimes(3)
    println(mt3(5))
    println(mt3(6))


    println("-----------------------")
    val seq = genSequence()
    println(seq())
    println(seq())
    println(seq())
    println(seq())
    val seq1 = genSequence()
    println(seq1())
    println(seq1())
    println(seq1())
    println(seq1())

    println(multiplyTimes(3,4))
    println(sumList(List(1,2,3,4,5)))
  }
  //定义一个函数，这个函数返回一个递增的序列，每调用它一次，他返回的值是上次调用它的数加上一个
  def genSequence() = {
    var varseq = 0
    val addOne = ()=>{
      varseq += 1
      varseq
    }
    addOne
  }
  //定义一个函数，输入1：数字，2：数字和金额符号的字符串转换函数
  //打印转换后的金额
  //10 ￥10   $10
  def normal(x:Int,y:String) = {
    y match{
      case "中国" => println(s"￥$x")
      case "英国" => println(s"€$x")
//        ...
      case _ => println(s"no$x")
    }
  }
  def moneyConvert(x:Int, f:(Int)=>String) = {
    println(f(x))
  }
  //定义一个函数，乘方器，它接受一个参数，int,根据传递的参数得到的结果可以对任意数字进行乘方计算
  def multiplyTimes(x:Int) = {
    (y:Int) =>{
      //计算y的x次方
      var r = 1
      for(i <- 1 to x) r *= y
      r
    }
  }
  //定义一个函数，接受两个参数，x,y，计算x的y次方
  //递归 要求函数必须写返回值类型  尾递归
  def multiplyTimes(x:Int,y:Int) :Int = {
    y match{
      case 1 => x
      case _ =>x*multiplyTimes(x,y-1)
    }
  }
  //定义一个函数，接受一个List类型的参数，使用尾递归的方式，把list上的数字累加并返回
  //List(1,2,3,4,5)
  def sumList(l:List[Int]):Int = {
    l match{
      case Nil => 0
      case _ =>l.head + sumList(l.tail)
    }
  }
}
