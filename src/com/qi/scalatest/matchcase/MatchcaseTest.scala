package com.qi.scalatest.matchcase

/**
  * Created by ThinkPad on 2018/3/29.
  */
object MatchcaseTest {
  //变量匹配
  def matchTest1(m:Int) = {
    val x = 1
    val y = 2
    m match{
      case `x` => println(s"匹配上了x")
      case `y` => println(s"匹配上了y")
      case v1 if v1>10 => println(s"匹配上了一个大于10的值")
      case _ => println(s"前面都没有匹配上")
    }
  }
  //构造器匹配模式
  def matchPerson(p:MatchPerson) = {
    p match {
      case MatchPerson("张三",age,birthday) => println(s"张三的年龄是:$age,生日是：$birthday")
      case MatchPerson(_,20,_) => println(s"p的年龄是二十岁，基本信息：${p.name},${p.age},${p.birthday}")
      case MatchPerson(name,age,birthday) => println(s"name：$name,age:$age,birthday:$birthday")
    }
  }
  //匹配一个有5个元素的Array，并且这个array的第1个元素等于2，第二个元素等于5，并且抽取出第四个元素打印出来
  def matchArray(a:Array[Int]) = {
    a match{
      case Array(2,5,_,fourth,_) => println(s"第四个元素的值是$fourth")
      case _ => println("匹配不成功")
    }
  }
  //元组匹配
  def matchTuple(a:(Int,String,Int)) = {
    a match{
      case (1,"33",third) => println(s"匹配成功，并且第三个元素值为$third")
      case _ => println("元组匹配不上")
    }

    val map = Map(1->"123",2->"345",3->"567")
    for((a,b) <- map) println(s"key:$a,value:$b")
  }
  //类型匹配，输入一个参数，如果参数是Int类型，则把值打印出来，如果是其他类型直接打印不匹配
  def matchType(x:Any) = {
    x match{
      case _:Int => println(s"x的值是$x")
      case _ => println(s"s的值不是Int")
    }

    x match{
      case _:Int => println("x是Int")
      case _:String => println("x是String")
      case _:Double => println("x是Double")
      case _:Array[Int] => println("x是Array[Int]")
      case _:MatchPerson => println("x是MatchPerson")
    }
  }
  //变量绑定匹配模式，获取到list的tail数据，list的长度为5
  def matchVar(x:List[String]) = {
    x match{
      case List(_,one,two,three@_,four@_) => println(s"长度是5，尾部是：${List(one,two,three,four)}")
      case _ => println("匹配不成功")
    }
  }
  //正则匹配
  //张三 23 20150101
  //从上述字符串中匹配并抽取出姓名，年龄，生日
  def regexMatch(x:String) = {
    val regex = "(.*) (\\d+) (\\d+)".r
    x match {
      case regex(name,age,birthday) => println(s"name：$name,age:$age,birthday:$birthday")
      case _ => println("匹配不成功")
    }
  }

  def main(args: Array[String]): Unit = {
//    matchTest1(3)
//    matchPerson(MatchPerson("李四",20,"2018-09-01"))
//    matchArray(Array(2,5,3,4,5))
//    matchTuple((1,"33",55))
//    matchType(213)
//    matchType("abc")
//    matchVar(List("a","b","c","d","e"))
    regexMatch("张三 4420180301")
  }
}
