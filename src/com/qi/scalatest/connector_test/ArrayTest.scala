package com.qi.scalatest.connector_test

object ArrayTest {

  def main(args: Array[String]): Unit = {
    //Array的初始化
    val array1 = Array(1, 2, 3, 4)
    val strArray: Array[String] = Array("123", "abc", "def")
    //取值
    println(array1(0))
    println(strArray(1))
    //    修改值
    array1(0) = 100
    println(array1(0))

    //    遍历
    //    for (x <- strArray) println(x)

    //    for(i<- 0 to strArray.length-1) println(strArray(i))

    strArray.foreach(x => println(x))

    for (i <- array1.filter(x => x % 2 == 0)) {
      println(i)
    }

    println("---------------------------------------")
    var sum = 0
    array1.foreach(x => sum += x)
    println(sum)


    //map函数
    val fruits = Array("apple", "pear", "banana", "tomato")
    // 生成一个数组,数组的每个元素对应fruits的每个元素长度
    val fruitsLength = fruits.map(x => x.length)

    for (i <- 0 until fruitsLength.length) {

      println(s"${fruits(i)}的长度是${fruitsLength(i)}")

    }


    val sumresult = fruitsLength.reduce((v1, v2) => v1 + v2)

    println(sumresult)



    val fruitResult=fruits.aggregate(0)((x:Int, y:String)=>x+y.length,(x1:Int,x2:Int)=>x1+x2)

  println(sumresult)


  val countResult=fruits.aggregate(0)((x:Int,y:String)=>x+y.count(c=>c=='a'),(x1:Int,x2:Int)=>x1+x2)

    println(countResult)


    //sorted方法
//val result2=forSort.sorted
//    println("----------------------------------")
//    result2.foreach(x=>println(x))

//    val result3=forSort.sorted(new Ordering[Int]{
//      override def compare(x: Int, y: Int): Int = y.compareTo(x)
//    })
//
//    println("=====================")
//    result3.foreach(x=>println(x))

//向数组添加元素
    val forAdd=Array("abc","def","aaa")
    val added=forAdd :+ "fea"

    println("-------------------------")

//    added.foreach(x=>println(x))

//+:和:+这样的操作符,在执行时,:冒号离谁近就调用谁的方法
//    val added1=forAdd +: "fff"
    val added2= "fff"+: forAdd
    added2.foreach(x=>println(x))



    val arrtest1=Array(1,2,3)
    val arrtest2=Array(4,5,6)
    val arraddes=arrtest1 ++ arrtest2

//    println("==========================")
//    arraddes.foreach(x=>println(x))

    val arrToStr=arraddes.mkString(",")
    println("--------------------------------------")
    println(arrToStr)

  }

}
