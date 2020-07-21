package ink.bignose.chapter05.exces

object excecise {

  def main(args: Array[String]): Unit = {
    print(9)
  }

  //编写函数 输出99乘法表
  def print(n: Int): Unit = {
    for (i <- 1 to n) {
      for (j <- 1 to i) {
        printf("%d+%d=%d\t", j, i, j * i)
      }
      println()
    }
  }




}
