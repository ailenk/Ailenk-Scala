package ink.bignose.chapter16.highfun

/**
  * @Author :Ailenk
  * @Date: 2017/7/13 16:48
  */
object hightfun05 {
  def main(args: Array[String]): Unit = {
    //    5、编写函数largest(fun:(Int)=>Int,inputs:Seq[Int]), //高阶函数fun:(Int)=>Int 方法inputs:Seq[Int] 序列
    //    输出在给定输入序列中给定函数的最大值。
    //    举例来说，largest(x=>10x-xx,1 to 10)应该返回25.不得使用循环或递归
    val maxVal = largest(x => 10 * x - x * x, 1 to 10).equals()
    println(maxVal)
  }

  def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
    //    inputs.map((n: Int) => fun(n)).max
    inputs.map(fun(_)).max
  }
}
