package com.qi.scalatest.objectest

abstract class Dao {

  def addData(data:String)

  def deleteData(id:String)
}

class  MysqlDao extends Dao {

  override def addData(data: String): Unit = println("保存数据到mysql")

  override def deleteData(id: String): Unit = println("删除mysql中的数据")

}

class OracleDao extends Dao{
  override def addData(data: String): Unit = println("保存数据到oracle")

  override def deleteData(id: String): Unit = println("删除oracle中的数据")

}

object ServiceCode{
  val dao :Dao=new OracleDao
  def main(args: Array[String]): Unit = {

    dao.addData("ccc")
    dao.deleteData("idid")
  }
}
