package ink.bignose.chapter09.impicit

object ImplociteDemo {
  def main(args: Array[String]): Unit = {
    implicit def f1(d: Double): Int = {
      d.toInt
    }

    val num: Int = 3.5
    val num2: Int = 3.5
    println(num+num2)
  }
}


