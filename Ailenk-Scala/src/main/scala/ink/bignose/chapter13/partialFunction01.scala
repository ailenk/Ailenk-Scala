package ink.bignose.chapter13

/**
  * @Author :bignose
  * @Date: 2017/8/10 15:57
  */
object PartialFunction01 {
  //  给你一个集合val list = List(1, 2, 3, 4, "abc") ，请完成如下要求:
  //    将集合list中的所有数字+1，并返回一个新的集合
  //  要求忽略掉 非数字 的元素，即返回的 新的集合 形式为 (2, 3, 4, 5)
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, "abc")

    //思路1,使用map+fliter的思路
    def f1(n: Any): Boolean = {
      n.isInstanceOf[Int]
    }


    def f2(n: Int): Int = {
      n + 1
    }

    def f3(n: Any): Int = {
      n.asInstanceOf[Int]
    }

    val list2 = list.filter(f1).map(f3).map(f2)
    println("list2=" + list2)

    //代码太过复杂

  }
}
