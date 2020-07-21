package ink.bignose.chapter11.scala

/**
  * @Author :bignose
  * @Date: 2017/8/10 9:49
  */
object OperatorDemo {
  def main(args: Array[String]): Unit = {
    Int
    val n1 = 1
    val n2 = 2
    val r1 = n1 + n2
    val r2 = n1.+(n2) //看Int的源码即可说明t
    println("r1=" + r1 + " r2=" + r2)

  }
}
