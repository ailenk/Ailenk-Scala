package ink.bignose.chapter11.scala

/**
  * @Author :bignose
  * @Date: 2017/8/9 21:01
  */
object zipDemo01 {
  def main(args: Array[String]): Unit = {
    // 拉链
    //    1拉链的本质就是两个集合的合并操作，合并后每个元素是一个 对偶元组。
    //    2操作的规则下图:
    //     3 如果两个集合个数不对应，会造成数据丢失。
    //    4集合不限于List, 也可以是其它集合比如 Array
    //     5 如果要取出合并后的各个对偶元组的数据，可以遍历

    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6)
    val list3 = list1.zip(list2) // (1,4),(2,5),(3,6)

    println(list3)
    for(item<-list3){
      println(item._1 + " " + item._2) //取出时，按照元组的方式取出即可
    }

  }

}
