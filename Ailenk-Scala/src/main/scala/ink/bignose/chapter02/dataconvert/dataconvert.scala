package ink.bignose.chapter02.dataconvert

object dataconvert {
  def main(args: Array[String]): Unit = {
    var n1=10
    var n2 =1.1f
    //转换再计算
    var n3 = n1 +n2

    // （byte,short） 和char 之间不会自动类型转换
    var n4 :Byte =10
    //    var char1 : Char =n4.toChar

    var num1 : Int = 10 * 3.5.toInt +  6* 1.5.toInt //36
    var num2 : Int = (10 * 3.5 + 6* 1.5).toInt //44
    println(num1)
    println(num2)


    val char1 : Char= 1
    val num3 = 1
//    val char2 : Char = num3 类型转换
  }
}
