package ink.bignose.chapter16.highfun

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 16:48
  */
object hightfun04 {
  def main(args: Array[String]): Unit = {
    //    4、用to和reduceLeft实现阶乘函数,不得使用循环或递归
    println(factorial(3)) //1*2*3
  }

  def factorial(n: Int): Int = {
        1 to n reduceLeft ( _ * _)
//    1 to n reduceLeft ((x: Int, y: Int) => x * y)
  }
}
