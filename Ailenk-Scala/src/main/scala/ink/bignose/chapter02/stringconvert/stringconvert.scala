package ink.bignose.chapter02.stringconvert

object stringconvert {
  def main(args: Array[String]): Unit = {
    // 基本语法转换
    var str1 = true + ""
    var str2 = 4.5 + ""
    var str3 = 100 + ""

    // toString

    var s2= "12"
    val num1 = s2.toInt
    val num2 = s2.toByte
    val num3 = s2.toShort

    //转换过程中 类型转换成有效数据

    var s3 = "hello"
//    println(s3.toInt)

    var s4 = "12.5"
    println(s4.toDouble)//Ok
   println(s4.toInt) //error

  }
}
