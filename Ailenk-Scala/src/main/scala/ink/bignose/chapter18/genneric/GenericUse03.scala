package ink.bignose.chapter18.genneric

import SeasonEm.SeasonEm

/**
  * @Author :Ailenk
  * @Date: 2017/7/15 20:17
  */
object GenericUse3 {
  def main(args: Array[String]): Unit = {
    // 定义一个函数，可以获取各种类型的 List 的中间index的值
    val list1 = List("jack","jack","tom")
    val list2 = List(1.1,30,30,41)

    println(midList(list1))

  }
  def midList[E] (l: List[E] ): E = {
    l(l.length/2)

  }
}



/*
定义一个函数，可以获取各种类型的 List 的中间index的值
使用泛型完成

 */