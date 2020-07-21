package ink.bignose.chapter13

/**
  * @Author :bignose
  * @Date: 2017/8/10 15:57
  */
object PartialFunction02 {
  def main(args: Array[String]): Unit = {
    // 偏函数解决
    val list = List(1, 2, 3, 4, "abc")
    //说明  1.PartialFunction[Any, Int]  标书 传入any 类型 返回 Int类型
    // 2.apply构造器 对传入数+1 返回新的集合
    //trait PartialFunction[-A, +B] extends (A => B) { self =>
    val addOne3 = new PartialFunction[Any, Int] {
      def isDefinedAt(any: Any) = if (any.isInstanceOf[Int]) true else false

      def apply(any: Any) = any.asInstanceOf[Int] + 1
    }
    // 如果使用偏函数 则不能使用 map 而使用 collect ---隐式转换
    val list3 = list.collect(addOne3)
    println("list3=" + list3) //?
  }


}
