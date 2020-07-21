package ink.bignose.chapter16.highfun

import scala.math._

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 16:07
  */
object hightfun01 {
  def main(args: Array[String]): Unit = {
    //    1、编写一个compose函数，将两个类型为Double=>Option[Double]的函数组合在一起，产生另一个同样类型的函数。如果其中一个函数返回None，则组合函数也应返回None。例如：
    //    def f(x : Double) = if ( x >= 0) Some(sqrt(x)) else None //给的第一个函数
    //    def g(x : Double) = if ( x != 1) Some( 1 / ( x - 1)) else None// 给的第二个函数
    //    val h = compose(f,g)
    //    h(2)将得到Some(1)，而h(1)和h(0)将得到None

    val h = compose(f, g)
    println(h(2))//1
    println(h(1))//None
    println(h(0))//None
  }

  // 给我们的两个函数
  def f(x: Double) = if (x > 0) Some(sqrt(x)) else None //给的第一个函数
  def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None

  // 给的第二个函数
  // 根据需求合并一个函数
  // 形式是  val h = compose(f,g)
  def compose(f: Double => Option[Double], g: Double => Option[Double]) = {
    //返回一个匿名函数
    (x: Double) => {
      //合并
      if (f(x) == None || g(x) == None) None
      else g(x)
    }
  }
}
