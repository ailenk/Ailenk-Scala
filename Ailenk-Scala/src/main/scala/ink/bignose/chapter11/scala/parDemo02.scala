package ink.bignose.chapter11.scala

/**
  * @Author :bignose
  * @Date: 2017/8/10 9:42
  */
object parDemo02 {
  def main(args: Array[String]): Unit = {
    val result1 = (0 to 100).map { case _ => Thread.currentThread.getName }.distinct
    val result2 = (0 to 100).par.map { case _ => Thread.currentThread.getName }.distinct
    println(result1)
    println("_________________")
    println(result2)
  }
}
