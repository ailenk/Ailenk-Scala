package ink.bignose.chapter10.queue

import scala.collection.mutable


object queueDemo01 {
  def main(args: Array[String]): Unit = {
    //说明: 这里的Int是泛型，表示q1队列只能存放Int类型
    //如果希望q1可以存放其它类型，则使用 Any 即可。
//    val q1 = new mutable.Queue[Int]
//
//    println(q1)


    val q1 = new mutable.Queue[Int]
    println(q1.hashCode())
    q1 += 20 // 底层?
    println(q1)
    println(q1.hashCode())
    q1 ++= List(2,4,6) //
    println(q1)
    println(q1.hashCode())

    //q1 += List(1,2,3) //泛型为Any才ok
    println(q1)


  }
}
