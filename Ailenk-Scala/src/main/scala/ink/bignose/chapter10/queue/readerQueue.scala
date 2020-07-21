package ink.bignose.chapter10.queue

import scala.collection.mutable

/**
  * @Author :bignose
  * @Date: 2017/8/7 19:42
  */
object readerQueue {
  def main(args: Array[String]): Unit = {
    val q1 = new mutable.Queue[Int]
    println(q1.hashCode())
    q1 += 9 // 底层?
    println(q1)
    println(q1.hashCode())
    q1 ++= List(4, 5, 7) //
    println(q1)
    println(q1.hashCode())

    //q1 += List(1,2,3) //泛型为Any才ok
    println(q1)

    //队列删除
    val queueElement = q1.dequeue()
    println(queueElement)
    println(q1.hashCode())

    q1.enqueue(100,10,100)
    println(q1)

    //获取队列的第一个 元素
    println(q1.head)
    //获取队列的 最后一个元素
    println(q1.last)

    println(q1.tail.tail.tail)
  }
}
