package ink.bignose.chapter14

/**
  * @Author :bignose
  * @Date: 2017/8/10 19:40
  */
object RecursiveDemo01 {
  def main(args: Array[String]): Unit = {
    //求最大值的 案例
    def max(xs: List[Int]): Int = {
      if (xs.isEmpty)
        throw new java.util.NoSuchElementException
      if (xs.size == 1)
        xs.head
        // 高速计算机做什么
      else if (xs.head > max(xs.tail)) xs.head else max(xs.tail)
    }

    println(List(1,2,3,4,-100).max)
  }
}
