package ink.bignose.chapter11.scala

import scala.collection.{AbstractIterator, Iterator}

/**
  * @Author :bignose
  * @Date: 2017/8/9 21:11
  */
object IteratorDemo01 {
  def main(args: Array[String]): Unit = {
    val iterator = List(1, 2, 3, 4, 5).iterator // 得到迭代器
    println("--------遍历方式1 -----------------")
    while (iterator.hasNext) {
      println(iterator.next())
    }
    println("--------遍历方式2 for -----------------")
    for(enum <- iterator) {
      println(enum) //
    }
    // 迭代器 源码
//    def iterator: Iterator[A] = new AbstractIterator[A] {
//      var these = self
//      def hasNext: Boolean = !these.isEmpty
//      def next(): A =
//        if (hasNext) {
//          val result = these.head; these = these.tail; result
//        } else Iterator.empty.next()
  }
}
