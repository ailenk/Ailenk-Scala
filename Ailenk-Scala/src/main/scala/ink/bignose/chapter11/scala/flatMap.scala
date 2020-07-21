package ink.bignose.chapter11.scala

object flatMap {

  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")
      // 将所有元素打散操作
    def upper(s:String): String = {
      s.toUpperCase
    }
    val names2 = names.map(upper)
    println("names=" + names2)

  }

}
