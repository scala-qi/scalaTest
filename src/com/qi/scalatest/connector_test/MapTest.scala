package com.qi.scalatest.connector_test

object MapTest {

  def main(args: Array[String]): Unit = {

    //初始化
    val map = Map("a" -> 123, "b" -> 345, "c" -> 567)
    val map2=Map((1,"a"),(2,"c"),(3,"c"))
    val map3=Map((1,("a","b")),(2,("c","d","e")))
    println(map)
    //取值
    println(map("b"))

    //赋值,默认引入的map是不可变类型:元素,长度都不可变
    //    map("b")=555

    //map遍历:法一
    //    for(key<-map.keySet) println(s"key:$key,value;${map(key)}")
    //    法二
    //    for(kv <-map) println(s"key:${kv._1},value:${kv._2}")
    //    法三
    //    for ((key, value) <- map) println(s"key:$key,value:$value")
    //    法四
    //    map.foreach(x => println(s"key:${x._1},value:${x._2}"))


    //可变map

    val mmap = collection.mutable.Map[Int, String]()
    mmap(1) = "abc"
    mmap.put(2, "def")
    mmap += 3 -> "fff"
    println(mmap)

    //删除kv
    mmap.remove(2)
    println(mmap)

  }
}
