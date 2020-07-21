package ink.bignose.chapter10.scalaDemo

object CollectionDemo {
  def main(args: Array[String]): Unit = {
    var str = "hello" //string  为char 集合
    for (item <- str) {
      println(item)
    }

  }
}
