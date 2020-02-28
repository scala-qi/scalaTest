package com.qi.scalatest.connector_test

object SetTest {

  def main(args: Array[String]): Unit = {
    //set初始化
    val set1=Set(1,2,3,4,5,7,9,2)
    println(set1)

    //取值,不能用小括号取值
    println(set1(9))
    //遍历
    for(i<-set1){
      println(i)
    }

    set1.foreach(x=>println(x))

    val set2=Set(3,4,6,7)
    val set3=set1++set2+5
    println(set3)

    //转换为其他集合类型

    val a=set3.toArray
    println(a)
    println(set3.toList)

//可变set
    val mset=collection.mutable.Set(1,2,3,4,5)
    println(mset)

    mset.add(8)
    mset.remove(2)
    println(mset)


  }
}
