package ink.bignose.chapter04

import scala.io.StdIn

import scala.io._//下划线标识将scala 下所有的包一起引用

/**
  * :bignose
  * 2017/8/2 19:40
  */
object ifelse {


  def main(args: Array[String]): Unit = {
    println("请输入年龄")
    var age = StdIn.readInt()
    if (age > 19) {
      println("大于19")
    }
    if(age<20){
      println("小于19")
    }
    scala.io.StdIn
  }

}
