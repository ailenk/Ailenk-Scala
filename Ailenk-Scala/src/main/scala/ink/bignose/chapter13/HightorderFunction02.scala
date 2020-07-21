package ink.bignose.chapter13

/**
  * @Author :bignose
  * @Date: 2017/8/10 17:14
  */
object HightorderFunctionDemo02 {
  def main(args: Array[String]): Unit = {
    def minusxy(x: Int) = {
      (y: Int) => x - y //匿名函数
    }

//    val f1 = minusxy(3) //f1 就是 (y: Int) => x - y
    val result3 = minusxy(3)(5)
    println(result3)

  }
}
