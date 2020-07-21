package ink.bignose.chapter12

/**
  * @Author :bignose
  * @Date: 2017/8/10 14:22
  */
object AbstractClassDemo {
  def main(args: Array[String]): Unit = {
    for (amt <- Array(Dollar(1000.0), Currency(1000.0, "RMB"), NoAmount)) {
      val result = amt match {
        //说明
        case Dollar(v) => "$" + v
        //说明
        case Currency(v, u) => v + " " + u
        case NoAmount => ""
      }
      println(amt + ": " + result)
    }

  }
}
abstract class Amount

case class Dollar(value: Double) extends Amount

case class Currency(value: Double, unit: String) extends Amount

case object NoAmount extends Amount