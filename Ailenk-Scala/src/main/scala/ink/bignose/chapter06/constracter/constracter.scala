package ink.bignose.chapter06.constracter

object constracter01 {

  def main(args: Array[String]): Unit = {
    val p1 = new Person("jack", 20)
    println(p1.toString)

    val p2 = new Person("tom")
    println(p2.toString)


  }

}

//构造器 的快速入门
//创建对象初始化 age name
class Person(inName: String, inAge: Int) {
  var name = inName
  var age = inAge
  println("ok")
  age += 10

  override def toString: String = {
    "信息如下" + name + "," + age
  }

  println("age " + age)

  //辅助构造器 必须在第一行 显示地调用主构造器
  def this(name: String) {
    this("jack",20)
    this.name = name
  }

}

