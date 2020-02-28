package com.qi.scalatest.connector_test

import scala.io.Source

object WordCount {

  def main(args: Array[String]): Unit = {

//     读取文件中的数据，把它们每行的数据的内容都读出来，然后把每行的数据都读出来，然后放入到list中
    val list=Source.fromFile("E:\\number.log").getLines().toList

    // flatMap函数的功能是把每个list中的数据取出来进行操作,然后返回的所有的值都在一个list
    val words=list.flatMap(line=>line.split("\\s+"))

    //map函数是对进入的每个元素的值进行操作，在本例中是在words中的所有的单词都进入到map函数中进行
    //一次的操作，形成一个元组,例如：(hive,1)
    val tuple=words.map(word=>(word,1))//tuple为list集合,里面保存的是元组
//对单词的tuple进行分组，把每个相同的单词放入一个组中,返回的是一个map的集合，其中key是单词，
    //value是一个List的集合，其中的元素是一组中的所有的单词个数

    val group=tuple.groupBy(x=>x._1)//group为map对象,key为聚合的单词,value为list集合,集合元素是单词相同的元组
    /**
      * 对分过组的单词进行结合和单词的总数的计算。
      * 1.首先mapvalues函数是遍历map中的values，对每个values进行操作。
      * 2.进行的map函数，取出上一个结果中List中的元组的第二个值，例如：List((hive,1),(hive,1))中的 1
      * 3.然后对获取到的值进行reduce合并，得出最后的结果。
      * 结果：Map(hive -> 2, hello -> 2, mand -> 3, good -> 4)
      */
    val value=group.mapValues(list=>list.map(tuple=>tuple._2).reduce(_+_))

    println(value)

println("-------------------------------------------------------------------")

    //简写wordcount

    val b = Source.fromFile("""E:\number.log""").getLines().toList.flatMap ( _.split("\\s+") )
      .map((_,1) ).groupBy(_._1).mapValues(_.map((_._2)).reduce(_ + _))

    println(b)

  }

}
