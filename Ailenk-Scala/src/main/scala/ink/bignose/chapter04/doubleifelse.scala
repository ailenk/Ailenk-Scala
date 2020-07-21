package ink.bignose.chapter04

import scala.io.StdIn//下划线标识将scala 下所有的包一起引用

/**
  * :bignose
  * 2017/8/2 19:40
  */
object doubleifelse {


  def main(args: Array[String]): Unit = {
    println("请输入年龄")
    var age = StdIn.readInt()
    if (age > 19) {
      println("大于19")
    } else if(age < 19){
      println("小于19")
    }else{
      println("等于19")
    }

    scala.io.StdIn
  }

}
