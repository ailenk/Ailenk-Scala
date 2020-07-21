package ink.bignose.chapter12

/**
  * @Author :bignose
  * @Date: 2017/8/10 10:00
  */
object MatchDemo {
  def main(args: Array[String]): Unit = {
    //match 类似switch
    // 只有一个入口 匹配到哟个就会执行
    //  不用break 自动会退出
    //如果一个 都没匹配到 则用 _
    // 如果媒体配就会异常
    val oper = '#'
    val n1 = 20
    val n2 = 10
    var res = 0
    oper match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case _ => println("oper error")
    }
    println("res=" + res)


    for (ch <- "+-3!") {
      var sign = 0
      var digit = 0
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        // 说明..
        case _ if ch.toString.equals("3") => digit = 3
        case _ => sign = 2
      }
      println(ch + " " + sign + " " + digit)
    }


  }
}
