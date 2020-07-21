package ink.bignose.chapter13

/**
  * @Author :bignose
  * @Date: 2017/8/10 17:14
  */
object HightorderFunctionDemo01 {
  def main(args: Array[String]): Unit = {
    def test(f: Double => Double,f2: Double => Double, n1: Double) = {
      f(f2(n1))
    }
    //sum 是接收一个Double,返回一个Double
    def sum(d: Double): Double = {
      d + d
    }
    val res = test(sum,sum, 6.0)
    println("res=" + res)
  }
}
