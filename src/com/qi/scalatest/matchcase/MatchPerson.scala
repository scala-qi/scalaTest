package com.qi.scalatest.matchcase

/**
  * Created by ThinkPad on 2018/3/29.
  */
class MatchPerson {
  var name = ""
  var age = 0
  var birthday = ""
}
object MatchPerson{
  //实现apply方法
  def apply(name:String,age:Int,birthday:String) = {
    val result = new MatchPerson()
    result.name = name
    result.age = age
    result.birthday = birthday
    result
  }
  //实现unapply方法
  def unapply(arg: MatchPerson): Option[(String,Int,String)] = {
    if(arg == null){
      None
    }else{
      Some(arg.name,arg.age,arg.birthday)
    }
  }
}
