package ink.bignose.chapter10.List

object listDemo {

  def main(args: Array[String]): Unit = {
    //1. val List = scala.collection.immutable.List
    //2. 不可变  可变为 listbuff
    //3. 包对象 里的 都不需要引入
    //4 . 内部做了一个定义
    val list01 = List(1, 2, 3) //创建时，直接分配元素
    println(list01)

    //  val Nil = scala.collection.immutable.Nil 空集合
    val list02 = Nil //空集合
    println(list02)

  }

}
