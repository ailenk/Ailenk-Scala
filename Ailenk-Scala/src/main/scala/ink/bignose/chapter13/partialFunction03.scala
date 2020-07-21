package ink.bignose.chapter13

/**
  * @Author :bignose
  * @Date: 2017/8/10 15:57
  */
object PartialFunction03 {
  def main(args: Array[String]): Unit = {
    def f2: PartialFunction[Any, Int] = {
      case i: Int => i + 1 // case语句可以自动转换为偏函数
    }
    val list2 = List(1, 2, 3, 4,"ABC").collect(f2)
    println("list2=" + list2) //?

    // 简化
    val list3 = List(1, 2, 3, 4,"ABC").collect{ case i: Int => i + 1 }
    println(list3)

  }





}
