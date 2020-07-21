package ink.bignose.chapter07.extendDeo

class Persons {
  var name: String = _
  var age: Int = _

  def showInfo(): Unit = {
    println("学生信息如下：")
    println("名字：" + this.name)
  }
}

class Emp extends Persons {
  override def showInfo(): Unit = {
    super.showInfo()
    println(this.name + "学习 scala中....")
  }
}


object EmpMain {
  def main(args: Array[String]): Unit = {
    var emp = new Emp
    println(emp.showInfo)
  }
}
