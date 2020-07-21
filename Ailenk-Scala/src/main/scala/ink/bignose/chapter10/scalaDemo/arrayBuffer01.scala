package ink.bignose.chapter10.scalaDemo

import scala.collection.mutable.ArrayBuffer

/**
  * 变长长数组的第一种方式
  *
  * 创建  检索 修改 删除
  */
object arrayBuffer01 {
  def main(args: Array[String]): Unit = {

    //创建一个ArrayBuffer 可变数组
    val arr01 = ArrayBuffer[Any](3, 2, 5)
    //通过下标访问元素
    println("arr01(1)=" + arr01(1))//2
    //遍历
    for (i <- arr01) {
      println(i)
    }
    println(arr01.length) //3
    println("arr01.hash=" + arr01.hashCode())

    //使用append 追加元素
    //  def append(elems: A*) { appendAll(elems) }
    // append 对数组的扩容 创建爱你一个新数组  数组变新数组 hashcode 改变
    arr01.append(90.0,13)
    println("arr01.hash=" + arr01.hashCode())

    arr01(1) = 89 //修改
    println("--------------------------")
    for (i <- arr01) {
      println(i)
    }

    //删除 根据下标来删除
    // 同样是copy
    arr01.remove(0)
    println("--------------------------")
    for (i <- arr01) {
      println(i)
    }
    println("最新的长度=" + arr01.length)

  }
}
