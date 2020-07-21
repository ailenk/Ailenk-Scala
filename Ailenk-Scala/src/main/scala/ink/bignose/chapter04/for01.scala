package ink.bignose.chapter04

/**
  * bignose
  * @ 2017/8/2 20:17
  */
object for01 {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 10) {
      println("alienk")
    }

    var start = 1
    var end = 10
    for (i <- start to end) {
      println("alienk")
    }

    //全包括
    var list = List("list", 10, 20)
    for (item <- list) {
      println("item" + item)
    }
    //不包括右边
    var list2 = List("list", 10, 20)
    for (item <- start until end) {
      println("item" + item)
    }

    //循环守卫
    for (item <- start to end if item != 2) {
      println("item" + 1)
    }

    //引入变量
    for (item <- start to end; j = 4 - item) {
      println("item" + j)
    }


  }
}
