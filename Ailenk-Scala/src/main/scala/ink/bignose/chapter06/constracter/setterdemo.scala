package ink.bignose.chapter06.constracter

import scala.beans.BeanProperty


object setterdemo {
  def main(args: Array[String]): Unit = {
    var c = new Car
    c.setName("宝马")
    println(c.getName)


  }
}

//这时inName 是一个局部变量
//val 修饰编程一个只读私有属性
class Car {
  @BeanProperty var name: String = null
}
