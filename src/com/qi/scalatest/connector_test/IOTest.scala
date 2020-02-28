package com.qi.scalatest.connector_test

import java.io.{File, PrintWriter}

import scala.io.{Source, StdIn}

object IOTest {

  def main(args: Array[String]): Unit = {

    //从控制台获取输入
//    val input =StdIn.readLine("请输入: ")
//    println(s"获取到控制台的输入:$input")

    //读取一个文件

//    val file=Source.fromFile("E:\\upload\\temp.txt")
//    file.getLines().foreach(line=>println(line))
    //抓取一个网页
//
    val giteeExplore=Source.fromURL("http://gitee.com/explore")
//    giteeExplore.getLines().foreach(line=>println(line))

    //抓取一个网页并保存
    val writer=new PrintWriter(new File("d://gitee-explore.html"))
    giteeExplore.getLines().foreach(line=>writer.print(line))
    writer.flush()
    writer.close()




  }

}
