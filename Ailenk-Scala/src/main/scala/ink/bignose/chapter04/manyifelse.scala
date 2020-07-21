package ink.bignose.chapter04

import scala.io.StdIn
//下划线标识将scala 下所有的包一起引用

/**
  * :bignose
  * 2017/8/2 19:40
  */
object manyifelse {


  def main(args: Array[String]): Unit = {
    println("请输入年龄")
    var age = StdIn.readInt()
    if (age == 100) {
      println("宝马")
    } else if (age > 90) {
      println("妹子")
    } else if (88 > age && age > 80) {
      println("大妈")
    } else {
      println("骨灰盒")
    }

    scala.io.StdIn
  }

}
