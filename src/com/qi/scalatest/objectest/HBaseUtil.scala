package com.qi.scalatest.objectest

object HBaseUtil {

  var configuration="hbase config"
  var connection=""

  def putRecord()={
    println("新增数据到hbase中")
  }

  def getRecord()={
    println("获取hbase中的数据")
  }
}

object HBaseUtilTest{
  def main(args: Array[String]): Unit = {
    HBaseUtil.getRecord()
    println(HBaseUtil.configuration)
  }
}
