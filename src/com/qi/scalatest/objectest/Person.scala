package com.qi.scalatest.objectest

//主构造方法
//主构造方法参数定义时加val或var参数将变为属性
class Person(val pname:String,val page: Int,pbrithday: String) {

   var name=pname
  //加  private [this]限制更严格,内部类也不能访问private类型,只能本类访问
  //private [objectest]还可以添加包对象,可以让修饰符有更宽松的权限,该包
  //内的所有类都可以访问
//   private [this] var age=page
  var age=page
  var birthday=pbrithday
  //辅构造方法
  def this()={
    this("",33,"")
  }

  def this(name:String){
    this(name,33,"")
  }

  def eat(): Unit ={
    println("i can eat")
  }

  def walk(): Unit ={
    println("i can walk")
  }

  print("我被执行了")


  override def toString = s"Person($name, $age, $birthday)"

  class Clothese{
    def getAge():Int={
      val p=new Person("",32,"")

      age
    }
  }
}

object  PersonTest{

  def main(args: Array[String]): Unit = {
    val p1=new Person("李四",23,"2012-2-1")
    val p2=new Person("李四",23,"2012-2-1")
    p1.eat()

    p1.name="张三"
    p1.age=21
    p1.birthday="2013-2-1"

    print(p1)
  }
}
