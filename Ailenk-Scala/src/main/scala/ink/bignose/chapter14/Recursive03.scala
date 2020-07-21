package ink.bignose.chapter14

/**
  * @Author :bignose
  * @Date: 2017/8/10 19:50
  */
object Recursive03 {
  def main(args: Array[String]): Unit = {

    def factorial(n: Int): Int =
      if (n == 0) 1 else n * factorial(n - 1)

  }
}
