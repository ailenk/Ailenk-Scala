package ink.bignose.chapter11.scala

object OperaterDemo02 {
  def main(args: Array[String]): Unit = {
    val list = List(3, 5, 7)

    // 1.将集合里的元素遍历
    // 2. 将各个元素传递给 mutiple 函数
    // 3. 将得到新Int 并返回
    // 4. mutiple 会被调用3 次
    //3
    //    5
    //    7
    //    List(6, 10, 14)
    val list2 = list.map(mutiple)
    println(list2)


  }


  def mutiple(n: Int): Int = {
    println(n)
    2 * n
  }


}

// 其实就是这玩意
class MyList {
  var list1 = List(3, 5, 7)
  var list2 = List[Int]()
  def map(f:Int=>Int): List[Int] = {
    for (item<-list1) {
      list2 = list2 :+ f(item)
    }
    list2
  }
}
object MyList {
  def apply(): MyList = new MyList()
}

