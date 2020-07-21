package ink.bignose.chapter12

/**
  * @Author :bignose
  * @Date: 2017/8/10 10:31
  */
object MatchDeme02 {
  def main(args: Array[String]): Unit = {
    val ch = 'V'
    ch match {
      case '+' => println("ok~")
      case mychar => println("ok~" + mychar)
      case _ => println ("ok~~")
    }




    // 类型匹配
    val a = 1
    val obj = if(a == 1) 1
    else if(a == 2) "2"
    else if(a == 3) BigInt(3)
    else if(a == 4) Map("aa" -> 1)
    else if(a == 5) Map(1 -> "aa")
    else if(a == 6) Array(1, 2, 3)
    else if(a == 7) Array("aa", 1)
    else if(a == 8) Array("aa")


    val result = obj match {
      case a : Int => a
      case b : Map[String, Int] => "对象是一个字符串-数字的Map集合"
      case c : Map[Int, String] => "对象是一个数字-字符串的Map集合"
      case d : Array[String] => "对象是一个字符串数组"
      case e : Array[Int] => "对象是一个数字数组"
      case f : BigInt => Int.MaxValue
      case _ => "啥也不是"
    }
    println("result"+result)


  }

}
