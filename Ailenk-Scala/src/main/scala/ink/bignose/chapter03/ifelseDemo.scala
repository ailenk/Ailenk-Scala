package ink.bignose.chapter03

object ifelseDemo {
  def main(args: Array[String]): Unit = {
    //位 运算

    val tt = if (5 > 4) 5 else 4
    println(tt)

    /*
      两个数最大值
      三个数最大值
     */
    val n1 = 4
    val n2 = 8
    var res = if (n1 > n1) 4 else 8
    println("res" + res)
    val n3 = 11
    res = if (res > n3) res else n3
    println("res" + res)
  }
}
