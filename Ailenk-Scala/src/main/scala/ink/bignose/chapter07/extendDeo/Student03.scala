package ink.bignose.chapter07.extendDeo

class Personss {
  var name: String = _
  var age: Int = _

  def showInfo(): Unit = {
    println("学生信息如下：")
    println("名字：" + this.name)
  }
}

class Emp01 extends Personss {
  override def showInfo(): Unit = {
    super.showInfo()
    println(this.name + "学习 scala中....")
  }
}

class Emp02 extends Personss {
  override def showInfo(): Unit = {
    super.showInfo()
    println(this.name + "学习 scala中....")
  }
}
object EmpssMain {
  def main(args: Array[String]): Unit = {
    var p = new Personss
    var emp01 = new Emp01
    var emp02 = new Emp02
    //子类转父类
    p=emp01
    //父类转子类 向下转型
    emp01=p.asInstanceOf[Emp01]




  }
}
