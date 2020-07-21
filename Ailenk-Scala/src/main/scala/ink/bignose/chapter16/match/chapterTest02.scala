package ink.bignose.chapter16.`match`

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 15:41
  */
object chapterTest02 {
  def main(args: Array[String]): Unit = {

    //    2、定义一个可变类Pair[T]，带一个swap方法，交换对偶中组件的位置。
    println(swap2(Array(1, 2, "hello1", "hello2", "hello3")).toBuffer)

  }

  def swap2(arr: Array[Any]) = {
    arr match {
      case Array(first, second, rest@_*) => Array(second, first) ++ rest
      case _ => arr
    }

  }

}
