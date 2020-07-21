package ink.bignose.chapter11.scala

/**
  * @Author :bignose
  * @Date: 2017/8/9 20:06
  */
object fold {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    // 折叠
    // 1. 与化简几乎一样
    // 2.  ist.foldLeft(5)(minus)  理解  List(5,1, 2, 3, 4)
    // 3.  ist.foldRight(5)(minus)  理解  List(1, 2, 3, 4,5)
    def minus(num1: Int, num2: Int): Int = {
      num1 - num2
    }

    println(list.foldLeft(5)(minus)) // 函数的柯里化
    println(list.foldRight(5)(minus)) //
  }

}
