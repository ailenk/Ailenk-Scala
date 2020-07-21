package ink.bignose.chapter13

/**
  * @Author :bignose
  * @Date: 2017/8/10 17:14
  */
object HightorderFunctionDemo03 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)
    println(list.map((x: Int) => x + 1)) //(2,3,4,5)
    println(list.map((x) => x + 1))
    println(list.map(x => x + 1))
    println(list.map(_ + 1))
    val res = list.reduce(_ + _)
    println(res)


  }
}
