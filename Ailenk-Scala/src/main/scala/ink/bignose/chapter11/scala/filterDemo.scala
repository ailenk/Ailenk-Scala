package ink.bignose.chapter11.scala

/**
  * @Author :bignose
  * @Date: 2017/8/9 19:36
  */
object filterDemo {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick")

    def startA(s:String): Boolean = {
      s.startsWith("A")
    }

    val names2 = names.filter(startA)
    println("names=" + names2)



  }
}
