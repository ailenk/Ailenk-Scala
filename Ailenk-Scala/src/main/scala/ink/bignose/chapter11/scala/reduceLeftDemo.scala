package ink.bignose.chapter11.scala

/**
  * @Author :bignose
  * @Date: 2017/8/9 19:43
  */
object reduceLeftDemo {
  def main(args: Array[String]): Unit = {
    val list = List(1, 20, 30, 4, 5)

    def sum(n1: Int, n2: Int): Int = {
      println(n1,n2)
      n1 + n2
    }

    // 底层是递归
//    def reduceLeft[B >: A](@deprecatedName('f) op: (B, A) => B): B =
//      if (isEmpty) throw new UnsupportedOperationException("empty.reduceLeft")
//      else tail.foldLeft[B](head)(op)
    val res = list.reduceLeft(sum)
    println("res=" + res)

  }
}
