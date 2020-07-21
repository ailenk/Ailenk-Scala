package ink.bignose.chapter06.method

object methodDemo2 {
  def main(args: Array[String]): Unit = {
    var dog = new Dog3
    println(dog.sum(1,2))
  }
}

class Dog3 {
  var sal: Double = _
  var food: String = _

  def sum(n1: Int, n2: Int): Int = {
     n1 + n2
  }
}

