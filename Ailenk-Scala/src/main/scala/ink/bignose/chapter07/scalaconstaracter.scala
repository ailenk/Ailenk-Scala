package ink.bignose.chapter07

object scalaconstaracter {

}

class Person {
  var name = "zhangsan"
  println("Person...")
}

class Emp extends Person {
  println("Emp ....")

  def this(name: String) {
    this // 必须调用主构造器
    this.name = name
    println("Emp 辅助构造器~")
  }
}
