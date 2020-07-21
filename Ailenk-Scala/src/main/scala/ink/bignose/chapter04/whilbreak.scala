package ink.bignose.chapter04

import util.control.Breaks._

/**
  * :bignose
  * 2017/8/3 10:09
  */
object whilbreak {
  def main(args: Array[String]): Unit = {
    //    var n = 1
    //    breakable(
    //      while (n <= 20) {
    //        println("nnn" + n)
    //        n += 1
    //        if (n == 15) {
    //          //  def break(): Nothing = { throw breakException }  扔出去一个异常
    //          break()
    //        }
    //      }
    //      )
    println("nnnnnnnnnnnnnnnnn")
    //breakable  高阶函数  能够接受函数的函数
    // op: => Unit  接受的参数 是一个没有输入也没有返回值的函数 op代码块
    //breakable 对代码块 抛出的异常做了捕获 breakcontrol 小括号改为大括号
    // brake 抛出异常 一般把
    /*
      def breakable(op: => Unit) {
        try {
          op
        } catch {
          case ex: BreakControl =>
            if (ex ne breakException) throw ex
        }
      }
   */
    //    //contiune 使用循环守卫
    //    for (i <- 1 to 10 if (i != 2 && i != 3)) {
    //      println("i=" + i)
    //    }
    //
    //    for (i <- 1 to 10 ) {
    //      if (i != 2 && i != 3){
    //        println("i=" + i)
    //      }
    //
    //    }

    var sum = 1
    for (i <- 1 to 100 if i < 20) {
      sum += i
     println(sum)
    }

  }


}
