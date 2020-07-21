package ink.bignose.chapter05.functiondetail

object detail03 {
  def main(args: Array[String]): Unit = {
    def f1(): Unit = { //私有函数
      println("定义")
    }
    def sayOk(): Unit = {
      println("sayOk")
      def sayOk(): Unit = {
        println("sayOk中sayOk")
      }
    }
    println(sayOk2("2"))
  }

  def sayOk(): Unit = { //共有函数
    println("sayOk")
  }

  def sayOk2(name : String = "jack"): String = {
    return name + " ok! "
  }

}
