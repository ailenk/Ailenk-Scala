package ink.bignose.chapter12

/**
  * @Author :bignose
  * @Date: 2017/8/10 13:53
  */
object Matchvar05 {
  def main(args: Array[String]): Unit = {
    val (x, y) = (1, 2)
    val (q, r) = BigInt(10) /% 3 //说明  q = BigInt(10) / 3 r = BigInt(10) % 3
    val arr = Array(1, 7, 2, 9)
    val Array(first, second, _*) = arr // 提出arr的前两个元素
    println(first, second)


    // map
    val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
    for ((k, v) <- map) {
      println(k + " -> " + v)
    }
    //说明  相当于过滤
    for ((k, 0) <- map) {
      println(k + " --> " + 0)
    }
    //说明 相当于过滤
    for ((k, v) <- map if v == 0) {
      println(k + " ---> " + v)
    }


  }
}


