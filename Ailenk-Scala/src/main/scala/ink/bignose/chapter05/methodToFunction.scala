package ink.bignose.chapter05

object methodToFunction {
  def main(args: Array[String]): Unit = {
    val dog = new Dog
    println(dog.sum(1, 2))
    //方法转函数
    val f1 = dog.sum _
    println("f1=" + f1)
    println("f1=" + f1(1, 2))

    val f2 = (n1: Int, n2: Int) => {
       n1 + n2
    }
    println("f2=" + f2(2, 2))
  }

  class Dog {
    //方法
    def sum(n1: Int, n2: Int): Int = {
      return n1 + n2
    }
  }

}
