package ink.bignose.chapter07.javaField

object scalaoverride {
  def main(args: Array[String]): Unit = {
    var obj1: AAA = new BBB
    var obj2: BBB = new BBB

    println("bij1" + obj1.age)
    println("bij2" + obj2.age)

    println("")
  }
}


class AAA {
  val age: Int = 10
}

class BBB extends AAA {
  override val age: Int = 20
}