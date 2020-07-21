package ink.bignose.chapter03

import scala.io.StdIn


object input {


  def main(args: Array[String]): Unit = {
    //trait 特质 兼顾JAVA 接口与抽象类
    println("请输入姓名")
    var name=StdIn.readLine()
    println("年龄")
    var age=StdIn.readInt()
    println("薪水")
    var sale=StdIn.readDouble()
    printf("用户name=%s age=%d sale=%.2f",name,age,sale)




//    Cat.sayHi
//    Cat.sayHell()
  }


}

object Cat extends AAA{
  def sayHi: Unit = {
    println("小狗汪汪叫")
  }
}


trait AAA {
  def sayHell(): Unit = {
    println("sayHello")
  }
}