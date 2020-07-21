package ink.bignose.chapter10.set

import scala.collection.mutable


object setdemo {
  def main(args: Array[String]): Unit = {
    //  val Set         = immutable.Set
    val set = Set(1, 2, 3) //不可变
    println(set)

    val set2 = mutable.Set(1, 2, 3)
    println(set2)
    //可变集合的元素添加

    set2.add(4) //方式1
    set2 += 6  //方式2
    set2.+=(5) //方式3

    set2 -= 2 // 操作符形式
    set2.remove(8) // 方法的形式，scala的Set可以直接删除值
    println(set2)

    println(set2.max)

  }
}
