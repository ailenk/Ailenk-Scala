package ink.bignose.chapter12

import scala.collection.mutable.ArrayBuffer


/**
  * @Author :bignose
  * @Date: 2017/8/10 10:31
  */
object MatchDeme03 {
  def main(args: Array[String]): Unit = {
    // 匹配数组
    for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0),
      Array(1, 1, 0), Array(1, 1, 0, 1))) {
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => x + "=" + y
        case Array(0, _*) => "以0开头和数组"
        case _ => "什么集合都不是"
      }
      println("result = " + result)


      // 匹配数组
      for (arr2 <- Array(Array(0), Array(1, 0), Array(0, 1, 0),
        Array(1, 1, 0), Array(1, 1, 0, 1))) {
        val result = arr2 match {
          case Array(0) => "0"
          case Array(x, y) => ArrayBuffer(y, x)
          case Array(0, _*) => "以0开头和数组"
          case _ => "什么集合都不是"
        }
        println("result = " + result)
      }
    }
  }





}
