package ink.bignose.chapter13

/**
  * @Author :bignose
  * @Date: 2017/8/10 18:21
  */
object ClosureDemo {
  def main(args: Array[String]): Unit = {
    //闭包  整体形成闭包
    def minusxy(x: Int) = (y: Int) => x - y
    //f函数就是闭包.
    val f = minusxy(20)
    println("f(1)=" + f(1)) // 19
    println("f(2)=" + f(2)) // 18

  }
}
