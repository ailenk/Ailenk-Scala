package ink.bignose.chapter09.impicit

object ImplociteDemo03 {
  implicit val str1: String = "jack"

  def main(args: Array[String]): Unit = {
    def hello(implicit name: String): Unit = {
      println(name + " hello")
    }
   hello
  }


}



