package ink.bignose.chapter10.List

import scala.collection.mutable.ListBuffer


object listBufferDemo01 {
  def main(args: Array[String]): Unit = {
    val lst0 = ListBuffer[Int](1, 2, 3)

    println("lst0(2)=" + lst0(2))
    for (item <- lst0) {
      println("item=" + item)
    }

    //动态的增加元素 lst1 就会变化  增加一个一个元素
    val lst1 = new ListBuffer[Int]
    lst1 += 4
    lst1.append(5)

    // 增加一个集合
    lst0 ++= lst1
    val lst2 = lst0 ++ lst1
    val lst3 = lst0 :+ 5
    println("st3="+lst3)

    println(lst0.hashCode())

    println("=====删除=======")
    println("lst1=" + lst1)
    lst1.remove(1)
    for (item <- lst1) {
      println("item=" + item)
    }

  }
}
