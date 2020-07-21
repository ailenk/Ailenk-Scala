package ink.bignose.chapter06.demo

object excescise {

  def main(args: Array[String]): Unit = {
    var list = List(1, 2, 3)
    println(list.reverse)

    for (i <- 1 to 10 reverse) {
      println(i)
    }
    cofe(10)

  }

  def cofe(n: Int): Unit = {
    // @inline final override def foreach[@specialized(Unit) U](f: Int => U) {
    //接收 输入参数为Int 输出参数为U的函数
    //返回 print(x)0
    (0 to n).reverse.foreach(myShow)
  }

  def myShow(n: Int): Unit = {
    println("xxxxxxxxxxxx")
  }
}
