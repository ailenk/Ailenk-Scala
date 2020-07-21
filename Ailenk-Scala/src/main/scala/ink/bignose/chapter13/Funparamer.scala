package ink.bignose.chapter13

/**
  * @Author :bignose
  * @Date: 2017/8/10 17:00
  */
object Funparamer {
  def main(args: Array[String]): Unit = {
    //说明
    def plus(x: Int) = 3 + x
    //说明
    val result1 = Array(1, 2, 3, 4).map(plus(_))
    println(result1.mkString(","))

  }
}
