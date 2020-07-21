package ink.bignose.chapter13

/**
  * @Author :bignose
  * @Date: 2017/8/10 17:07
  */
object TripleDemo {

  def main(args: Array[String]): Unit = {
    // 匿名函数说明
    // 1. 不需要def
    // 2. 不需要写返回类型 使用类型 推到
    // 3.  =号  编程 =>
    // 4. 更多语句  {}  +  换行
    val triple = (x: Double) => 3 * x
    println(triple(3))

    // 案例
    val f1 = (n1: Int, n2: Int ) => {
      println("匿名函数被调用")
      n1 + n2
    }
    println("f1类型=" + f1)
    println(f1(10, 30))


  }
}
