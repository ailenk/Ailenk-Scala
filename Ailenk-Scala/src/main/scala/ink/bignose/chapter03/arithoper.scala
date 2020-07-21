package ink.bignose.chapter03

object arithoper {

  def main(args: Array[String]): Unit = {
    var r1: Int = 10 / 3
    var r2: Double = 10 / 3
    var r3: Double = 10.0 / 3
    println("re1" + r1)
    println("re2" + r1)
    println("re3" + r3)
    println("reT" + r3.formatted("%.2f"))

    //% 使用  a%b = a - a/b*b
    println(10 % 3)
    println(-10 % 3)
    println(-10 % -3)
    println(10 % -3) //1

    //scala 没有++ 没有--
    var num1 = 10
    num1 += 1
    println(num1)

    num1 -= 1
    println(num1)


  }


}
