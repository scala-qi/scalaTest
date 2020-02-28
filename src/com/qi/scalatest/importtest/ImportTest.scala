package com.qi.scalatest.importtest

/**
  * Created by ThinkPad on 2018/3/30.
  */
object ImportTest {
  def main(args: Array[String]): Unit = {
    val hmap = new scala.collection.mutable.HashMap[String,String]();
    println(hmap.getClass.toString)
    import java.util.HashMap
    import scala.collection.mutable.{HashMap => _}
    val omap = new HashMap[String,String]()
    println(omap.getClass.toString)

    import java.util.{HashMap => JMap}
    val jmap = new JMap[String,String]();
    jmap.put("aaa","ccc")
    println(jmap.getClass.toString)
    println(jmap.get("aaa"))

  }
}
