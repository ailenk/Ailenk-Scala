package ink.bignose.chapter11.scala

/**
  * @Author :bignose
  * @Date: 2017/8/9 18:40
  */
object TestHighOrderDef01 {
  def main(args: Array[String]): Unit = {
    val res = test(sum, 6.0)

    val res2 = test(sum _, 6.0)

    println("res=" + res)
    // 将函数给一个变量  不执行函数
    // res2 执行
    //    res2
//    println("res2=" + res2)

  }

  // Double => Double 接受一个函数 返回一个函数 ，
  //2.  f(n1)执行你传入的函数
  def test(f: Double => Double, n1: Double) = {
    f(n1)
  }

  // 普通的 函数
  def sum(d: Double): Double = {
    d + d
  }



}
