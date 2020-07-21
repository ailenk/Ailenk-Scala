package ink.bignose.chapter12

import scala.collection.mutable.ArrayBuffer


/**
  * @Author :bignose
  * @Date: 2017/8/10 10:31
  */
object MatchDeme04 {
  def main(args: Array[String]): Unit = {
    for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {
      val result = list match {
        case 0 :: Nil => "0" //
        case x :: y :: Nil => x + " " + y //
        case 0 :: tail => "0 ..." //
        case _ => "something else"
      }
      println(result)
    }

    for (pair <- Array((0, 1), (1, 0), (1, 1),(1,0,2))) {
      val result = pair match { //
        case (0, _) => "0 ..." //
        case (y, 0) => y //
        case _ => "other" //.
      }
      println(result)
    }

  }


}
