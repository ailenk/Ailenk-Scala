package ink.bignose.chapter07.extendDeo

class Person {
  var name: String = _
  var age: Int = _

  def showInfo(): Unit = {
    println("学生信息如下：")
    println("名字：" + this.name)
  }
}

class Student extends Person {
  def studying(): Unit = {
    println(this.name + "学习 scala中....")
  }
}


object TTT {
  def main(args: Array[String]): Unit = {
    var stu = new Student
    println(stu.studying)
  }
}
