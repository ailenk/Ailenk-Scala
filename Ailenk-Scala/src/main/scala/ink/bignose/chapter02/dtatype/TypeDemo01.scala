package ink.bignose.chapter02.dtatype

object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    var num1: Int = 10
    //1.因为Int 是一个类 所以可以使用很多方法
    //2.在 scala 中没有形参 则可以省略
    println(num1.toDouble + "111" + num1.toString+100.toByte)
   syHi
   syHi();


    //scal 一切为对象
    // anyVal anyRef 也是对象


  }

  def syHi(): Unit = {
    println("sayHi")
  }

}
