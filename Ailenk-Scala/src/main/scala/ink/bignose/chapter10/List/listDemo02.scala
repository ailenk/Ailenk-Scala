package ink.bignose.chapter10.List

/**
  * Author :bignose
  * Date: 2017/8/7 16:59
  */
object listDemo02 {
  def main(args: Array[String]): Unit = {

    //    val list1 = List(1, 2, 3) //创建时，直接分配元素
    //    val value1 = list1(1) // 1是索引，表示取出第2个元素.
    //    println(value1)


    // 追加数据 被审计和没有变化
    //    var list1 = List(1, 2, 3, "abc")
    //    // :+运算符表示在列表的最后增加数据
    //    val list2 = list1 :+ 4
    //    println(list1) //list1没有变化
    //    println(list2) //新的列表结果是 [1, 2, 3, "abc", 4]

//    var list1 = List(1, 2, 3, "abc")
//    // :+运算符表示在列表的最后增加数据
//    val list2 = 4 +: list1
//    println(list1) //list1没有变化
//    println(list2) //新的列表结果是?
//
//    println(list1.hashCode()) //list1没有变化
//    println(list2.hashCode()) //新的列表结果是?

    //
    val list1 = List(1, 2, 3, "abc")
    val list5 = 4 :: 5 :: 6 :: list1 :::list1 :: Nil
    println(list5)
    //list()
    //list(List(1, 2, 3, "abc"))
    //list(6,List(1, 2, 3, "abc"))
    //下面等价 4 :: 5 :: 6 :: list1val list7 = 4 :: 5 :: 6 :: list1 ::: Nilprintln(list7)
    //运算从右至左
    //集合 一定放到 最右边
    //：：： 将之后每一个 从右至左 加入到集合
    //List(4, 5, 6, 1, 2, 3, abc, List(1, 2, 3, abc))
  }
}
