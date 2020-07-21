package ink.bignose.chapter14

/**
  * @Author :bignose
  * @Date: 2017/8/10 19:55
  */
object Recursive05 {
  def main(args: Array[String]): Unit = {

    def fbn(n: Int): Int = {
      if (n == 1 || n == 2) {
        1
      } else {
        fbn((n - 1)) + fbn((n - 2))
      }
    }

    println("斐波那契数" + fbn(7))
    // 递归次数指数增长  应该递归为 迭代
  }
}
