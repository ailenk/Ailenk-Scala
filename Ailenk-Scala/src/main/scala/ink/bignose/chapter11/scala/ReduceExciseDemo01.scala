package ink.bignose.chapter11.scala

object ReduceExciseDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4 ,5)
    def minus( num1 : Int, num2 : Int ): Int = {
      num1 - num2
    }
    println(list.reduceLeft(minus)) // 输出?  -13
    println(list.reduceRight(minus)) //输出? 3
    //  def reduce[A1 >: A](op: (A1, A1) => A1): A1 = reduceLeft(op)
    println(list.reduce(minus))

  }
}
