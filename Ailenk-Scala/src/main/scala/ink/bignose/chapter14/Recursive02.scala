package ink.bignose.chapter14

/**
  * @Author :bignose
  * @Date: 2017/8/10 19:40
  */
object Recursive04 {
  def main(args: Array[String]): Unit = {
    //Str = "ab"
    def reverse(xs: String): String =
      if (xs.length == 1) xs else reverse(xs.tail) + xs.head


    println(List(1,2,3,4,-100).max)
  }
}
