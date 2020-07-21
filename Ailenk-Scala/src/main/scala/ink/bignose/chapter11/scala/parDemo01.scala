package ink.bignose.chapter11.scala

/**
  * @Author :bignose
  * @Date: 2017/8/10 9:38
  */
object parDemo01 {
  def main(args: Array[String]): Unit = {
    // 利用CPU 速度 大约是cpu 核倍数
    (1 to 10000).foreach(println(_))
    println()
    // 输出结果无序  说明任务分配给了 不同的cpu
    (1 to 10000).par.foreach(println(_))





  }
}
