package ink.bignose.chapter04

import util.control.Breaks._

/**
  * @:bignose
  * @ 2017/8/2 20:41
  */
object excexice07 {

  def main(args: Array[String]): Unit = {

    var sum = 0
    //braakabke
    breakable {
      for (item <- 1 to 10) {
        println("aaaaa")
        if (item == 2) {
          break()
        }
      }

    }

    var sum2 = 0
    var loop = true
    for (i <- 0 to 100 if loop == true) {
      if (i > 20) {
        println("这个数是" + i)
        loop = false
      }
      println(i)
    }
  }

}
