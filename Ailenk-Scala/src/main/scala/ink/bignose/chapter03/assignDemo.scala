package ink.bignose.chapter03

object assignDemo {

  //位移
  def main(args: Array[String]): Unit = {
    var num = 2
    num <<= 2
    println("num=" + num)
    num >>= 3
    println("num=" + num)

    var a = 10
    var b = 99
    println("a=" + a + "b=" + b)

    val t = a
    a = b
    b = a
    println("a=" + a + "b=" + b)

    var res = {
      if (num > 1) "hello,ok" else 100
    }
    println("res=" + res)
  }

  //a与b 要求交换 单不允许 中间变量
  var a = 10
  var b = 20
  a = a + b
  b = a - b
  a = a - b
  println("a=" + a + "b" + b)


}
