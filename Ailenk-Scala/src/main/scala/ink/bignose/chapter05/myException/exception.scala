package ink.bignose.chapter05.myException

object exception {
  def main(args: Array[String]): Unit = {
    try {
      val r = 10 / 0
    } catch {
      //scala 只有一种异常 每个异常有多个case
      //ex 是对改样的处理代码 可以是一个代码块
      case ex: ArithmeticException=>{
        println("捕获了除数为零的算数异常")
      }
      case ex: Exception => {
        println("捕获了异常")
      }
    } finally {
      // 最终要执行的代码
      println("scala finally...")
    }
  }



}
