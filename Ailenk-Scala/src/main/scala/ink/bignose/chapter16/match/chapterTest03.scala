package ink.bignose.chapter16.`match`

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 15:41
  */
object chapterTest03 {
  def main(args: Array[String]): Unit = {


    //    3、给定类Pair[T, S] ，编写一个泛型方法swap，接受对偶作为参数并返回组件交换过位置的新对偶。
    val lists = List(Some(1), Some(3), Some(4), None)
    println(mySum(lists)) //14
    //    4、给定可变类Pair[S,T]，使用类型约束定义一个swap方法，当类型参数相同时可以被调用。

  }

  //  def mySum(lst:List[Option[Int]])=lst.map((x:Option[Int])=> x.getOrElse(0)).sum
  def mySum(lst: List[Option[Int]]) = lst.map(_.getOrElse(0)).sum


}
