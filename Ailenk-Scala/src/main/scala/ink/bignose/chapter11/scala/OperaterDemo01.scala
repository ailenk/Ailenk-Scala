package ink.bignose.chapter11.scala

object OperaterDemo01 {
  def main(args: Array[String]): Unit = {
    val list1 = List(3, 5, 7)
    var list2 = List[Int]()
    for (item <- list1) { //遍历
      list2 = list2 :+ item * 2
    }
    println(list2)


    // 优点 好理解
    // 缺点
    // 1.不够简洁，高效
    // 2.不体现函数式编程
    // 3.不利于处理复杂的处理的业务

  }

}
